import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CircleClickListener implements MouseListener {
	int changecolor = 0;

	@Override
	public void mousePressed(MouseEvent e) {
		int x = e.getX(), y = e.getY();
		//add Circle
		if(e.getButton() == MouseEvent.BUTTON1 ) {
			//Rechtsklick
			Color color = Circle.colors[changecolor];
			changecolor++;
			
			if(changecolor > Circle.colors.length -1) {
				changecolor = 0;
			}
			Circle.circles.add(new Circle(x - 25, y - 25, 50, color));
		}
		
		if(e.getButton() == MouseEvent.BUTTON2 ) {
			//Mausrad
			
		}
		//remove Circle when mouse on circle
		if(e.getButton() == MouseEvent.BUTTON3 ) {
			//Linksklick
			for(Circle c : Circle.circles) {
				int circlex = c.getX();
				int circley = c.getY();
				
				if(x >= circlex && x <= circlex + c.getSize()) {
					if(y >= circley && y <= circley + c.getSize()) {
						for(int i = 0; i < Circle.circles.size(); i++) {
							if(circlex == Circle.circles.get(i).getX()) {
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
}
