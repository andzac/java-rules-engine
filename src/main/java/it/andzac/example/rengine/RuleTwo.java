package it.andzac.example.rengine;

public class RuleTwo implements Rule {
  private boolean isOk = false;

  @Override
  public boolean evaluate(Expression expression) {

    int val = expression.getValue();

    if (val > 6 && val <= 10) {
      System.out.println("RULE TWO EXECUTED - VALUE = " + isOk);
    } else {
      System.out.println("Rule two not executed...");
    }

    return isOk;
  }

  @Override
  public Result getResult() {
    return new Result(isOk, "RuleTwo");
  }
}
