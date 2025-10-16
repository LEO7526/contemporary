public interface Command {
  void execute() throws Exception;
  void undo();
}