

	import java.io.*;
import java.util.Scanner;

	public class Test {
	   
		public static void main(String [] args)  {
			
			String name = "x";
			Variable.createIntVariable(name, 4);
			
			
	    	System.out.println(VariableAccess.accessIntVariable(name));
			
			
			/** Gets input from text file **/
	    	//defines file name for use
			String fileName = "temp.txt";
	    	
			//try-catches for file location
	    	Scanner fullIn = null;
	    	try {
	    		fullIn = new Scanner(new FileReader(fileName));
	    	} catch (FileNotFoundException e) {
	    		System.out.println("File Error : ");
	    	}
	    	Scanner in = null;
	    	try {
				in = new Scanner(new FileReader(fileName));
			} catch (FileNotFoundException e) {
				
				System.out.println("Error: File " + fileName + " has not been found. Try adjusting the file address or moving the file to the correct location." );
				e.printStackTrace();
			}
	    	
	    	
	    	
			//finds the amount of blocks in the file
			int blockCount = 0;
			for (;in.hasNext() == true;in.next()) {
				blockCount++;
				}
			
	    	
			
			
			//adding "" to every value of stringArray for each block in the file; created template for populating
			String[] stringArray = new String[blockCount];
			for (int x = 0; x == blockCount;x++) {
				stringArray[x] = "";
			}
			
			//we are done with first scanner
			in.close();
			
		
			
	    	//populating array with individual blocks
	     for(int x = 0; x < blockCount; x++) {
	    	
	    	 stringArray[x]=fullIn.next();
	    	   
	    	  }
	     
	     //we are done with second scanner
	     fullIn.close();
	     //for later
	     Scanner reader;
	    boolean isLast;
	     for (int i = 0; i < stringArray.length; i++) {
			isLast = true;
	    	 String currWord = stringArray[i].trim();
	    	 int nextNew = i+1;
	    	 String nextWord = stringArray[nextNew].trim();
	    	 String thirdWord = stringArray[nextNew+1].trim();
	    	 if (stringArray.length != i) {
	    		 isLast = false;
	    	 }
	    	 String quotes = "\""; 
	    	
	    	if (isLast == false) {
			if (currWord.equalsIgnoreCase("say") && nextWord.startsWith(quotes) && nextWord.endsWith(quotes)) {
				System.out.println(nextWord.substring(1, nextWord.length()-1));
			}
			if (currWord.equalsIgnoreCase("lnsay") && nextWord.startsWith(quotes) && nextWord.endsWith(quotes)){
			
				System.out.print(nextWord.substring(1, nextWord.length()-1) + " ");
			}
			 if (currWord.equalsIgnoreCase("get")) {
				 reader = new Scanner(System.in);  // Reading from System.in
				 System.out.println("Enter a number: ");
			//	 int n = reader.nextInt(); // Scans the next token of the input as an int
				 //once finished
				 reader.close(); 
			}
			 
			 if (currWord.equalsIgnoreCase("int")) {
				
				
			 }
			 
	    	}
	     
	     
	     
	     
	    	}
	    }
	}
	


