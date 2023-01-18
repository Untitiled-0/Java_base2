package chapter12.MultiInterface;

public class InterMenuMain implements Inter_Menu3 {

	public static void main(String[] args) {

		InterMenuMain im = new InterMenuMain();

		// 부모 = 자식
		Inter_Menu1 im1 = im; // 업케스팅
		Inter_Menu2 im2 = im; // 업케스팅
		Inter_Menu3 im3 = im; // 업케스팅
		System.out.println("------Inter_Menu1------");
		System.out.println(im1.jajang());
		System.out.println(im1.jjambbong());

		System.out.println("------Inter_Menu2------");
		System.out.println(im2.tangsuyuc());

		System.out.println("------Inter_Menu3------");
		System.out.println(im3.boggembob());

	}

	@Override
	public String jajang() {

		return "하나 죽으면 아는 짜장면";
	}

	@Override
	public String jjambbong() {

		return "해장하세요";
	}

	@Override
	public String tangsuyuc() {

		return "찹살 탕수육";
	}

	@Override
	public String boggembob() {

		return "해물 볶음밥";
	}
}
