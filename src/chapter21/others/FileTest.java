package chapter21.others;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		
		// 입출력 기능은 없음.
		// 파일의 속성, 경로, 이름등의 정보를 제공하는 메소드
		
		File file = new File("reader.txt");
		file.createNewFile(); // 객체들이 생성된 것		
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		file.delete();
		System.out.println(file.isFile());
		
	}
}