

	import java.io.*;
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
	    	StringBuilder sb = new StringBuilder();
	    	while(in.hasNext()) {
	    	    sb.append(in.next());
	    	}
	    	
	    	
	    	in.close();
	    	String outString = sb.toString();
	    	String command = sb.toString();
	    	
	    	
	    	/** Reads code and processes commands **/
	    	String[] steplist = command.split("/");
	    	for (String step : steplist) {
	    		String[] stepParameterValues = step.split(":");
	    		
	    		int x = 0;
			/**	while (x <= stepParameterValues.length) {
					stepParameterValues[x] = stepParameterValues[x].trim().toLowerCase();
					x++;
	    		}
	    		**/
	    		
	    		switch (stepParameterValues[0]) { //.substring(0)
	    		
	    		case "say": {
	    			//Splits the string after say into words. This requires the words to be split by "-" 
	    			//in order to have spaces between the words
	    			String[] words = stepParameterValues[1].split("-");
	    			//scans for if there is a file with the name and if not just print the words
	    			try {
	    				variableScanner = new Scanner(new FileReader(stepParameterValues[1] + ".txt"));
	    				StringBuilder sbVariable = new StringBuilder();
	    		    	while(variableScanner.hasNext()) {
	    		    	    sbVariable.append(variableScanner.next());
	    		    	}
	    		    	System.out.println(sbVariable);
	    			} 
	    			catch (FileNotFoundException e) {
	    				for (int word = 0; word < words.length; word++) {
	    		    		System.out.print(words[word] + " ");
	    		    		}
	    		    		//To print next command on next line since the "say" uses print not println
	    		    		System.out.println("");
	    			}
		    		
		    		

	    			break;
	    		}
	    		case "variable": {
	    			String[] variable = stepParameterValues[1].split("=");
	
	    				 File variableFile = new File(variable[0] + ".txt");
	    				//Creates a new file with the name of the variable
	    				 try {
	    					 FileWriter writer = new FileWriter(variableFile);
		    				 writer.write(variable[1]);
						writer.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
	    				 
	    			
	    
	    		}
	    		
	    	}
	    	}
	    }
	}
	


