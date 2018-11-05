import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class Panel extends JPanel {
	
	public static Graphics g;
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		this.g = g;
		
		
		for(Circle c : Circle.circles) {
			g.setColor(c.getColor());
			g.fillOval(c.x, c.y, c.size, c.size);
		}
		
		for(Oval o : Oval.ovales) {
			g.setColor(Color.BLUE);
			g.fillOval(o.x, o.y, o.width, o.height);
		}
		
		if(CircleClickListener.mouseDragged){
            int x, y;
            int w, h;
             
            if(CircleClickListener.mouseX > CircleClickListener.mouseX_dragged){
                x = CircleClickListener.mouseX_dragged;
                w = CircleClickListener.mouseX - CircleClickListener.mouseX_dragged;
            }else{
                x = CircleClickListener.mouseX;
                w = CircleClickListener.mouseX_dragged - CircleClickListener.mouseX;
            }
             
            if(CircleClickListener.mouseY > CircleClickListener.mouseY_dragged){
                y = CircleClickListener.mouseY_dragged;
                h = CircleClickListener.mouseY - CircleClickListener.mouseY_dragged;
            }else{
                y = CircleClickListener.mouseY;
                h = CircleClickListener.mouseY_dragged - CircleClickListener.mouseY;
            }
             
            g.drawOval(x, y, w, h);
        }else{
            g.fillOval(CircleClickListener.mouseX-5, CircleClickListener.mouseY-5, 10, 10);
        }
		repaint();
	}
}