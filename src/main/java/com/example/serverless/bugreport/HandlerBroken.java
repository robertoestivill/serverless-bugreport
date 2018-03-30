package com.example.serverless.bugreport;

import com.amazonaws.services.lambda.runtime.Context;

public class HandlerBroken extends HandlerAbstract {

  ApiResponse handle(ApiRequest apiRequest, Context context) {
    System.out.println("Request handled");
    return new ApiResponse(200);
  }
}
