package stringTest;

import java.util.Scanner;

public class MyStringTask {
	public static void main(String[] args) {
//		����ڿ��� �Է¹��� ���ڿ� �� �ҹ��ڴ� ��� �빮�ڷ�,
//		�빮�ڴ� ��� �ҹ��ڷ� �����Ѵ�.
//		String input = "", result = "", msg = "���� ���ڸ� �Է����ּ��� : ";
//		Scanner sc = new Scanner(System.in);
//		System.out.println(msg);
//		input = sc.nextLine();
//		for(int i = 0; i < input.length(); i++) {
//			if((int)(input.charAt(i)) >= 97 && (int)(input.charAt(i)) <= 122){
//				result += (char)((int)(input.charAt(i)) - 32);
//			} else if((int)(input.charAt(i)) >= 65 && (int)(input.charAt(i)) <= 90){
//				result += (char)((int)(input.charAt(i)) + 32);
//			}
//		}
//		System.out.println(result);
//		������ �ѱ۷� ����
//		��) 1024 -> �ϰ��̻�
		String hangle = "�����̻�����ĥ�ȱ�";
		String result = "", input="", msg="�ѱ۷� ��ȯ�� ������ �Է����ּ��� : ";
		
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		input = sc.next();
		for(int i = 0; i < input.length(); i++) {
			result += hangle.charAt((int)(input.charAt(i) - 48));
		}
		System.out.println(result);
		
//		�ѱ��� ������ ����
//		��) �ϰ��̻� -> 1024
//		String hangle = "�����̻�����ĥ�ȱ�";
//		String result = "", input="", msg="���ڷ� ��ȯ�� �ѱ� ������ �Է����ּ��� : ";
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print(msg);
//		input = sc.next();
//		for(int i = 0; i < input.length(); i++) {
//			result += hangle.indexOf(input.charAt(i));
//		}
//		System.out.println(result);
		
	}
}
