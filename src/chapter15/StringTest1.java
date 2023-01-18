package chapter15;

public class StringTest1 {

	public static void main(String[] args) {

		String javaStr = new String("JAVA"); // heap
		String androidStr = new String(" android"); // heap
		
		
		System.out.println(javaStr); // toString
		System.out.println(javaStr.hashCode()); // 10진수
		System.out.println(System.identityHashCode(javaStr)); // 16진수
		System.out.println();
		
		javaStr = javaStr.concat(androidStr);
		System.out.println(javaStr);
		System.out.println(System.identityHashCode(javaStr)); // 16진수
	
		
		
	}

	
}
