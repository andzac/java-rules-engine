package it.andzac.example.rengine;

public class Result {
  String methodInvoked;
  boolean isExecuted;

  public Result(boolean isExecuted, String methodInvoked) {
    this.isExecuted = isExecuted;
    this.methodInvoked = methodInvoked;
  }

  public String getMethodInvoked() {
    return this.methodInvoked;
  }

  public boolean isMethodExecuted() {
    return isExecuted;
  }
}
