import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Vector;

public class CreateRectangleCommand implements Command {
  private Vector<Shape> shapes;
  private Shape shape;

  public void execute() throws Exception {
    System.out.println("CreateRectangleCommand: execute()");
    System.out.print("Enter width: ");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    int width = Integer.parseInt(line);
    System.out.print("Enter height: ");
    line = br.readLine();
    int height = Integer.parseInt(line);
    shape = new Rectangle(width, height);
    shapes.add(shape);
  }

  public CreateRectangleCommand(Vector<Shape> shapes) {
    this.shapes = shapes;
  }

  public void undo() {
    System.out.println("CreateRectangleCommand: undo()");
    shapes.remove(shape);
  }


}
