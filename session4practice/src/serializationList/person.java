package serializationList;

import java.io.Serializable;

public class person implements Serializable {
	//when you implement serializable you should determine version
	private static final long serialVersionUID = -6116734064694152241L;
	private String name;
    private int age;

    public person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// Getters and toString() method
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}
