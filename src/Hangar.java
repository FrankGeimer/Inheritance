
public class Hangar {

	public static void main(String[] args) {
		
		Car[] bonn = new Car[2];
		bonn[0] = new Car("Audi", 500000);
		bonn[1] = new Car("BMW", 20000);
		
		Boat[] rhein = new Boat[2];
		rhein[0] = new Boat ("Schiff", 10000);
		rhein[1] = new Boat ("Boot", 80000);
		
		for (int i = 0; i < bonn.length; i++) {
		
		System.out.println(bonn[i].doStuff());
		System.out.println(rhein[i].doStuff());
		}
	}



	

}
