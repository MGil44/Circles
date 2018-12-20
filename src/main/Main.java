package main;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {

	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;

	private static JFrame w;
	public static Panel panel;
	private static CircleClickListener cl;

	private static ImageIcon imgicon;

	public static void main(String[] args) {
		init();
		
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w.setSize(WIDTH, HEIGHT);
		w.setLocationRelativeTo(null);
		w.setIconImage(imgicon.getImage());
		w.setFocusable(true);
		
		w.setContentPane(panel);
		panel.setBackground(Color.BLACK);
		
		panel.addMouseListener(cl);

		panel.requestFocus();
		
		w.setVisible(true);
	}

	private static void init() {
		w = new JFrame("Circle Window");
		
		panel = new Panel();
		cl = new CircleClickListener();
		
		imgicon = new ImageIcon("D:\\Eclipse\\workspace\\Circles\\res\\Circle.png");

	}
}
