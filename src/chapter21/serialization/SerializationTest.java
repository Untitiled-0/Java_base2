package chapter21.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{

	private static final long serialVersionUID = 1L;
	
	String name;
	String job;
	
	// transient : 직렬화 하지 않겠다 (byte로 변환하지 않겠다.)
	// transient String number; 
	
	public Person() {
	
	}

	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}

	@Override
	public String toString() {
	
		return name +", "+ job;
	}
	
	
	
}

public class SerializationTest {

	public static void main(String[] args) {
	
		Person personAhn = new Person("홍길동","대표이사");
		Person personkim = new Person("김연아","상무이사");

		/*
		ObjectOutputStream : 파일이나 네트워크로 데이터를 전달
		writeObject() : 직렬화 함수
		*/
		// ----------------------직렬화---------------------		
		try (FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			// 직렬화
			oos.writeObject(personAhn);
			oos.writeObject(personkim);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// ----------------------역직렬화---------------------
		// 빅데이터 데이터를 바이너리화 할 때 굉장히 많이 필요하다.
		// ObjectInputStream : 파일이나 네트워크를 통해 전달 받은 직렬화된 데이터를 다시 원래대로 돌리는 역할 
		// readObjet() : 역직렬화에 사용되는 메소드 
		// 직렬화 하기 전에 객체로 캐스팅해줘야함
		try (FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			
			// 역직렬화
			Person p1 = (Person) ois.readObject();
			Person p2 = (Person) ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}// main

}
