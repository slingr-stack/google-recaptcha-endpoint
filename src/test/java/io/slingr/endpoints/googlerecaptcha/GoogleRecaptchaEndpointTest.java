package io.slingr.endpoints.googlerecaptcha;

import io.slingr.endpoints.utils.tests.EndpointTests;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

@Ignore("For dev purposes only")
public class GoogleRecaptchaEndpointTest {

    private static EndpointTests test;
    private static GoogleRecaptchaEndpoint endpoint;

    @BeforeClass
    public static void init() throws Exception {
        test = EndpointTests.start(new io.slingr.endpoints.googlerecaptcha.Runner(), "test.properties");
        endpoint = (GoogleRecaptchaEndpoint) test.getEndpoint();
    }


    @Test
    public void testRequest() {

    }

}
