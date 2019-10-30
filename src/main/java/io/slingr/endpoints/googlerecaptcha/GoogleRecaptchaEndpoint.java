package io.slingr.endpoints.googlerecaptcha;

import io.slingr.endpoints.Endpoint;
import io.slingr.endpoints.framework.annotations.EndpointFunction;
import io.slingr.endpoints.framework.annotations.EndpointProperty;
import io.slingr.endpoints.framework.annotations.SlingrEndpoint;
import io.slingr.endpoints.utils.Json;
import io.slingr.endpoints.ws.exchange.FunctionRequest;
import org.apache.log4j.Logger;

/**
 * <p>Google Recaptcha endpoint
 * <p>
 * <p>Created by hpacini on 28/10/19.
 */
@SlingrEndpoint(name = "google-recaptcha")
public class GoogleRecaptchaEndpoint extends Endpoint {

    private static final Logger logger = Logger.getLogger(GoogleRecaptchaEndpoint.class);

    private ReCaptchaClient reCaptchaClient;

    @EndpointProperty
    private String recaptchaSecret;

    @Override
    public void endpointStarted() {
        this.reCaptchaClient = new ReCaptchaClient(recaptchaSecret);
    }

    @EndpointFunction(name = "_validateToken")
    public Json validateToken(FunctionRequest request) {

        Json body = request.getJsonParams();
        String token = body.string("token");

        return this.reCaptchaClient.checkCaptcha(token);
    }
}
