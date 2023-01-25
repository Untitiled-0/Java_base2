package chapter20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExcaption1 {

	public Class loadClass(String fileName, String className) throws ClassNotFoundException, 
	FileNotFoundException {
		
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		
		return c;
	}
	public static void main(String[] args) {
		
		ThrowsExcaption1 test =  new ThrowsExcaption1();
		
//		try {
//			test.loadClass("b.txt", "java.lang.String");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e);
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e);
//		} catch (Exception e) {
//			System.out.println(e);
//		}
		try {
			test.loadClass("ab.txt", "java.lang.String");
		} catch (FileNotFoundException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println("end");
		
	}
}
