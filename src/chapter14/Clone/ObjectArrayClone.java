package chapter14.Clone;

import java.util.ArrayList;

class MyBook implements Cloneable{
	
	String title;

	public MyBook(String title) {
		
		this.title = title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
	
		return super.clone();
	}

	@Override
	public String toString() {
	
		return title;
	}

	
}
public class ObjectArrayClone {

	public static void main(String[] args) {
		
		ArrayList<MyBook> bookList = new ArrayList<MyBook>(); 
		// 제네릭 : 객체에 대한 타입입니다. 
		// < >
		
		MyBook book1 = new MyBook("자바");
		MyBook book2 = new MyBook("스프링");
		MyBook book3 = new MyBook("파이썬");
		
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);

		ArrayList<MyBook> copyList = (ArrayList) bookList.clone();
		copyList.add(new MyBook("오라클"));
	
		System.out.println(bookList);
		System.out.println(copyList);
		
		book3.setTitle("c++");
		
		System.out.println(bookList);
		System.out.println(copyList);
		
		
	}
}
