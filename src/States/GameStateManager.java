package States;

import java.awt.Graphics;
import java.util.ArrayList;

public class GameStateManager {
	//ArrayList gt.values();
	
	GameState gt = GameState.MENU;
	private int currentState;
	
	public GameStateManager() {
	}
	
	public void draw(Graphics g) {
		switch(gt) {
		case MENU:
			System.out.println("MenuState");
			break;
		case RUNNING:
			System.out.println("runningState");
			break;
		case PAUSE:
			System.out.println("PasueState");
			break;
		}
	}
	
	public void update() {
		for(GameState gs : GameState.values()) {
			
		};
	}
	
	public void setCurrentState(int state) {
		currentState = state;
	}
	
	public int getCurrentState() {
		return currentState;
	}
}
