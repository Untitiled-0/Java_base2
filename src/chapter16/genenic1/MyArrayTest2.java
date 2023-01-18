package chapter16.genenic1;

class MyArrayG<E>{
	private Object[] array = new Object[10];
	int i;
	
	public void add(Object obj) { // 저장 set
		array[i++] = obj;
	}
	public E get(int index) { // T, E, K를 자주 사용
		return (E)array[index];
	}
	
}
public class MyArrayTest2 {

	public static void main(String[] args) {
	
		MyArrayG<String> myArray1 = new MyArrayG<>(); 
		// 객체를 생성할때 구체적으로 정의한 후 구체적인 타입을 생성하지 않고 변수타입으로 지정한다. 
		myArray1.add(new String("test"));
		String str =  myArray1.get(0);
		System.out.println(str);
		System.out.println();
		
		MyArrayG<Integer> myArray2 = new MyArrayG<>();
		myArray2.add(new Integer(100));
		Integer num = myArray2.get(0);
		System.out.println(num);
		
	}
}
