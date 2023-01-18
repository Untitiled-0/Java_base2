package chapter09;

public class ParentMain {

	public static void main(String[] args) {
		
		ChildExam c1 = new ChildExam();
	
		System.out.println(c1.getCar());
		
		System.out.println(c1.getMoney());
	
		if(c1 instanceof ParentExam) { // c1 안에 ParentExam이 있니? 라고 물어보는 것이다.
			System.out.println("c1은 ParentExam의 자식 클래스입니다.");
			
		}
		
		// 형변환 
		ChildExam ch = new ChildExam();
		
		ParentExam p1 = new ParentExam();
		
		System.out.println("------------------");
		// 부모 = 자식
		p1 = ch; // 자동형변환
		System.out.println(p1.getMoney());
		System.out.println(p1.getStr());
		System.out.println("------------------");
		ch = (ChildExam)p1;
		System.out.println(ch.getCar());
		System.out.println(ch.getMoney());
		System.out.println(ch.getStr());
		
	
	}
}
