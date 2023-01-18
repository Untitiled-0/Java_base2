package chapter11;

public abstract class Computer { // 단하나라도 추상메소드가 있다면 추상 클래스가 된다.
	

	// 추상 메소드 : body가 없다.ㄴ
	public abstract void display(); //하위 클래스 구현해서 사용하라는 의미
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
