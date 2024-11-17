package session4practice1exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readfilewithfinally {
	// code for reading a file 
	public static void main(String[] args) {
		String filepath="example.txt";
		readFile(filepath);

	}
	//this method is used to read character data from a file
	public static void readFile(String filepath) {
		BufferedReader reader=null;
		try {
		reader=new BufferedReader(new FileReader(filepath));
		String line;

        // Read the file line by line
        while ((line = reader.readLine()) != null) {
            System.out.println(line); // Print each line to the console
        }
		}catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			} catch (IOException e) {
				System.out.println("An error occurred while closing the file: " + e.getMessage());
				e.printStackTrace();
			}
			
		}
        
        
        
	}
}
