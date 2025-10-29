package MyPackage;

import java.util.Vector;

public class Caretaker {
  private Vector<MyPackage.Memento> undoList;

  public Caretaker() {
    undoList = new Vector<>();
  }

  public void saveMyClass(MyPackage.MyClass mc) {
    MyPackage.Memento m = new MyPackage.Memento(mc);
    undoList.add(m);
  }

  public void undo() {
    if (!undoList.isEmpty()) {
      MyPackage.Memento m = undoList.lastElement();
      m.restore();
      undoList.removeElement(m);
    }
  }
}