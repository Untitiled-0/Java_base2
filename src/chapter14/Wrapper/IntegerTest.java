package chapter14.Wrapper;

public class IntegerTest {

	public static void main(String[] args) {
		
//		Integer i = new Integer(100);
		
		Integer num = 100; // 오토박싱 : 일반자료 => 클래스로 선언
		
		
		int iNum = num.intValue(); // 클래스안에 들어있는 값을 넣어준다. 
		// 언박싱 : 클래스 => 일반자료
		
		int jNum=200;
		
		int sum = iNum+jNum;
		System.out.println(sum);
		
		
		// 언박싱
		int total = num+jNum; // num.intValue + jNum
		System.out.println(total);
		
		//오토박싱(int => Integer)
		Integer i = jNum;
		System.out.println(i); //Integer.valueOf(jNum)로 변환하는것과 같음
	
		
	}
}
