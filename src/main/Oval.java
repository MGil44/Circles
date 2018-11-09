package main;
import java.awt.Color;
import java.util.ArrayList;

public class Oval {
	public int x, y, width, height;
	public Color color;
	
	public static ArrayList<Oval> ovales = new ArrayList<>();

	public Oval(int x, int y, int width, int height, Color color) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;		
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
	
	public int getwidth() {
		return width;
	}

	public void setwidth(int width) {
		this.width = width;
	}
	
	public int getheight() {
		return height;
	}

	public void setheight(int height) {
		this.height = height;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public static ArrayList<Oval> getOvales() {
		return ovales;
	}

	public static void setOvales(ArrayList<Oval> ovales) {
		Oval.ovales = ovales;
	}
	
	
}
