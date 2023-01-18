package chapter10;

public class Driver {

	public static void main(String[] args) {
		
		Driver drvier = new Driver();
		drvier.drive(new Bus());
		drvier.drive(new Taxi());
	}
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
}
