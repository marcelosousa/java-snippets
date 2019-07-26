package dev.marcelo.dep;

public class DummyAPI {
  private int num;


  public DummyAPI(int num) {
    this.num = num + 1;
  }

  public int getNum() {
    return num;
  }
}
