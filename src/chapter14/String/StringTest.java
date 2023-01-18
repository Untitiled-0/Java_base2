package chapter14.String;

public class StringTest {

	public static void main(String[] args) {
		
		String str = "";
		String str1 = "Hi";
		String str2 = " NICE";

		System.out.println(System.identityHashCode(str1));
		
		str = str1 + str2;
		
		System.out.println(System.identityHashCode(str1)); // 주소같음
		System.out.println(str);
		
		// str1의 다른 주소 생성
		
		str1=str1.concat(str2);
		System.out.println(System.identityHashCode(str1));

		str=str1.concat(str2);
		System.out.println(System.identityHashCode(str));
		

		System.out.println(str1.length());
		System.out.println("str d글자 위치 : "+str2.indexOf('N'));

		
		
		
		
	}
}
