import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class CircleClickListener implements MouseListener, MouseMotionListener {
	int changecolor = 0;
	int width = 30, height = 30;
	
	static int mouseX, mouseY;
	static int mouseX_dragged;
	static int mouseY_dragged;
	static boolean mouseDragged;
	
	@Override
	public void mousePressed(MouseEvent e) {
		int x = e.getX(), y = e.getY();
		// add Circle
		if (e.getButton() == MouseEvent.BUTTON1) {
			// Rechtsklick
			Color color = Circle.colors[changecolor];
			changecolor++;

			if (changecolor > Circle.colors.length - 1) {
				changecolor = 0;
			}
			Circle.circles.add(new Circle(x - 25, y - 25, 50, color));
		}

		if (e.getButton() == MouseEvent.BUTTON2) {
			// Mausrad
			int width = 30, height = 30;
			// x - width / 2, y - height / 2, width, height, Color.BLACK
			//Oval.ovales.add(new Oval(x, y, width, height, Color.BLACK));
			
			mouseX = e.getX();
            mouseY = e.getY();
            mouseDragged = false;
			
            Main.panel.repaint();
			
		}
		// remove Circle when mouse on circle
		if (e.getButton() == MouseEvent.BUTTON3) {
			// Linksklick
			for (Circle c : Circle.circles) {
				int circlex = c.getX();
				int circley = c.getY();

				if (x >= circlex && x <= circlex + c.getSize()) {
					if (y >= circley && y <= circley + c.getSize()) {
						for (int i = 0; i < Circle.circles.size(); i++) {
							if (circlex == Circle.circles.get(i).getX()) {
								Circle.circles.remove(i);
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
		mouseX_dragged = e.getX();
        mouseY_dragged = e.getY();
        mouseDragged = true;
        Main.panel.repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
	}
}
