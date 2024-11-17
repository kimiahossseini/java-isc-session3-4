package exception;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Fileutils {

	public static void main(String[] args) {
		

	}
	public static void readFile(String filepath) throws FileUtilsException {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(filepath));
		} catch (FileNotFoundException e) {
			throw new FileUtilsException("file not found in reading");	
		}
		String line;
		try {
			while ((line = reader.readLine()) != null) {
			    System.out.println(line); // Print each line to the console
			}
			
		} catch (IOException e) {
			throw new FileUtilsException("an IO error occoured");	
			
		}
		finally {
			try {
				reader.close();
			} catch (IOException e) {
				throw new FileUtilsException("file reader can not be closed");	
			}
		}
	}
	public static void writeFile(String filepath,String content) throws FileUtilsException{
		BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter(filepath));
		} catch (IOException e) {
			throw new FileUtilsException("file not found in writing ");	
			
		}
		try {
			writer.write(content);
		
		} catch (IOException e) {
			throw new FileUtilsException("your content is not writable");	
			
		}finally {
			try {
				writer.close();
			} catch (IOException e) {
				throw new FileUtilsException("file writer can not be closed");
				
			}
		}
		
		
		
	}
}
