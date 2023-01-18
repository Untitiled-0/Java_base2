package chapter14.String;

import java.util.Date;

class Book{
	
	String title;
	String author;
	
	public Book(String title, String author) {
	
		this.title = title;
		this.author = author;
	}
	
	//String이 문자열로 출력해주는 toString재정의 
	@Override
	public String toString() {
		
		return title + ", " + author;
	
	}
	
}

public class ToStringEx1 {

	public static void main(String[] args) {
		
		Object obj1 = new Object();
		Date obj2 = new Date();
		
		
		// 재정의가 안되어 있는 기본 toString 
		System.out.println("Object : " + obj1.toString());
		System.out.println("Object : " + obj2.toString());
		
		
		Book book = new Book("1","2");
		System.out.println(book);
		System.out.println(book.hashCode());
		
		String str = new String("test");
		System.out.println(str);
//		if(book == book.toString()) {
//			
//		}
		
		
		
	}
}
