import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Vector;

public class CreateCircleFactory implements CommandFactory{

  private Vector<Shape> shapes;

  public Command create() throws Exception {
    System.out.println("CreateCircleFactory: create");

    System.out.print("Enter radius: ");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    int radius = Integer.parseInt(line);
    return new CreateCircleCommand(shapes,radius);
  }

  public void setShapes(Vector<Shape> shapes) {
    this.shapes = shapes;
  }
}
