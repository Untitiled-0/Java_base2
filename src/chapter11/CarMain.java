package chapter11;

public class CarMain {

//	public static void main(String[] args) {
//		method(new ManualCar());
//		method(new AiCar());
//		
//	}
//	
//	public static void method(Car car) {
//		car.drive();
//		car.stop();
//	}
	
	public static void main(String[] args) {
		Car mycar = new AiCar();
		mycar.run();
		System.out.println();
		Car hiscar = new ManualCar();
		hiscar.run();
	
	}	
}
