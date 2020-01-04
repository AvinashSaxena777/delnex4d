public class Car {
	private String name;
	private String colour;
	private double price;
	public Car() {
		
	}
	public Car(String name, String colour, double price) {
		super();
		this.name = name;
		this.colour = colour;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", colour=" + colour + ", price=" + price + "]";
	}
	
}
