package collectionTest;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class MyStreamTask {
	public static void main(String[] args) {
////		10~1���� ArrayList�� ��� ���
//		ArrayList<Integer> numbers2 = new ArrayList<Integer>();
//		
//		IntStream.range(0, 10).forEach(v -> numbers2.add(10 - v));
//		System.out.println(numbers2);
//		
////		1~10���� ArrayList�� ��� ���
//		ArrayList<Integer> numbers = new ArrayList<Integer>();
//		
////		IntStream.rangeClosed(1, 10).forEach(v -> numbers.add(v));
//		IntStream.rangeClosed(1, 10).forEach(numbers::add);
//		System.out.println(numbers);
//		
//		
//		chars()
		
		
////		ABCDEF�� �� ���ڿ��� ���
//		String data = "ABCDEF";
////		data.chars().forEach(c -> System.out.print((char)c + " "));
//		data.chars().forEach(c -> System.out.println((char)c));
//		IntStream.rangeClosed('A', 'F').forEach(v -> System.out.println((char)v));
		
//		map() : ���� ���� ���ϴ� ������ ����
//		String data = "ABC";
//		data.chars().map(c -> c + 3).forEach(c -> System.out.print((char)c));
		
//		1~100���� �� Ȧ���� ArrayList�� ��� ���
		ArrayList<Integer> numbers3 = new ArrayList<Integer>();
		IntStream.range(0, 50).map(c -> c * 2 + 1).forEach(c -> numbers3.add(c));
		System.out.println(numbers3);
//		A~F���� �� D�����ϰ� ArrayList�� ��� ���
		ArrayList<Character> datas = new ArrayList();
		IntStream.range('A', 'F').map(c -> c >= 'D'? c + 1 : c).forEach(c->datas.add((char) c));
		System.out.println(datas);
		
		
		
	}
}
