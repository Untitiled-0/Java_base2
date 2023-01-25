package chapter21.reader;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		FileReader fr = new FileReader("reader.txt");
		fis = new FileInputStream("reader.txt");
		
		int i;
		while((i=fr.read()) != -1) {
			System.out.print((char)i);
		}
		fis.close();
		System.out.println();
		System.out.println("end");
	
	
	
	}
}
