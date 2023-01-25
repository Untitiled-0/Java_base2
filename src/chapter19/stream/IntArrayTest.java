package chapter19.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		// 한번 생성된 스트림은 재사용 불가 다시 생성해야함.
		
		// 갯수
		// long type 이므로 다운캐스팅을 해줘야한다.
		int count = (int) Arrays.stream(arr).count();
		System.out.println(count);
		
		// 합계
		// sum() 은 Integer로 반환하므로 int로 받음
		int sumVal = Arrays.stream(arr).sum();
		System.out.println(sumVal);
		
		// IntStream
		IntStream stream =Arrays.stream(arr);
		System.out.println(stream.sum());
		
		// 이미 사용했으므로 소멸된 stream
		// 다시 사용하려면 재선언해야한다.
//		count = (int) stream.count();
//		System.out.println(count); 
//		
		// reduce(초깃값, 전달되는 요소 -> 각 요소가 수행해야하는 기능)
		System.out.println(Arrays.stream(arr).reduce(0, (a,b)->a+b));
		
		
		
		
		
	}

}
