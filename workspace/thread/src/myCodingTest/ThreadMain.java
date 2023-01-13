package myCodingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ThreadMain {
		// 제한시간 : 1시간
		// 3개의 쓰레드가 있다.
		// Thread1, Thread2, Thread3
		// 사용자가 입력한 순서대로 각 알맞는 문자열이 출력된다.

		// 입력 예) 3 1 2
		// 출력 예) third first second

		// 단, Thread들은 항상 1, 2, 3 순서로 실행되어야 한다.

		// Thread1 : third
		// Thread2 : first
		// Thread3 : second

		// 출력 시 쓰레드의 번호도 출력할 경우 가산점으로 처리한다.
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
