package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class deseialize {

	public static void main(String[] args) {
		List<user> users=null;
		try (FileInputStream filein = new FileInputStream("user.ser");
				ObjectInputStream in = new ObjectInputStream(filein)) {
			users=(List<user>) in.readObject();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		System.out.println("secure deserialized list of users");
		users.forEach(t -> System.out.println(t));

	}

}
