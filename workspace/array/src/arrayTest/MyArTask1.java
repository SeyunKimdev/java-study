package arrayTest;

import java.util.Iterator;
import java.util.Scanner;

public class MyArTask1 {
	public static void main(String[] args) {
//		�����
//		1~10���� �迭�� ��� ���
//		int[] arData = {1,2,3,4,5,6,7,8,9,10};
//		for(int i = 0; i < 10; i++) {
//			System.out.println(arData[i]);
//		}
//		10~1���� �迭�� ��� ���
//		int[] arData2 = new int[10];
//		for(int i = 0; i < 10; i++) {
//			arData2[i] = 10 - i;
//			System.out.println(arData2[i]);
//		}
//		1~100���� �迭�� ���� �� Ȧ���� ���
//		int[] arData3 = new int[100];
//		for(int i = 0; i < 100; i++) {
//			arData3[i] = i + 1;
//			System.out.print(i % 2 == 0 ? arData3[i] + " " : "");
//		}
		
//		�ǹ�
//		1~100���� �迭�� ���� �� ¦���� �� ���
//		int[] arData4 = new int[100];
//		int sum = 0;
//		for(int i = 0; i < 100; i++) {
//			arData4[i] = i + 1;
//			sum += i % 2 == 1 ? arData4[i] : 0; 
//		}
//		System.out.println("1~100������ ¦���� ���� : " + sum);
		
//		A~F���� �迭�� ��� ���
//		char[] arData5 = new char[6];
//		for(int i = 0; i < 6; i++) {
//			arData5[i] = (char)(i+65);
//			System.out.println(arData5[i]);
//		}
		
//		A~F���� �� C�����ϰ� �迭�� ���� �� ���
//		char[] arData6 = new char[6];
//		for(int i = 0; i < arData6.length; i++) {
//			arData6[i] = (char)(i+65);
//			if(i==2) continue;
//			System.out.println(arData6[i]);
//		}
		
//		���
//		5���� ������ �Է¹ް� �迭�� ���� �� �ִ밪�� �ּҰ� ���
//		int[] arData7 = new int[5];
//		int maxNum = 0;
//		int minNum = 0;
//		String msg = "5���� ������ �Է��ϼ���.";
// 		Scanner sc = new Scanner(System.in);
//		System.out.println(msg);
//		for(int i = 0; i < 5; i++) {
//			arData7[i] = sc.nextInt();
//		}
//		�ִ밪
//		if(arData7[0] >= arData7[1]) {
//			maxNum = arData7[0];
//		} else if(arData7[1] >= arData7[2]) {
//			maxNum = arData7[1];
//		} else if(arData7[2] >= arData7[3]) {
//			maxNum = arData7[2];
//		} else if(arData7[3] >= arData7[4]) {
//			maxNum = arData7[3];
//		} else {
//			maxNum = arData7[4];
//		}
		
//		�ּҰ�
//		for(int i=0; i<5; i++) {
//			minNum = arData7[0];
//			minNum = minNum >= arData7[i] ? arData7[i] : minNum; 
//		}
//		
//		System.out.println("�ִ밪 : " + maxNum);
//		System.out.println("�ּҰ� : " + minNum);
		
//		���̾�
//		����ڰ� �Է��� ������ ������ŭ �迭�� ���� �� ������ �Է¹ް� ��� ���ϱ�
		int sum = 0, count = 0;
		double avg = 0.0;
		String msg = "�Է��Ͻ� ������ ������ �Է����ּ��� : ";
		Scanner sc = new Scanner(System.in);
		System.out.print(msg);
		count = sc.nextInt();
		int[] arData = new int[count];

		for(int i = 0; i < arData.length; i++) {
			System.out.print(i + 1 + "��° ���� �Է� : ");
			arData[i] = sc.nextInt();
			sum += arData[i];
		}
		avg = sum / arData.length;
		System.out.println("��� : " + avg );
	}
}
