package src;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FiletoExcel {
	public static void main(String[] args) throws IOException{
		FileWriter fwriter = new FileWriter("demo.csv");
		PrintWriter outputFile = new PrintWriter(fwriter);
		
		String name = "John Doe";
		double amountOfSale = 100;
		double amountofTax= 8.75;
		outputFile.println("Name, Total, Taxed");
		outputFile.println(name + ","+amountOfSale+","+amountofTax);
		outputFile.close();
	}
}
