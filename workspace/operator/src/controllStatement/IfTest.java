package controllStatement;

import java.util.Scanner;

public class IfTest {
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
		
		if(num1 > num2) {
			result = "ū �� : " + num1;
		} else if (num1 < num2) {
			result = "ū �� : " + num2;
		} else {
			result = "�� ���� �����ϴ�.";
		}
		
		System.out.println(result);
		
	}
}
