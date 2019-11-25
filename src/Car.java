
public class Car extends Vehicle {

	public Car(String brand, int kilometers) {
		super(brand, kilometers);
		// TODO Auto-generated constructor stub
	}

	public String doStuff() {

		return "I am " + this.getBrand() + " and I go zoom zoom zoom";
	}
}
