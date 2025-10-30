import java.util.Vector;

public class Caretaker {
  private Vector<AccountMemento> undoList;

  public Caretaker() {
    undoList = new Vector<AccountMemento>();
  }

  public void saveAccount(Account account) {
    AccountMemento  m = new AccountMemento(account);
    undoList.add(m);
  }

  public void restore() {
    if (!undoList.isEmpty()) {
      AccountMemento m = undoList.lastElement();
      m.restore();
      undoList.removeElement(m);
    }
  }
}