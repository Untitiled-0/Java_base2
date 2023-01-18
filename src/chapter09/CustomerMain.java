package chapter09;

public class CustomerMain {

	public static void main(String[] args) {

		int price = 10000;
		Customer customer = new Customer();

		
		System.out.println("----vip고객----");
		VIPCustomer vipcs= new VIPCustomer(1004, "홍길동", 900);
		
		int vipprice = vipcs.calcPrice(price);
		System.out.println(vipcs.getCustomerName()+"님이 "+vipprice+"원을 지불 완료하였습니다.");
		System.out.println(vipcs.showCustomer());
		
		
		System.out.println("----일반 고객----");
		price=10000;
		
		customer.setCustomerName("홍길순");
		
		System.out.println(customer.getCustomerName()+"님이 "+customer.calcPrice(price)+"원을 지불 완료하였습니다.");
		System.out.println(customer.showCustomer());
		
	}
}
