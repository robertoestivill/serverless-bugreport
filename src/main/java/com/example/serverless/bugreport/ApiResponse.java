package com.example.serverless.bugreport;

public class ApiResponse {

  private int statusCode;

  ApiResponse(int statusCode) {
    this.statusCode = statusCode;
  }

  @Override public String toString() {
    return "status: " + statusCode;
  }
}
