import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Variable {

	public static void createIntVariable(String name, int intValue ) {
		String value = "" + intValue;
		File variableFile = new File(name + ".txt");
		 try {
			 FileWriter writer = new FileWriter(variableFile);
			 writer.write(value);
			 writer.close();
			variableFile.deleteOnExit();
			
		 } catch (IOException e) {
			 System.out.println("Creating variable '" + name + "' has failed.");
			 e.printStackTrace();
			  }
		 
	}
	
	
}
