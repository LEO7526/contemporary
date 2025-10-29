import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Vector<Shape> shapes = new Vector<>();
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		Stack<Command> commandStack = new Stack<>();
		CommandFactory f;

		// Factory class names
		String[] factoryName = {
				"DrawShapeFactory",
				"DeleteShapeFactory",
				"CreateCircleFactory",
				"CreateRectangleFactory"
		};

		CommandFactory[] factory = new CommandFactory[factoryName.length];
		try {
			for (int i = 0; i < factoryName.length; i++) {
				factory[i] = (CommandFactory) Class.forName(factoryName[i]).newInstance();
				factory[i].setShapes(shapes);   // fixed: use factory[i], not factoryName[i]
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		while (true) {
			try {
				System.out.println("0 = exit, 1 = undo, 2 = draw all shapes, " +
						"3 = delete a shape, 4 = create circle, 5 = create rectangle");
				System.out.print("Enter option: ");
				String line = br.readLine();
				int option = Integer.parseInt(line);
				Command c;

				switch (option) {
					case 0:
						System.out.println("-- End --");
						System.exit(0);

					case 1: // Undo
						if (!commandStack.isEmpty()) {
							Command last = commandStack.pop();
							last.undo();
						} else {
							System.out.println("Nothing to undo");
						}
						break;

					case 2: // Draw all shapes
						f = new DrawShapeFactory();
						f.setShapes(shapes);
						c = f.create();
						c.execute();
						break;

					case 3: // Delete shape
						System.out.print("Enter index of shape: ");
						int index = Integer.parseInt(br.readLine());
						f = new DeleteShapeFactory();
						f.setShapes(shapes);
						c = f.create();   // factory itself will ask for index
						c.execute();
						commandStack.push(c);
						break;

					case 4: // Create circle
						f = new CreateCircleFactory();
						f.setShapes(shapes);
						c = f.create();
						c.execute();
						commandStack.push(c);
						break;

					case 5: // Create rectangle
						f = new CreateRectangleFactory();
						f.setShapes(shapes);
						c = f.create();
						c.execute();
						commandStack.push(c);
						break;

					default:
						throw new Exception("Invalid Option");
				}
			} catch (Exception e) {
				System.out.println("*** " + e.getMessage());
			}
			System.out.println();
		}
	}
}