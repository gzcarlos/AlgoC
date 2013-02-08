
public class Frame {
	
	private int  firstPlay;
	private int secondPlay;
	private int totalPlay;
	private boolean finalFrame = false;

	
	public Frame(){
	}
	
	
	public void setFrameFirstPlay(int play){
		firstPlay = play;
	}
	
	public void setFrameSecondPlay(int play){
		secondPlay = play;
	}
	
	public void setFrameTotalPlays(int total){
		totalPlay = total;
	}
	
	public void setFinalFrame(boolean ff){
		finalFrame = ff;
	}
	
	public int getFrameFirstPlay(){
		return firstPlay;
	}
	
	public int getFrameSecondPlay(){
		return secondPlay;
	}
	
	public int getFrameTotalPlay(){
		return totalPlay;
	}
	
	public boolean getFinalFrame(){
		return finalFrame;
	}

}
