package collectionTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
	public static void main(String[] args) {
//		<?> : 제네릭(이름이 없는)
//		객체화 시 타입을 지정하는 기법
//		설계할 때에는 타입을 지정할 수 없기 때문에 임시로 타입을 선언할 때 사용한다.
//		따로 다운 캐스팅을 할 필욕 없으며, 지정할 타입에 제한을 줄 수 있다.
		
//		ArrayList<Integer> datas = new ArrayList<Integer>();
		ArrayList<Integer> datas = new ArrayList(); // <Integer> 생략 가능
		final int SIZE = 9;
		
//		C : Create(추가)
		for (int i = 0; i < SIZE; i++) {
			if(i > 4) {
				datas.add((14 - i) * 10);
//				System.out.println(datas.size());
				continue;
			}
			datas.add((i + 1) * 10);
//			System.out.println(datas.size());
		}
		
//		R : Read(조회)
//		for (int i = 0; i < datas.size(); i++) {
//			System.out.println(datas.get(i));
//		}
	
//		정렬
		Collections.sort(datas);
//		가운데를 기준으로 좌우를 바꿔주는 reverse -> sort 한후 reverse를 사용하면 내림차순
		Collections.reverse(datas);
//		랜덤으로 섞임
		Collections.shuffle(datas);
		
		for (int i = 0; i < datas.size(); i++) {
			System.out.println(datas.get(i));
			System.out.println("===================================");
		}
		
		
//		추가(삽입)
//		50 뒤에 500 삽입
//		System.out.println("50의 위치 : " + Collections.binarySearch(datas, 50) + " 인덱스");
//		System.out.println("50의 위치 : " + datas.indexOf(50) + " 인덱스");
		if(datas.contains(50)) {
			datas.add(datas.indexOf(50) + 1, 500);		// add(추가할 인덱스 번호, 값);
			System.out.println(datas);
			System.out.println("===================================");
		}
		
//		수정
//		90을 9로 수정
		if(datas.contains(90)) {
			datas.set(datas.indexOf(90), 9);
			System.out.println(datas);
			System.out.println("===================================");
		}
		
//		삭제
//		80 삭제
//		1. 인덱스로 삭제
//		if(datas.contains(80)) {
//		datas.remove(datas.indexOf(80));
//		}
//		System.out.println(datas);
//		System.out.println("===================================");
//		2. 값으로 삭제
		if(datas.contains(80)) {
			datas.remove(Integer.valueOf(80));
			System.out.println(datas);
			System.out.println("===================================");
		}
		
		if(datas.remove(Integer.valueOf(80))) {
			System.out.println("삭제되었습니다");
			System.out.println(datas);
		}
		
//		빠른 for문(forEach, 향상된 for문)
//		for (자료형 변수명 : 순서가 있는 무언가){}
//		변수에 하나씩 값이 순서대로 들어간다!
		
		for (int data : datas) {
			System.out.println(data);
		}
	}
}
