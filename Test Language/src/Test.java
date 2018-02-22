

	import java.io.*;
import java.util.Scanner;
import java.awt.*;
import java.text.*;
import javax.swing.*;
import java.awt.font.*;
import java.sql.*;
	public class Test {
	   
		public static void main(String [] args)  {
	    	/** Gets input from text file **/
	    	//defines file name for use
			String fileName = "temp.txt";
	    	Scanner in = null;
			//try-catch for file location
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
			
			in.reset();
			
			String[] stringArray = new String[blockCount];
			for (int x = 0; x == blockCount;x++) {
				stringArray[x] = "";
			}
			
			
	    	
	     while(in.hasNext()) {
	    	int x = 0;
	    	 stringArray[x] = in.next();
	    	   
	    	  
			System.out.println(stringArray[x]);
	    	  x++;
	    	  
	    	  
	    	}
	    	
	    
	    	}
	    }
	


