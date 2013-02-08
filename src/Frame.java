
public class Frame {
	
	private int  firstPlay;
	private int secondPlay;
	private int thirdPlayFinalFrame;
	private int totalPlay;
	private boolean finalFrame = false;

	
	public Frame(){
	}

	
	public void setFirstPlay(int play){
		firstPlay = play;
	}
	
	public void setSecondPlay(int play){
		secondPlay = play;
	}
	
	public void setTotalPlays(int total){
		totalPlay = total;
	}
	
	public void setThirdPlayFinalFrame(int thirdPlay)
	{// can only set this thirdPlay if the Frame is the FinalFrame
		if(finalFrame){
			thirdPlayFinalFrame = thirdPlay;
		}
	}
	
	public void setFinalFrame(boolean ff){
		finalFrame = ff;
	}
	
	public int getFirstPlay(){
		return firstPlay;
	}
	
	public int getSecondPlay(){
		return secondPlay;
	}
	
	public int getThirdPlay(){
		if(finalFrame)
			return thirdPlayFinalFrame;
		else 
			return -1;
	}
	
	public int getTotalPlay(){
		return totalPlay;
	}
	
	public boolean getFinalFrame(){
		return finalFrame;
	}
	

}
