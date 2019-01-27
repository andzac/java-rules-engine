package it.andzac.example.rengine;

public class Expression {
  private int value;
  private String rule;

  public Expression(int value) {
    this.value = value;
  }

  public Expression(int value, String rule) {
    this.value = value;
    this.rule = rule;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public String getRule() {
    return rule;
  }

  public void setRule(String rule) {
    this.rule = rule;
  }
}
