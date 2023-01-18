package chapter10;

import chapter09.*;
public class OverridingTest1 {

	public static void main(String[] args) {
		
		int price = 10000;
		Customer customerLee = new Customer(10000,"이순신");
		customerLee.bonusPoint=10000;
		
		System.out.println(customerLee.showCustomer());
		VIPCustomer customerKim = new VIPCustomer(100001, "김유신", 1004);
		
		System.out.println();
		customerKim.bonusPoint=10000;
		System.out.println(customerKim.showCustomer());
		
		
		System.out.println(customerKim.getCustomerName() + "님이 " + customerKim.calcPrice(price) + "원을 지불 완료하였습니다.");
		System.out.println(customerLee.getCustomerName() + "님이 " + customerLee.calcPrice(price) + "원을 지불 완료하였습니다.");
		
	}
}
