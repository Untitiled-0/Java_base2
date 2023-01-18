package chapter14.Wrapper;

public class ValueCompareExample {

	public static void main(String[] args) {

		// 오토박싱 상황에서는 1byte초과시 비교판단이 안됨

		System.out.println("[-128 ~ 128 초과값일 경우]"); // 1byte = 8bit

		Integer obj1 = 300;
		Integer obj2 = 300;

		Integer obj3 = 100;
		Integer obj4 = 100;

		// 주소를 비교

		System.out.println("---결과--- : " + (obj1 == obj2));
		System.out.println("---언박싱 결과--- : " + (obj1.intValue() == obj2.intValue()));

		System.out.println("[-128 ~ 128 범위값일 경우]"); // 1byte = 8bit
		System.out.println("---결과--- : " + (obj3 == obj4));
		System.out.println("---언박싱 후 결과--- : " + (obj3.intValue() == obj4.intValue()));

		System.out.println("---equals--- : " + (obj3.equals(obj4)));

	}
}
