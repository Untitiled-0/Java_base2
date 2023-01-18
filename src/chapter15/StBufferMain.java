package chapter15;

public class StBufferMain {

	public static void main(String[] args) {
		
		StringBuffer buf = new StringBuffer("Nice Day");
		
		System.out.println(buf.toString());
		System.out.println(buf.length()); // 길이가 8개
		// StringBuffer의 기본 용량 16 + 추가(8) = 24
		System.out.println(buf.capacity());
		// 24를 넘어가면 허용범위(25~50)까지는 갖고 있는 용량 *2+2로 나온다. 
		buf.ensureCapacity(49); // 용량을 증가시키는것 가지고 있는 용량에서 *2를 한다.  
		System.out.println(buf.capacity());
		buf.insert(0, "HI ");
		System.out.println(buf);
		buf.insert(11, " Everybody ");
		System.out.println(buf);
		buf.delete(0, 3);
		System.out.println(buf);
		
		
		
	}
}
