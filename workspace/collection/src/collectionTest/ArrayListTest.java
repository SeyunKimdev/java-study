package collectionTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
	public static void main(String[] args) {
//		<?> : ���׸�(�̸��� ����)
//		��üȭ �� Ÿ���� �����ϴ� ���
//		������ ������ Ÿ���� ������ �� ���� ������ �ӽ÷� Ÿ���� ������ �� ����Ѵ�.
//		���� �ٿ� ĳ������ �� �ʿ� ������, ������ Ÿ�Կ� ������ �� �� �ִ�.
		
//		ArrayList<Integer> datas = new ArrayList<Integer>();
		ArrayList<Integer> datas = new ArrayList(); // <Integer> ���� ����
		final int SIZE = 9;
		
//		C : Create(�߰�)
		for (int i = 0; i < SIZE; i++) {
			if(i > 4) {
				datas.add((14 - i) * 10);
//				System.out.println(datas.size());
				continue;
			}
			datas.add((i + 1) * 10);
//			System.out.println(datas.size());
		}
		
//		R : Read(��ȸ)
//		for (int i = 0; i < datas.size(); i++) {
//			System.out.println(datas.get(i));
//		}
	
//		����
		Collections.sort(datas);
//		����� �������� �¿츦 �ٲ��ִ� reverse -> sort ���� reverse�� ����ϸ� ��������
		Collections.reverse(datas);
//		�������� ����
		Collections.shuffle(datas);
		
		for (int i = 0; i < datas.size(); i++) {
			System.out.println(datas.get(i));
			System.out.println("===================================");
		}
		
		
//		�߰�(����)
//		50 �ڿ� 500 ����
//		System.out.println("50�� ��ġ : " + Collections.binarySearch(datas, 50) + " �ε���");
//		System.out.println("50�� ��ġ : " + datas.indexOf(50) + " �ε���");
		if(datas.contains(50)) {
			datas.add(datas.indexOf(50) + 1, 500);		// add(�߰��� �ε��� ��ȣ, ��);
			System.out.println(datas);
			System.out.println("===================================");
		}
		
//		����
//		90�� 9�� ����
		if(datas.contains(90)) {
			datas.set(datas.indexOf(90), 9);
			System.out.println(datas);
			System.out.println("===================================");
		}
		
//		����
//		80 ����
//		1. �ε����� ����
//		if(datas.contains(80)) {
//		datas.remove(datas.indexOf(80));
//		}
//		System.out.println(datas);
//		System.out.println("===================================");
//		2. ������ ����
		if(datas.contains(80)) {
			datas.remove(Integer.valueOf(80));
			System.out.println(datas);
			System.out.println("===================================");
		}
		
		if(datas.remove(Integer.valueOf(80))) {
			System.out.println("�����Ǿ����ϴ�");
			System.out.println(datas);
		}
		
//		���� for��(forEach, ���� for��)
//		for (�ڷ��� ������ : ������ �ִ� ����){}
//		������ �ϳ��� ���� ������� ����!
		
		for (int data : datas) {
			System.out.println(data);
		}
	}
}
