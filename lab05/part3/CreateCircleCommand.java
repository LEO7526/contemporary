import java.util.Vector;

public class CreateCircleCommand implements Command {

  private Vector<Shape> shapes;
  private Shape shape;
  private int radius;

  public void execute() throws Exception {
    System.out.println("CreateCircleCommand: execute");
    shape = new Circle(radius);
    shapes.add(shape);
  }

  public CreateCircleCommand(Vector<Shape> shapes, int radius) {
    this.shapes = shapes;
    this.radius = radius;
  }

  public void undo() {
    System.out.println("CreateCircleCommand: undo()");
    shapes.remove(shape);
  }
}
