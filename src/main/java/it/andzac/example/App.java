package it.andzac.example;

import it.andzac.example.rengine.Expression;
import it.andzac.example.rengine.Result;
import it.andzac.example.rengine.RuleEngine;

/** Hello world! */
public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");

    System.out.println("########### RULE ENGINE EXAMPLE ##########");

    boolean ok = false;
    int i = 73;

    while (i > 0 && !ok) {
      System.out.println("Actual value of i is:" + i);
      RuleEngine engine = new RuleEngine();
      Expression expression = new Expression(i);
      Result result = engine.process(expression);
      ok = result.isMethodExecuted();
      System.out.println("########### Actual value of ok = " + ok + " ###########");
      i--;
    }
  }
}
