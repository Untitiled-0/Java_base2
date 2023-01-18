package chapter14.Clone;

public class ArrayClonetest {

	public static void main(String[] args) {
		int[] arr2,arr1 = {1,2,3,4,5};
		
		arr2 = arr1.clone();
		
		for(int i : arr2) {
			System.out.print(i + " ");
		}
		System.out.println();
		arr2[3]=0;
		System.out.println("복사 후 arr2 배열");
		for(int i : arr2) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("변경 후 arr1 배열");
		for(int i : arr1) {
			System.out.print(i + " ");
		}
	}
}