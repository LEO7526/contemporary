import java.util.Vector;

public interface CommandFactory {
  public Command create() throws Exception;
  public void setShapes(Vector<Shape> shapes);
}
