package chapter21.inputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileInputStreamTest01 {

	public static void main(String[] args) {

//		FileInputStream fis = null;
		FileReader fis = null;
		try {
//			fis = new FileInputStream("input.txt");
//			fis.read(); : 파일을 끝까지 읽으면 -1을 반환
//			System.out.println((char)fis.read());
			int i;

			fis = new FileReader("input.txt");
			while ((i = fis.read()) != -1) {
				System.out.print((char) i + " ");
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (NullPointerException | IOException e) {
				e.printStackTrace();
			}
		}
	}
}
