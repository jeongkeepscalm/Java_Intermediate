package lang.string.chaining;

public class ValueAdder {

  private int value;

  public ValueAdder add(int num) {
    this.value += num;
    return this;
  }
  public int getValue() {
    return value;
  }

}
