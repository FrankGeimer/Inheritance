
public class Boat extends Vehicle {

	public Boat(String brand, int kilometers) {
		super(brand, kilometers);
		// TODO Auto-generated constructor stub
	}

	public String doStuff() {

		return "I am " + this.getBrand() + " and I go glug glug";
	}
}
