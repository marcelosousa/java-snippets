package dev.marcelo.dep;

public class DummyAPI {
  private int num;


  public DummyAPI(int num) {
    // This is version 4.0
    this.num = num + 3;
  }

  public int getNum() {
    return num;
  }
}
