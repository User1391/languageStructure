

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
	    	String fileName = "temp.txt";
	    	Scanner in = null;
			try {
				in = new Scanner(new FileReader(fileName));
			} catch (FileNotFoundException e) {
				
				System.out.println("Error: File " + fileName + " has not been found. Try adjusting the file address or moving the file to the correct location." );
				e.printStackTrace();
			}
	    	
			String[] changer;
			int blockCount = 0;
			for (;!in.hasNext();in.next()) {
				blockCount++;
					
				
			}
			in.reset();
			
			String[] stringArray = null;
			for (int x = 0; stringArray.length==blockCount;x++) {
				stringArray[x] = "";
			}
			System.out.println(stringArray.length);
			
	    	
	     while(in.hasNext()) {
	    	int x = 0;
	    	 stringArray[x] = in.next();
	    	   
	    	  
			System.out.println(stringArray[x]);
	    	  x++;
	    	}
	    	
	    
	    	}
	    }
	


