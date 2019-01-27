package it.andzac.example.rengine;

public class RuleOne implements Rule {
  private boolean isOk = false;

  @Override
  public boolean evaluate(Expression expression) {

    int val = expression.getValue();

    if (val > 10 && val <= 73) {
      System.out.println("RULE ONE EXECUTED - VALUE = " + isOk);
    } else {
      System.out.println("Rule one not executed...");
    }

    return isOk;
  }

  @Override
  public Result getResult() {
    return new Result(isOk, "RuleOne");
  }
}
