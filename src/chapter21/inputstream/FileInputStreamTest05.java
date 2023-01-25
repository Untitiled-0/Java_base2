package chapter21.inputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStreamTest05 {

	public static void main(String[] args) {
		
		try (FileOutputStream fos = new FileOutputStream("resource.txt",true);
			FileInputStream fis = new FileInputStream("resource.txt")){
			
			//쓰기
			fos.write(70);
			fos.write(71);
			fos.write(72);

			// 읽기
			System.out.println((char)fis.read()+" ");
			System.out.println((char)fis.read()+" ");
			System.out.println((char)fis.read()+" ");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
