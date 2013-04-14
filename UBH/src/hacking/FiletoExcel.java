package hacking;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FiletoExcel {
	
	public void excel(String total, String tax) throws IOException{
	
		FileWriter fwriter = new FileWriter("de.csv");
		PrintWriter outputFile = new PrintWriter(fwriter);
		
		String name = "John Doe";
		double tot = Double.parseDouble(total);
		double ta = Double.parseDouble(tax);
		double amountOfSale = tot;
		double amountofTax= ta;
		outputFile.println("Name, Total, Taxed");
		outputFile.println(name + ","+amountOfSale+","+amountofTax);
		outputFile.close();
	}
}
