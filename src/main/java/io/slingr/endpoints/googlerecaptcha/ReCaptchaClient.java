package io.slingr.endpoints.googlerecaptcha;

import io.slingr.endpoints.services.rest.RestClient;
import io.slingr.endpoints.utils.Json;

import javax.ws.rs.client.WebTarget;

public class ReCaptchaClient extends RestClient {

    private static String SECRET = "secret";
    private static String RESPONSE = "response";
    private static String API_URL = "https://www.google.com/recaptcha/api/siteverify";

    private String secret;

    public ReCaptchaClient(String secret){
        super(API_URL);
        this.secret = secret;
        setupDefaultHeader("Content-Type", "application/x-www-form-urlencoded");
    }

    public Json checkCaptcha(String captcha) {

        Json body = Json.map();
        body.set(SECRET, secret);
        body.set(RESPONSE, captcha);

        WebTarget target = getApiTarget().path("");

        Json res = post(target, body);

        if (!res.bool("success")) {
            Json endpResp = Json.map();
            endpResp.set("status", "error");
            endpResp.set("message",  res.json("error-codes").toString());
            return endpResp;
        }

        return res.set("status", "success");
    }
}