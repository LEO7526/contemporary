import java.util.Vector;

public class CreateRectangleFactory implements CommandFactory {

    private Vector<Shape> shapes;

    @Override
    public Command create() throws Exception {
        System.out.println("CreateRectangleFactory: create");
        // Factory just creates the command; input is handled inside execute()
        return new CreateRectangleCommand(shapes);
    }

    @Override
    public void setShapes(Vector<Shape> shapes) {
        this.shapes = shapes;
    }
}