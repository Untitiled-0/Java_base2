package chapter10;

import chapter09.*;

public class OverridingTest2 {

	public static void main(String[] args) {

		var vc = new VIPCustomer(10003, "김치", 20000);

		if (vc instanceof VIPCustomer) {
			System.out.println(vc.showCustomer());
		} else {
			System.out.println("1");
		}
	}
}
