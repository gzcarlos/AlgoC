import java.util.ArrayList;
import java.util.List;

import tools.StdOut;


public class Player {
	
	private List<Integer> plays = new ArrayList<Integer>();
	private Frame[] playerFrame = new Frame[10];
	private int playerNo = 0;
	
	public Player(int playerNumber){
		playerNo = playerNumber;
	}
	
	private void InitializePlayer() {
		GameRules gameRule = new GameRules();
		playerFrame = gameRule.applyBowlingRules(plays);
	}

	public void setPlays(List plays){
		this.plays = plays;
	}
	
	public int getPlay(int position){
		//System.out.println(plays.get(position));
		return plays.get(position);
	}
	
	public int  getPlayerNumber(){
		return playerNo;
	}

}
