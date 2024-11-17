package session3practice1;
import java.util.Objects;

public class person1 {
	private String name;
	private String email;
	private int age;
	
	public person1(String name, String email, int age) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
    public String toString() {
        return "Person{ name=" + name + ", email=" + email + ", age=" + age + "}";
    }

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		person1 other = (person1) obj;
		return Objects.equals(name, other.name);
	}
	
		
}

	

	

	



	
	

	
	
	


