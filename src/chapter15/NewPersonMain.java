package chapter15;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.StringTokenizer;

public class NewPersonMain {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Person person1 = new Person();
		System.out.println(person1);
		
		Class pClass = Class.forName("chapter15.Person");
		System.out.println(pClass);

		Person person2 = (Person) pClass.newInstance();
		System.out.println(person2.getClass());
		
		//==========================================
		// String 클래스의 정보가져오기
		System.out.println();
//		String str = new String();
//		
//		System.out.println(str.getClass());
//		System.out.println(str.getClass().getName());

		
		Class strClass = Class.forName("java.lang.String");
		System.out.println(strClass);
		System.out.println();
		
		
		Constructor[] cons = strClass.getConstructors(); // 생성자 배열 타입은 Constructor
		for(Constructor i : cons) {
			System.out.println(i);
		}
		
		System.out.println("-------필드---------");
		
		// 멤버변수가 있다.
		
		Field[] field = strClass.getFields();
		for(Field f : field) {
			System.out.println(f);
		}
		System.out.println("-------필드 전부--------");
		Field[] field1 = strClass.getDeclaredFields();
		for(Field f : field1) {
			System.out.println(f);
		}
		System.out.println("-------------------");
		
		Method[] method = strClass.getMethods();
		for(Method m : method) {
			System.out.println(m);
		}
		
		System.out.println("-----------------------");
		String str = "Have a Nice Day";
		// Tokenizer 
		// 1 : 사용할 String 문자열
		// 2 : 분리하는 기준
		// 3 : 자르는 기준을 표시할건지 여부 
		StringTokenizer obj = new StringTokenizer(str, " ", false);
		
		while (obj.hasMoreTokens()) { // hasMoreTokens 아무것도 없을때까지
			String t =obj.nextToken();
			System.out.println(t);
		}
		
		
	}
}
