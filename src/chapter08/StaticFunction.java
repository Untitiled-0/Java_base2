package chapter08;

public class StaticFunction {

	String str1 ="일반 회원";
	static String str2 ="Static 회원변수";
		
	public static String getStatic() { // 데이터로 올라가버린다.
		
//		static 메소드는 static변수만 사용이 가능하다.
//		st1 ="VIP";
		str2="VIP";
		
		return str2;
	}
}
