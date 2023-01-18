package chapter09;

public class SportCar extends Car{

	@Override
	public void speedUp() {
		speed+=10;
		System.out.println("스피드가 " +speed+"만큼 올랐습니다.");
	}
	public void stop() {
		System.out.println("스포트카가 멈춥니다.");
		speed=0;
	}
	
	public static void main(String[] args) {
		SportCar ac = new SportCar();
		
		ac.speedUp();
		System.out.println(ac.speed);
		ac.stop();
		System.out.println(ac.speed);
	
		Car c = new Car();
		c.speedUp();
		System.out.println(c.speed);
		
		
	}
}
