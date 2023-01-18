package chapter14.String;

public class StringEquals {

	// 전역 
	
	
	public static void main(String[] args) {
		
		String str1 = new String("test");
		String str2 = new String("test");
	
	
		System.out.println(str1==str2); // 객체는 heap메모리를 보고 있는 것이다.
		System.out.println(str1.equals(str2)); 
		
		
		String str="abc";
		String str3="abc";
		
		String str4="abd";
		
		String str5="abe";
		String str6="abe";
		
		System.out.println(str==str3); 
		System.out.println(str.equals(str3));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str3));
		
		System.out.println(System.identityHashCode(str4));
		
		System.out.println(System.identityHashCode(str5));
		System.out.println(System.identityHashCode(str6));
		
		//박싱 : 기본 타입값을 포장해서 객체로 만듬
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
	
		
	}
}
