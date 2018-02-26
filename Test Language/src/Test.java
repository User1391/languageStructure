import java.io.*;
import java.util.Vector;
import java.util.Scanner;

	public class Test {
	    public static void main(String [] args)  {
	    	/** Gets input from text file **/
	    	String fileName = "temp.txt";
	    	Scanner in = null;
	    	Scanner variableScanner = null;
			try {
				in = new Scanner(new FileReader(fileName));
			} catch (FileNotFoundException e) {
				System.out.println("Error: File " + fileName + " has not been found. Try adjusting the file address, or moving the file to the correct location." );
				e.printStackTrace();
			}
	    	int charNum = 0;
	    	//Creates a vector which has no size limit
	    	Vector code = new Vector();
	    	while(in.hasNext()) {
	    	    code.addElement(in.next());	
	    	}
	    	//This method always seperates each word
	    	//But the append method ignores spaces
	    	in.close();
	    	
	    	System.out.println(code);	 
	    
	    	StringBuilder parser = new StringBuilder();
	    	
	    	int commandIndex = 0;
	    	int variableNameIndex;
	    	int variableNameLength;
	    	int commandLength;
	    	
	    	//The parser seperates each command by detecting for / and 
	    	//And then clears after each execution of the command
	    	for (int i = 0; i < code.size(); i++) {
	    		variableNameIndex = commandIndex + 1;
	    	if (code.elementAt(i).toString().endsWith("/") == false) {
	    	    parser.append(code.elementAt(i) + " ");
	    	} else {
	    //This appends the last word with the / on it
	    	parser.append(code.elementAt(i));

	    		
	    		variableNameLength = code.elementAt(variableNameIndex).toString().length();
	    		commandLength = code.elementAt(commandIndex).toString().length();
	    	
	    		
	    		switch (code.elementAt(commandIndex).toString()) { 
	    		
	    		case "say": {
	    			//Detects if the phrase is surrounded by quotes and if not
	    			//searches for a variable
	 
	    			if (parser.substring(4,parser.length()).startsWith("'") && parser.substring(4,parser.length()-1).endsWith("'")) {
	    				System.out.println(parser.substring(5,parser.length()-2));
	    				
	    			} else {
	    				try {
		    				variableScanner = new Scanner(new FileReader(parser.substring(4,parser.length()-1) + ".txt"));
		    				StringBuilder sbVariable = new StringBuilder();
		    		    	while(variableScanner.hasNext()) {
		    		    		System.out.print(variableScanner.next() + " ");
		    		    		
		    		    	}
		    		    	System.out.println(" ");
		    			} 
		    			catch (FileNotFoundException e) {
		    				System.out.println("Error: File " + fileName + " has not been found. Try adjusting the file address, or moving the file to the correct location." );
		    				e.printStackTrace();
		    		    		}
	    			}
	    			
		    		
		    		

	    			break;
	    		}
	    		case "var": {
	    			
	                 
	    				 File variableFile = new File(code.elementAt(variableNameIndex).toString() + ".txt");
	    				//Creates a new file with the name of the variable
	    				 try {
	    					 FileWriter writer = new FileWriter(variableFile);
		    				 writer.write(parser.substring(commandLength + variableNameLength + 4, parser.length()-1));
						writer.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
	    				 
	    				 
	    			
	    
	    		}
	    		}
	    		parser.delete(0, parser.length());
	    		commandIndex = i+1;
	    	
	    	}
	    	}
	    }
	}
	


