package session4practice2exceptionclasSeperate;

public class exceptionmain {

	public static void main(String[] args) {
		try {
			agavalidator.validagemethod(20);
			agavalidator.validagemethod(-5);
			agavalidator.validagemethod(6);
		} catch (invalidageexception e) {
			
			e.printStackTrace();
		}

	}

}
