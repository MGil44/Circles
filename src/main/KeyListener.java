package main;
import java.awt.event.KeyEvent;

public class KeyListener implements java.awt.event.KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			//Pfeitaste nach oben
		
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			//Pfeiltaste nach unten
		
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

}
