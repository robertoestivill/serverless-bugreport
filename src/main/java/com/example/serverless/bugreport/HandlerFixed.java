package com.example.serverless.bugreport;

import com.amazonaws.services.lambda.runtime.Context;

public class HandlerFixed extends HandlerAbstract {

  @Override public ApiResponse handleRequest(ApiRequest req, Context ctx) {
    return super.handleRequest(req, ctx);
  }

  ApiResponse handle(ApiRequest apiRequest, Context context) {
    return new ApiResponse(200);
  }
}
