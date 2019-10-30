/////////////////////
// Public API - Generic Functions
/////////////////////

endpoint.validate = function (token) {
    var config = {
        token: token
    };
    return endpoint._validateToken(config);
};