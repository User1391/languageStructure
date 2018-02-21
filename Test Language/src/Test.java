

	import java.io.*;
import java.util.Scanner;

	public class Test {
	    public static void main(String [] args)  {
	    	/** Gets input from text file **/
	    	String fileName = "temp.txt";
	    	Scanner in = null;
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
		    		
		    		for (int word = 0; word < words.length; word++) {
		    		System.out.print(words[word] + " ");
		    		}
		    		//To print next command on next line since the "say" uses print not println
		    		System.out.println("");

	    			break;
	    		}
	    		
	    		}
	    	}
	    }
	}


