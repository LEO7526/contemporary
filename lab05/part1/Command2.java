public class Command2 implements Command {
  private int id;

  public Command2(int id) {
    this.id = id;
  }

  @Override
  public void execute() {
    System.out.println(id + " : Command2: execute()");
  }

  @Override
  public void undo() {
    System.out.println(id + " : Command2: undo()");
  }
}
