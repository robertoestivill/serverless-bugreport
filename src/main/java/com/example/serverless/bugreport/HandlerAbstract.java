package com.example.serverless.bugreport;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public abstract class HandlerAbstract implements RequestHandler<ApiRequest, ApiResponse> {

  public ApiResponse handleRequest(ApiRequest req, Context ctx) {
    System.out.println("Request Start");
    ApiResponse response = handle(req, ctx);
    System.out.println("Request End");
    return response;
  }

  abstract ApiResponse handle(ApiRequest apiRequest, Context context);
}
