package session3practice2;

public class product {
	private String name;
	private int price;
	
	public product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() {
		return "Product{ name=" + name + ",  price=" + price + "}";
		
	}
	
	
}
