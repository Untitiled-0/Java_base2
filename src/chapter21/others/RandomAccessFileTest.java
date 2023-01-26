package chapter21.others;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	// 입출력 클래스 중에서 유일하게 입출력이 동시에 가능한 클래스
	// 포인터를 이용하여 동시에 입출력이 가능하다. - 장바구니에 쓸듯?
	// 다양한 자료형 메소드 제공

	public static void main(String[] args) throws IOException {

		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100); // 4byte
		System.out.println("파일 포인터의 위치 : "+rf.getFilePointer());
		
		rf.writeDouble(3.14); // 8byte
		System.out.println("파일 포인터의 위치 : "+rf.getFilePointer());
		
		rf.writeUTF("눈이옵니다"); // 15= 3*5+2
		System.out.println("파일 포인터의 위치 : "+rf.getFilePointer());
		
		rf.seek(0); // 파일위치를 내가 찍을 수 있다.
		System.out.println("파일 포인터의 위치 : "+rf.getFilePointer());
		
		int i=rf.readInt();
		double d=rf.readDouble();
		String s=rf.readUTF();
		
		System.out.println("---------------------------------");
		System.out.println("파일 포인터의 위치 : "+rf.getFilePointer());
		System.out.println(i);
		System.out.println(d);
		System.out.println(s);
		
	}// main

}// class
