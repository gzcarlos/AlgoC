package tools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ManFile {
	private String path;
	
	
	public ManFile(){
	}
	
	public boolean isFile(String path){
		File file = new File(path);
		
		if(file.exists()){
			System.out.println(true);
			return true;
		}
		else {
			System.out.println(false);
			return false;
		}
	}
	public List LoadFile(String path){
		File file = new File(path);
		List<Integer> sNumeros = new ArrayList<Integer>();
		
		if(file.exists()){
			try{
				FileReader freader = new FileReader(file);
				BufferedReader reader = new BufferedReader(freader);
				String line;
				int l = 0;
				
				while((line = reader.readLine()) != null){
					if(esPar(l))	
						sNumeros.add(Integer.parseInt(line));
					

					System.out.println(esPar(l));
					
					++l;
				}
				
			} catch (FileNotFoundException e){
				e.printStackTrace();
			} catch (Exception e){
				e.printStackTrace();
			}// end "catch"
			
		}// end "if"
		
		return sNumeros;
	}
	
	public boolean esPar(int n){
		if (n % 2 == 0) return true;
		else return false;
	}
	
	

}
