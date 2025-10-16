import java.util.Vector;

public class DrawShape implements Command {

  private Vector<Shape> shapes;

  public void execute() throws Exception {
    System.out.println("DrawShape: execute()");
    for (int i = 0; i < shapes.size(); i++)
      ( (Shape) shapes.elementAt(i)).draw();
  }

  public DrawShape(Vector<Shape> shapes) {
    this.shapes = shapes;
  }

  public void undo() {
    System.out.println("No undo for draw shape!");
  }
}
