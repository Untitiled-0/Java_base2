package chapter19.Lambda;

interface PrintString {
	void showString(String Str);
}

public class TestLambda {

	public static void main(String[] args) {

		// 람다식

		// 함수명을 변수명으로 대채
		PrintString lambdaStr = s -> System.out.println(s);
		showMyString(lambdaStr);

		// returnString() 메소드 안에 람다식 구현부 호출
		PrintString retStr = returnString();
		retStr.showString("Hello ");

	}

	// 매개변수 구현 => p가 body
	public static void showMyString(PrintString p) {
		p.showString("Hello, Lambda");
	}

	// 반환값으로 body구현
	public static PrintString returnString() {
		return s -> System.out.println(s + "world");

	}

}
