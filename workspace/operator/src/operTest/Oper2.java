package operTest;

import java.util.Scanner;

public class Oper2 {
	public static void main(String[] args) {
//		�� ���� ��Һ�
		int num1 = 0, num2 = 0;
		String msg1 = "ù��° ������ �Է����ּ��� : ";
		String msg2 = "�ι�° ������ �Է����ּ��� : ";
		String result = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println(msg1);
		num1 = sc.nextInt();
		System.out.println(msg2);
		num2 = sc.nextInt();
		
		result = num1 > num2 ? "ū���� : " + num1 : num1 == num2 ? "�� ���� �����ϴ�." : "ū���� : " + num2;
		System.out.println(result);
		
	}
}
