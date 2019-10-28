/////////////////////
// Public API - Generic Functions
/////////////////////


endpoint.check = function (captcha) {
    var res = endpoint.checkCaptcha(captcha);
    if(res.status == 'success') {
        return true;
    }

    return false;
};

endpoint.checkCaptcha = function (captcha) {
    var config = {
        captcha: captcha
    };
    return endpoint._checkCaptcha(config);
};