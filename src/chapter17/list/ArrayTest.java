package chapter17.list;

import java.util.Arrays;
import java.util.List;

public class ArrayTest {

	public static void main(String[] args) {
		
		int iArray[] = {50,40,30,20,10};
		String sArray[] = new String[5];
		
		//Arrays : 특정한 메소드 때문에 사용함. 
		// 항목에 대해서 가볍게 정렬, 검색, 항목과 항목의 비교에 관한 메소드를 사용하기 위함.
		// static일때 자주 사용
		
		System.out.println(Arrays.toString(iArray));
		Arrays.sort(iArray);
		System.out.println(Arrays.toString(iArray));
		
		Arrays.fill(sArray, "Good!");
		System.out.println(Arrays.toString(sArray));
		
		List<String> City = Arrays.asList("Seoul","Inchon","Busan","Jeju");
		
		for(String i : City) {
			System.out.print(i+" ");
		}
		
		for(int i=0; i<City.size();i++) {
			System.out.println(City.get(i).toString());
		}
		
		
	}
}
