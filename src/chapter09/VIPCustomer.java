package chapter09;

public class VIPCustomer extends Customer {

	
	private int agentID;
	double saleRatio;
	
	
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
//		this.customerID=customerID;
//		this.customerName=customerName;
		customerGrade="VIP";
		bonusRatio=0.05;
		this.agentID=agentID;// 전문 상담원
		this.saleRatio=0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		bonusPoint = (price-(int)(price*saleRatio))*bonusRatio;
		
		return price-(int)(price*saleRatio);
	}

	@Override
	public String showCustomer() {
		// TODO Auto-generated method stub
		return super.showCustomer()+"\n전문상담원은 " + agentID+"입니다.";
	}
	

	public int getAgentID() {
		return agentID;
	}
}
