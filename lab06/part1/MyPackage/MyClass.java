package MyPackage;

public class MyClass {
  int state;

  public MyClass(int state) {
    this.state = state;
  }

  public int getState() {
    return state;
  }

  public void doAction() {
    state++;
  }
}
