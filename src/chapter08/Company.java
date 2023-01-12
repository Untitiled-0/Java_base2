package chapter08;

public class Company {

	// 객체를 단 하나만 생성하는 클래스 
	// 유일성	
	// 하나에만 몰아준다. ex 0~499명의 금액을 한 곳으로 모아준다. 
	// 
	private static Company instance = new Company(); // 힛메모리를 만드는 것

	// 일반적인 객체 생성
	public Company() {
	
	}
	
	// singleton 객체 생성 메소드 
	public static Company getInstance() {
		
		//예외처리
		if(instance == null) {
			instance = new Company();
		}
		
		return instance;
	}
}
