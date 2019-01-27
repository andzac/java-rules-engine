package it.andzac.example.rengine;

public class RuleThree implements Rule {
  private boolean isOk = false;

  @Override
  public boolean evaluate(Expression expression) {
    int val = expression.getValue();

    if (val > 0 && val <= 6) {
      System.out.println("RULE THREE EXECUTED - VALUE = " + isOk);
      if (val == 3) isOk = true;
    } else {
      System.out.println("Rule three not executed...");
    }
    return isOk;
  }

  @Override
  public Result getResult() {
    return new Result(isOk, "RuleThree");
  }
}
