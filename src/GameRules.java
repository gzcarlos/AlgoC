import java.util.List;


public class GameRules {
	Frame[] expectedFrame = new Frame[10];
	
	
	public GameRules(){
	}

	public Frame[] applyBowlingRules(List<Integer> list){
		for(int i = 0; i < 10; ++i){
			
			if(i == 9)
				expectedFrame[i].setFinalFrame(true);
			
			if(list.get(i) == 10){ //Si el primer lanzamiento es un Strike
				expectedFrame[i].setFirstPlay(10);
				expectedFrame[i].setSecondPlay(0);
				
				if(i == 9){//si se encuentra en el ultimo frame 
					expectedFrame[i].setTotalPlays(expectedFrame[i].getFirstPlay() + expectedFrame[i - 1].getTotalPlay());
			
				}
			}
		}
		
		
		return expectedFrame;
	}
}
