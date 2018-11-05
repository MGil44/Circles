import java.awt.Color;
import java.util.ArrayList;

public class Circle {
	public int x, y, size;
	public Color color;

	public static ArrayList<Circle> circles = new ArrayList<>();
	public static Color[] colors = {Color.RED,
									Color.GREEN,
									Color.BLUE,
									Color.WHITE,
									Color.YELLOW,
									Color.CYAN,
									Color.MAGENTA,
									Color.PINK,
									Color.GRAY};

	public Circle(int x, int y, int size, Color color) {
		super();
		this.x = x;
		this.y = y;
		this.size = size;
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public static Color[] getColors() {
		return colors;
	}

	public static void setColors(Color[] colors) {
		Circle.colors = colors;
	}

	public static ArrayList<Circle> getCircles() {
		return circles;
	}
	
	public int getCirclefromList(ArrayList<Circle> cs, int index) {
		int x = cs.get(index).x;
		
		return x;
	}
}
