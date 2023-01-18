package chapter12.Interface;

public class MyClassMain {

	public static void main(String[] args) {
		// X,Y MyInterface 클래스 타입의 인스턴스 변수를 선언하여 출력 
		
		MyClass mClass = new MyClass();
		
		X xClass = mClass;
		xClass.X();
		
		Y yClass = mClass;
		yClass.Y();

		
		MyInterface iClass = mClass;
		iClass.X();
		iClass.Y();
		iClass.myMethod();
		
		
		
	}
}
