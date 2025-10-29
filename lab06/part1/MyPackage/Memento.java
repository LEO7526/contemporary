package MyPackage;

public class Memento {
  private int mystate;
  private MyPackage.MyClass mc;

  public Memento(MyPackage.MyClass mc) {
    this.mc = mc;
    this.mystate = mc.getState(); // use getter
  }

  public void restore() {
    mc.setState(mystate); // use setter
  }
}