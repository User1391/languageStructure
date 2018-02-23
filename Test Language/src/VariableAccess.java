import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class VariableAccess {

	private static Scanner variableScanner;

	public static int accessIntVariable(String Name) {
		String stringVal;
		int value = 0;
		
		try {
			variableScanner = new Scanner(new FileReader(Name + ".txt"));
			 StringBuilder sbVariable = new StringBuilder();
			 while(variableScanner.hasNext()) {
				 sbVariable.append(variableScanner.next());
			 }
			stringVal = sbVariable.toString();
			value = Integer.parseInt(stringVal);
			variableScanner.close();
			return value;
			} catch (FileNotFoundException e) {
			System.out.println("Access Int Variable Error: Invalid variable '" + Name + "'");
		}
		return value;
		
		
		
	}
	
	
}
