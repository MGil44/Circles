package main;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class CircleClickListener implements MouseListener, MouseMotionListener {
	int changecolor = 0;
	int width = 30, height = 30;

	@Override
	public void mousePressed(MouseEvent e) {
		int x = e.getX(), y = e.getY();
		// add Circle
		if (e.getButton() == MouseEvent.BUTTON1) {
			// Linksklick
			Color color = Circle.colors[changecolor];
			changecolor++;

			if (changecolor > Circle.colors.length - 1) {
				changecolor = 0;
			}
			Circle.circles.add(new Circle(x - 25, y - 25, 50, color));
		}

		if (e.getButton() == MouseEvent.BUTTON2) {
			// Mausrad

		}
		// remove Circle when mouse on circle
		if (e.getButton() == MouseEvent.BUTTON3) {
			// Rechtsklick
			for (Circle c : Circle.circles) {
				int circlex = c.getX();
				int circley = c.getY();

				if (x >= circlex && x <= circlex + c.getSize()) {
					if (y >= circley && y <= circley + c.getSize()) {
						for (int i = 0; i < Circle.circles.size(); i++) {
							if (circlex == Circle.circles.get(i).getX()) {
								Circle.circles.remove(i);
								//TODO if somecircle has index 1, then he need's to bee remove befor the circle who is under him.
							}
						}
					}
				}
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mouseDragged(MouseEvent e) {
	}

	@Override
	public void mouseMoved(MouseEvent e) {
	}
}
