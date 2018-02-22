

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
				
				System.out.println("Error: File " + fileName + " has not been found. Try adjusting the file address, or moving the file to the correct location." );
				e.printStackTrace();
			}
	    	String stringArray[] = {"", "" , "", "", "", "", "", "", "", "", "", ""};
	    	
	    	int x = 0;
	    	while(in.hasNext()) {
	    	   stringArray[x] = in.next();
	    	   
	    	   System.out.println(stringArray[x]);
	    	  x++;
	    	}
	    	in.delimiter();
	    
	    	}
	    }
	


