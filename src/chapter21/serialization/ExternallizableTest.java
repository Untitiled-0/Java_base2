package chapter21.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Dog implements Externalizable {

	String name;

	public Dog() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
	}

	@Override
	public String toString() {
		return name;
	}

}// class

// 직렬화된 클래스이다.
public class ExternallizableTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// Externalizable : 인터페이스 Externalizable을 사용하여 내부의 내용을 쉽게 조작함
		// writeExternal() / readExternal()
		Dog myDog = new Dog();
		myDog.name = "최백설";

		// 쓰는 순서와 읽는 순서가 같아야함.

		FileOutputStream fos = new FileOutputStream("external.out");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		try (fos; oos) {
			oos.writeObject(myDog);
		} catch (Exception e) {
			e.printStackTrace();
		}

		FileInputStream fis = new FileInputStream("external.out");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Dog dog = (Dog) ois.readObject();
		System.out.println(dog);

	}// main
}// class
