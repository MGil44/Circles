package States;

import java.awt.Graphics;
import java.util.ArrayList;

public class GameStateManager {
	private int currentState;
	
	private ArrayList<GameState> gamestates;
	
	public static final int MENUSTATE = 0;
	public static final int PLAYSTATE = 1;
	
	public GameStateManager() {
		gamestates = new ArrayList<>();
		//gamestates.add(new MenuState());
		//gamestates.add(new PlayState());
		
		currentState = MENUSTATE;
	}

	
	public void update() {
		for(GameState gs : GameState.values()) {
			
		};
	}
	
	public void draw(java.awt.Graphics2D g) {
		
	}
	
	public void setCurrentState(int state) {
		currentState = state;
	}
	
	public int getCurrentState() {
		return currentState;
	}
}
