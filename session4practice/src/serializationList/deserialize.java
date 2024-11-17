package serializationList;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class deserialize {

	public static void main(String[] args) {
		List<person> persons=null;
		try (FileInputStream fileIn = new FileInputStream("person.ser");
			ObjectInputStream in=new ObjectInputStream(fileIn)){
			try {
				persons=(List<person>) in.readObject();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			System.out.println("deserialized list of persons");
			persons.forEach(t ->System.out.println(t));
			}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			
		
		

}
}


