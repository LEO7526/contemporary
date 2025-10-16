import java.util.Vector;

public class DrawShapeFactory implements CommandFactory{

  private Vector<Shape> shapes;

  @Override
  public Command create() throws Exception {
    System.out.println("DrawShapeFactory: create");
    return new DrawShape(shapes);
  }

  @Override
  public void setShapes(Vector<Shape> shapes) {
    this.shapes = shapes;
  }
}
