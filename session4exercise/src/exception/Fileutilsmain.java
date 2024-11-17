package exception;

public class Fileutilsmain {

	public static void main(String[] args) {
				
		try {
			Fileutils.readFile("example.txt");
			Fileutils.readFile("example1.txt");	
				
		} catch (FileUtilsException e) {		
			e.printStackTrace();
		}
		try {
			Fileutils.writeFile("example3.txt", "testing writeFile");	
		} catch (FileUtilsException e) {			
			e.printStackTrace();
		}
		try {
			Fileutils.readFile("example3.txt");
		} catch (FileUtilsException e) {
			e.printStackTrace();
		}	
		
	}

}
