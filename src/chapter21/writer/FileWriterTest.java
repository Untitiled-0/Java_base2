package chapter21.writer;

import java.io.FileWriter;

public class FileWriterTest {

	public static void main(String[] args) {
		
		try (FileWriter fw = new FileWriter("writer.txt")){
			
			fw.write('A');
			fw.write(65);
			fw.write("65");
			
			// 배열
			char[] buf = {'B','C','D','E','F','G'};
//			fw.write(buf);
			fw.write('\n');
			fw.write(buf,2,4);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("파일저장완료");
	}
	
}
