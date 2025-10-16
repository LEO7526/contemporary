import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Stack<Command> commandStack = new Stack<>();

    // Create various Command objects
    Command[] com = new Command[5];
    com[0] = new Command1(1);
    com[1] = new Command1(2);
    com[2] = new Command1(3);
    com[3] = new Command1(4);
    com[4] = new Command1(5);

    // Execute in sequence and push to stack
    for (int i = 0; i < com.length; i++) {
      com[i].execute();
      commandStack.push(com[i]);
    }

    // Undo in reverse order
    System.out.println("---- Undoing in reverse order ----");
    while (!commandStack.isEmpty()) {
      Command c = commandStack.pop();
      c.undo();
    }
  }
}
