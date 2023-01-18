package chapter14.String;

public class Example_objectMain {

	public static void main(String[] args) {
		
		// Object는 모든 것들을 다 읽는다. 
		
		Example_object v1 = new Example_object();
		v1.setValue("Test"); // String이지만 이미 Object가 상속되어 있으므로 자동 형변환이 이루어짐
		System.out.println(v1.getValue());
		
		Example_object v2 = new Example_object();
		v2.setValue(100); // AutoBoxing  기본자료형 int => 객체(Object)
		System.out.println(v2.getValue());
		
		int i = (int) v2.getValue(); // UnBoxing
		System.out.println(i+2);
		
		
	}
}
