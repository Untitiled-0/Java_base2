package chapter14.Wrapper;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		
		
		//AutoBouxing
		Integer obj=100;
		System.out.println("value : " + obj.intValue());
		
		// obj를 언박싱
		
		int value = obj;
		
		System.out.println(obj);
		
		int result = obj+100;
		
		System.out.println(result);
		
	}
}
