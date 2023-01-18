package chapter16.genenic1;

public class GenExMain {

	public static void main(String[] args) {
		
		
		
		// 문자열
		GenEx<String> v1= new GenEx<String>();
		v1.setValue("String");
		System.out.println(v1.getValue());
		
		// 정수
		GenEx<Integer> v2= new GenEx<Integer>();
		v2.setValue(100);
		System.out.println(v2.getValue());
		
		//실수
		GenEx<Float> v3= new GenEx<Float>();
		v3.setValue(100.0f);
		System.out.println(v3.getValue());
		
		//문자
		GenEx<Character> v4= new GenEx<Character>();
		v4.setValue('c');
		System.out.println(v4.getValue());
		
		
	
	}
}
