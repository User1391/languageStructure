

	import java.io.*;
import java.util.Scanner;

	public class Test {
	   
		public static void main(String [] args)  {
	    	/** Gets input from text file **/
	    	//defines file name for use
			String fileName = "temp.txt";
	    	//try-catch for file location
	    	Scanner fullIn = null;
	    	try {
	    		fullIn = new Scanner(new FileReader(fileName));
	    	} catch (FileNotFoundException e) {
	    		System.out.println("failed.");
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
			
	    	
			
			
			//Should be adding "" to every part of stringArray for each block in the file
			String[] stringArray = new String[blockCount];
			for (int x = 0; x == blockCount;x++) {
				stringArray[x] = "";
			}
			
			//we are done with first scanner
			in.close();
			
		
			
	    	
	     for(int x = 0; x < blockCount; x++) {
	    	
	    	 stringArray[x]=fullIn.next();
	    	   
	    	  
		
	    	  	  
	    	}
	     //we are done with second scanner
	     fullIn.close();
	    
	     for (int i = 0; i < stringArray.length; i++) {
			
			if (stringArray[i].trim().toLowerCase().equals("say")) {
				System.out.println(stringArray[i+1]);
			}
			if (stringArray[i].trim().toLowerCase().equals("lnsay")){
				System.out.print(stringArray[i+1] + " ");
			}
		}
	     
	     
	     
	     
	     
	    	}
	    }
	


