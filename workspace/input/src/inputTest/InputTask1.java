package inputTest;

import java.util.Scanner;

public class InputTask1 {
	public static void main(String[] args) {
//		�� ������ �Է��� �� ���� ��� ���
//		��, next()�� ����Ѵ�.
		Scanner sc = new Scanner(System.in);
		String num1="", num2="";
		System.out.print("�ΰ��� ������ �Է����ּ��� : ");
		num1 = sc.next();
		num2 = sc.next();
		int result = Integer.parseInt(num1) + Integer.parseInt(num2);
		
		System.out.println("�� ������ ���� " + result + "�Դϴ�.");
	}
}
