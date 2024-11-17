package serializationList;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class serialize {

	public static void main(String[] args) {
		person person1= new person("ali",30);
		person person2=new person("kimia",28);
		List<person> persons=List.of(person1,person2);
		try {
			FileOutputStream fileout=new FileOutputStream("person.ser");
			try (ObjectOutputStream out = new ObjectOutputStream(fileout)) {
				out.writeObject(persons);
			} 
				System.out.println("Serialized data is saved in person.ser");
		} catch (IOException e) {
			System.out.println("io exception occured"+e);
			e.printStackTrace();
		}
		

	}

}
