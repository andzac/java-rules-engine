package it.andzac.example.rengine;

import java.util.ArrayList;
import java.util.List;

public class RuleEngine {
  private static List<Rule> rules = new ArrayList<>();

  static {
    rules.add(new RuleOne());
    rules.add(new RuleTwo());
    rules.add(new RuleThree());
  }

  public Result process(Expression expression) {
    Result res = new Result(false, "nothing");

    for (Rule r : rules) {
      r.evaluate(expression);
      if (r.getResult().isMethodExecuted() == true) {
        res = r.getResult();
        break;
      }
    }

    return res;
  }
}
