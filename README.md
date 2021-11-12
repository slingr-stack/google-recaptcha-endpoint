---
title: Google recaptcha endpoint
keywords: 
last_updated: October 29, 2019
tags: []
summary: "Detailed description of the API of the Google recaptcha endpoint."
---

## Overview


The Google Recaptcha endpoint allows to validate a given token server.


## Configuration

In order to use the Google Recaptcha endpoint you must create an app in the [Google Recaptcha Console](https://www.google.com/recaptcha/intro/v3.html)
by following these instructions:

- Access to Google Recaptcha Console
- Register a new site.
- Enter Label 
- Choose recaptch type
- Set allowed domains
- Accept Terms of Service
- That will give you the `Site Key` and `Site Secret` values.  

### Site Secret

Use this secret key for communication between your site and reCAPTCHA..


## Quick start

The Google Recaptcha endpoint allows direct access to the API. You can validate a given token:

```js
var res = app.endpoints.googlerecaptcha.validate("yourtokenhere");
if(res.status === 'error') {
    // you can check res.message to see possible errors
    // manage the error
} 

// res.status === 'success'

```

## About SLINGR

SLINGR is a low-code rapid application development platform that accelerates development, with robust architecture for integrations and executing custom workflows and automation.

[More info about SLINGR](https://slingr.io)

## License

This endpoint is licensed under the Apache License 2.0. See the `LICENSE` file for more details.
