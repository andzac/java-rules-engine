package it.andzac.example.rengine;

public interface Rule {
  boolean evaluate(Expression expression);

  Result getResult();
}
