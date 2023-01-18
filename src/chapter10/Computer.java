package chapter10;

public class Computer extends Calculator{

	@Override
	double areaCircle(double r) {
		System.out.println("calculator 메소드 실행");
		return Math.PI*r*r;
	}

	
}
