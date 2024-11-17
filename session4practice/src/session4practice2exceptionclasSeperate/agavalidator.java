package session4practice2exceptionclasSeperate;

public class agavalidator {
	public static void validagemethod (int age) throws invalidageexception{
		if (age<0) {
			throw new invalidageexception("age can not be negative");
		}
		if (age < 18) {
            throw new invalidageexception("You must be at least 18 years old.");
        }
        System.out.println("Age is valid: " + age);
	}
}
