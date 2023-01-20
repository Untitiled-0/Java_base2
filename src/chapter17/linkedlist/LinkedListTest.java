package chapter17.linkedlist;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		// 특정 인덱스에서 객체를 제거하거나 추가하게 되면 바로 앞뒤 링크로 연결
		// 맨끝 맨뒤 중간 : 빈번한 객체 삭제 삽입이 일어나는 곳에서 ArrayList보다 성능이 좋다.
		
		LinkedList<String> mylist = new LinkedList<>();
		
		mylist.add("A");
		mylist.add("B");
		mylist.add("C");
		
		System.out.println(mylist);
		
		mylist.removeFirst();
		System.out.println(mylist);

		mylist.removeLast();
		System.out.println(mylist);

		mylist.addFirst("F");
		System.out.println(mylist);
		
		mylist.addLast("L");
		System.out.println(mylist);
	
	}
}
