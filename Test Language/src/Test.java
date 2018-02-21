

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
	    		switch (stepParameterValues[0].substring(0)) {
	    		
	    		case "say": {
	    			String print = stepParameterValues[1];
	    			System.out.println(print);
	    			break;
	    		}
	    		
	    		}
	    	}
	    }
	}


