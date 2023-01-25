package chapter20;

public class IDFormatTest {

	private String userID;

	public String getUserId() {
		return userID;
	}

	public void setUserId(String userID) throws IDFormatException {
		if (userID == null) {
			throw new IDFormatException("아이디는 null일 수 없습니다.");
		} else if (userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8글자 이상 20글자 이하로 쓰세요");
		}
		this.userID = userID;
	}
	

	public static void main(String[] args) {

		IDFormatTest test = new IDFormatTest();
		
		String userID="12345678";
				
		try {
			test.setUserId(userID);
		} catch (IDFormatException e) {
			System.out.println(e); //코드와 메시지
			System.out.println(e.getMessage()); // 메시지만 출력
		}
		
		
	}
}
