package MyPackage;

public class MyClass {
  private int state;

  // Add a no-arg constructor for convenience
  public MyClass() {
    this.state = 1; // default starting state
  }

  public MyClass(int state) {
    this.state = state;
  }

  public int getState() {
    return state;
  }

  public void setState(int state) {
    this.state = state;
  }

  public void doAction() {
    state++;
  }
}