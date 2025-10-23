package MyPackage;

public class Memento {
  private int mystate;
  MyClass mc;

  public Memento(MyPackage.MyClass mc) {
    this.mc = mc;
    mystate = mc.state; // save originator’s state
  }

  public void restore() {
    mc.state = mystate;
  }
}