package dev.marcelo.java;

import dev.marcelo.java.pck.Callee;
import dev.marcelo.java.pck.MEnum;

public class Caller {
  private int someInt;
  private final MEnum e = MEnum.ENUMA;

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
