package MyPackage;

import java.util.Vector;

public class Caretaker {
  private Vector<Memento> undoList;

  public Caretaker() {
    undoList = new Vector<Memento>();
  }

  public void saveMyClass(MyClass mc){
    Memento m = new Memento(mc);
    undoList.add(m);
  }

  public void undo(){
    if(undoList.size() > 0){
      Memento m = undoList.lastElement();
      m.restore();
      undoList.removeElement(m);
    }
  }
}
