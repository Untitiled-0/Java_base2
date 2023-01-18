package chapter09;

public class DmbCellPhoneMain {

	public static void main(String[] args) {
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone("JAVA폰", "검정색", 10);
		
		// cell폰으로 부터 상속받은 필드
		
		dmbCellPhone.powerOn();
		dmbCellPhone.powerOff();
		
		
		//dmb폰의 필드
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.turnOffDmb();
		
		// cell폰의 메소드를 사용하여 통화
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("안녕하세요.");
		dmbCellPhone.receiveVoice("반갑습니다.");
		dmbCellPhone.hangUp();
		// dmb셀폰이 메소드를 사용하여 채널을 바꾸기
		dmbCellPhone.changeChannelDmb(20);
		
	}
}
