package chapter20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		FileInputStream fis =null;
		try {
			fis = new FileInputStream("D:\\JAVA_YUN\\java_base2\\src\\chapter20\\a.txt");
		
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
