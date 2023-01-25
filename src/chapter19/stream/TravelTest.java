package chapter19.stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {

		List<TravelCustomer> customerList = new ArrayList<>();

		// 객체생성
		TravelCustomer tc, tc1, tc2;
		tc = new TravelCustomer("윤", 10, 100);
		tc1 = new TravelCustomer("영", 20, 200);
		tc2 = new TravelCustomer("훈", 30, 300);

		// 객체 추가
		customerList.add(tc);
		customerList.add(tc1);
		customerList.add(tc2);
//
//		// 출력
//		System.out.println("==고객 명단 추가된 순서대로 출력==");
//		customer.stream().forEach(s -> System.out.println(s + " "));

		
//		// 객체 생성 , 추가
//		customerList.add(new TravelCustomer("윤", 10, 100));
//		customerList.add(new TravelCustomer("영", 20, 200));
//		customerList.add(new TravelCustomer("훈", 30, 300));
//		
//		// 출력
//		System.out.println("==고객 명단 추가된 순서대로 출력==");
		customerList.stream().forEach(s -> System.out.println(s + " "));	

		// map : 요소(data)를 특정조건에 해당하는 값으로 변환해주는것
		
//		customerList.stream().map(c -> c.getName() == "윤").forEach(s -> System.out.println(s + " "));
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s + " "));

		// mapToInt : int형 자료로 변환
		int total = customerList.stream().mapToInt(n -> n.getPrice()).sum();
		System.out.println("총 가격 : "+total);
	
		// filter : 특정 조건에 맞는 데이터만 걸러낸다.
		System.out.println("--20세 이상--");
		customerList.stream().filter(n -> n.getAge()>=20).map(c -> c.getName()).sorted().forEach(s -> System.out.println(s + " "));
		
	}

}
