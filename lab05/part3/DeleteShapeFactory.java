import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Vector;

public class DeleteShapeFactory implements CommandFactory{

  private Vector<Shape> shapes;

  public Command create() throws Exception {
    System.out.println("DeleteShapeFactory: create");


    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    System.out.print("Enter index of the shape: ");
    int index = Integer.parseInt(line);
    if (index < 0 || index >= shapes.size()) throw new Exception("Out of Range");
    return new DeleteShapeCommand(shapes, index);
  }

  public void setShapes(Vector<Shape> shapes) {
    this.shapes = shapes;
  }
}


