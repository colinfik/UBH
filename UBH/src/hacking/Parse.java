package hacking;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;




public class Parse {
	private Scanner reader;
	
	public Parse(){
	try {
		reader = new Scanner(new File("/Users/Nick Wheeler/Desktop/recipet.txt"));
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	}
	
	
	public String total(){
		try {
			reader = new Scanner(new File("/Users/Nick Wheeler/Desktop/recipet.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		reader.findWithinHorizon(Pattern.compile("TOTAL"), 1000);
		reader.findWithinHorizon(Pattern.compile("TOTAL"), 1500);
		String totl = reader.next();
		//double Total = Double.parseDouble(total);
		return totl;
		}
	
	public String tax(){
		try {
			reader = new Scanner(new File("/Users/Nick Wheeler/Desktop/recipet.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		reader.findWithinHorizon(Pattern.compile("TAX"), 1000);
		String taxes = reader.next();
		//double tx = Double.parseDouble(taxes);
		return taxes;
	}
	
	
	
	
	
	/*public void spending(){
		
		
		while(reader.hasNext()){
			//System.out.print(reader.next());
			reader.next();
			if(reader.findInLine("TOTAL:") != null){
				//reader.nextLine();
				reader.nextLine();
				System.out.println(reader.nextLine());
			}
					
		}
	}*/
}