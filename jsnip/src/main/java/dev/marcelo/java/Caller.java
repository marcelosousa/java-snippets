package dev.marcelo.java;

import dev.marcelo.java.pck.Callee;

public class Caller {
  private int someInt;

  public Caller(int someInt) {
    this.someInt = someInt;
  }

  public int getSomeInt() {
    return someInt;
  }

  public void setSomeInt() {
    this.someInt = Callee.someInt;
  }
}
