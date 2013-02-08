import java.util.List;


public class GameRules {
	Frame[] expectedFrame = new Frame[10];
	
	
	public GameRules(){
	}

	public Frame[] applyBowlingRules(List<Integer> list){
		for(int i = 0; i < 10; ++i){
			
			if(i == 9)
				expectedFrame[i].setFinalFrame(true);
			
			for (int j = 0; j < 3; ++j){// el maximo de lanzamientos en un frame es 3, para el FinalFrame
				
				//Man At Work
				if(list.get(j + 1) != null){// si el primer lanzamiento del fame es un Strike
						
				}
				//Where Works End
			}
		}
		
		
		return expectedFrame;
	}
}
