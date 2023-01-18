package chapter14.String;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		
		Date now= new Date();
		
		System.out.println(now); // kst : korean standard time
		
		String strNow = now.toString(); // toString : 객체(heap) -> String의 타입
		
		System.out.println(strNow);

		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
//		String strNow2 = sdf.format(now);
//		System.out.println(strNow2);
		String strNow2 = sdf.toString(); // => 스트링 객체 -> heap이다 
		
		if(strNow.equals(now)) {
			
		}else {
			System.out.println(System.identityHashCode(strNow));
			System.out.println(System.identityHashCode(now));
		}
		
	}
}
