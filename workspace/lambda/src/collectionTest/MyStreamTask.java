package collectionTest;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class MyStreamTask {
	public static void main(String[] args) {
////		10~1까지 ArrayList에 담고 출력
//		ArrayList<Integer> numbers2 = new ArrayList<Integer>();
//		
//		IntStream.range(0, 10).forEach(v -> numbers2.add(10 - v));
//		System.out.println(numbers2);
//		
////		1~10까지 ArrayList에 담고 출력
//		ArrayList<Integer> numbers = new ArrayList<Integer>();
//		
////		IntStream.rangeClosed(1, 10).forEach(v -> numbers.add(v));
//		IntStream.rangeClosed(1, 10).forEach(numbers::add);
//		System.out.println(numbers);
//		
//		
//		chars()
		
		
////		ABCDEF를 각 문자열로 출력
//		String data = "ABCDEF";
////		data.chars().forEach(c -> System.out.print((char)c + " "));
//		data.chars().forEach(c -> System.out.println((char)c));
//		IntStream.rangeClosed('A', 'F').forEach(v -> System.out.println((char)v));
		
//		map() : 기존 값을 원하는 값으로 변경
//		String data = "ABC";
//		data.chars().map(c -> c + 3).forEach(c -> System.out.print((char)c));
		
//		1~100까지 중 홀수만 ArrayList에 담고 출력
		ArrayList<Integer> numbers3 = new ArrayList<Integer>();
		IntStream.range(0, 50).map(c -> c * 2 + 1).forEach(c -> numbers3.add(c));
		System.out.println(numbers3);
//		A~F까지 중 D제외하고 ArrayList에 담고 출력
		ArrayList<Character> datas = new ArrayList();
		IntStream.range('A', 'F').map(c -> c >= 'D'? c + 1 : c).forEach(c->datas.add((char) c));
		System.out.println(datas);
		
		
		
	}
}
