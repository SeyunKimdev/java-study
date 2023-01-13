package myCodingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ThreadMain {
		// ���ѽð� : 1�ð�
		// 3���� �����尡 �ִ�.
		// Thread1, Thread2, Thread3
		// ����ڰ� �Է��� ������� �� �˸´� ���ڿ��� ��µȴ�.

		// �Է� ��) 3 1 2
		// ��� ��) third first second

		// ��, Thread���� �׻� 1, 2, 3 ������ ����Ǿ�� �Ѵ�.

		// Thread1 : third
		// Thread2 : first
		// Thread3 : second

		// ��� �� �������� ��ȣ�� ����� ��� ���������� ó���Ѵ�.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[3];
		
		Runnable threadTask = new ThreadTask();
		
		Thread[] threads = {
				new Thread(threadTask),
				new Thread(threadTask),
				new Thread(threadTask)
		};
		
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
			threads[i].setName(numbers[i]+"");
		}
		
		for (int i = 0; i < numbers.length; i++) {
			threads[i].start();
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
