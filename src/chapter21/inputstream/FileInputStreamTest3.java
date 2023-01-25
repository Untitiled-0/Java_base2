package chapter21.inputstream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("input2.txt")) {

			byte[] bs = new byte[10]; // 버퍼로 활용

			int i;
			while ((i = fis.read(bs)) != -1) {

//				for (byte b : bs) {
//					System.out.print((char) b + " ");
//				}
				for (int j=0; j<i;j++) {
					System.out.print((char) bs[j] + " ");
				}
				System.out.println(" : " + i + "바이트 읽음");
			} // 10번 출력 완료
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}