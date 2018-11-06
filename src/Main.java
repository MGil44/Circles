import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {
	static JFrame w;
	static Panel panel;
	static CircleClickListener cl;
	private static ImageIcon imgicon;

	public static void main(String[] args) {
		init();
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w.setSize(800, 600);
		w.setLocationRelativeTo(null);
		w.setIconImage(imgicon.getImage());

		w.setContentPane(panel);
		panel.setBackground(Color.BLACK);
		panel.addMouseListener(cl);

		w.setVisible(true);
	}

	private static void init() {
		w = new JFrame("Circle Window");
		panel = new Panel();
		cl = new CircleClickListener();
		imgicon = new ImageIcon("D:\\Eclipse\\workspace\\Circles\\res\\Circle.png");
	}
}
