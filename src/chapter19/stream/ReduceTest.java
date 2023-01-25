package chapter19.stream;


import java.util.Arrays;

// BinaryOperator : FunctionalInterface
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {

	@Override
	public String apply(String s1, String s2) {
		if (s1.getBytes().length >= s2.getBytes().length) {
			return s1;
		} else {
			return s2;
		}
	}

}

public class ReduceTest {

	public static void main(String[] args) {

		// 특수문자 2byte
		String[] greetings = {"안녕하세요~~~~","hello","Good Moring","점심시간^^"};
		
		//BinaryOperator의 apply
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
		
		// Lambda
		System.out.println(Arrays.stream(greetings).reduce("", (s1,s2) ->
				{
					if (s1.getBytes().length >= s2.getBytes().length) {
						return s1;
					} else {
						return s2;
					}
				}));
		
		
	}

}
