import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Vector;

public class DeleteShapeCommand implements Command {

  private Vector<Shape> shapes;
  private Shape shape;
  private int index;

  public void execute() throws Exception {
    System.out.println("DeleteShapeCommand: execute()");
    shape = shapes.get(index);
    shapes.remove(shape);
  }

  public DeleteShapeCommand(Vector<Shape> shapes, int index) {
    this.index = index;
    this.shapes = shapes;
  }

  public void undo() {
    System.out.println("CreateCircleCommand: undo()");
    shapes.remove(shape);
  }
}


