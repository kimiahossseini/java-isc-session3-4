package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class serialize {

	public static void main(String[] args) {
		user user1=new user("kimia","k23","0025");
		user user2=new user("iman","i23","0026");
		user user3=new user("mahsa","m23","0027");
		List<user> users=List.of(user1,user2,user3);
		FileOutputStream fileout = null;
		try {
			fileout = new FileOutputStream("user.ser");
		} catch (FileNotFoundException e) {
			System.out.println("can't create file ser");
		}
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(fileout);
		} catch (IOException e) {
			System.out.println("io exception occured"+e);
		}
		try {
			out.writeObject(users);
			System.out.println("secure serialization is successful in your file");
		} catch (IOException e) {
			System.out.println("can't write serial in file ser");
		}

	}

}
