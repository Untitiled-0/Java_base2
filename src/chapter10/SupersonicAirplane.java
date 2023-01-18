package chapter10;

public class SupersonicAirplane extends Airplane{

	//NORMAL = 1, SUPERSONIAIRPLANE =2
	// FIELD (전역변수)
	
	public static final int NORMAL =1;
	public static final int SUPERSONIC =2;
	
	public int flyMode=NORMAL;

	@Override
	public void fly() {
		if(flyMode==SUPERSONIC) {
			System.out.println("초고속 비행입니다. ");
		}else {
			super.fly();
		}
	}
}	
