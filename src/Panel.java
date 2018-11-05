import java.awt.Graphics;
import javax.swing.JPanel;

public class Panel extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(Circle c : Circle.circles) {
			g.setColor(c.getColor());
			g.fillOval(c.x, c.y, c.size, c.size);
			
		}
		repaint();
	}
}
