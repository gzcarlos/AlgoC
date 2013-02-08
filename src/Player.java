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
		// TODO Auto-generated method stub
		for(int i = 0; i < plays.size(); ++i){
			
		}
	}

	public void setPlays(List plays){
		this.plays = plays;
	}
	
	public int getPlay(int position){
		//System.out.println(plays.get(position));
		return plays.get(position);
	}
	
	

}
