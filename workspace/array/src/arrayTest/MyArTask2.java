package arrayTest;

import java.util.Scanner;

public class MyArTask2 {
	public static void main(String[] args) {
//		�� ��ư�� ������ ��, �̵��ϴ� �������� ������ ����.
//		btn1 : ȸ������ ������
//		btn2 : �α��� ������
//		btn3 : ���� ������
		
//		ȸ������ -> �α��� -> ���� ������
//		�� ������� �Է��ؾ� �ϸ�, ���� ���� �ܰ踦 �����ϱ� ���� ���� �ܰ� ��ư�� ���� ���, ���� �ܰ迡 ���� �޼����� ������ش�.
//		��) �α��� Ŭ�� ��, "ȸ�������� ���� �������ּ���" ���
		
//		�˸��� �ܰ��� ��ư�� ������, �ش� �ܰ迡 ���� �޼����� ������ش�.
//		��) 	ȸ������ Ŭ�� ��, ȸ������ ����
//			���������� Ŭ�� ��, ���� �̸��� ���� ���
//			
		String userName = "";
		int userAge = 0;
		String selectBtnMsg = "���ϴ� �������� ��ư�� �Է����ּ��� : ";
		String[] arMsg = {"1. ȸ������ ������", "2. �α��� ������", "3. ���� ������", "4. ������"};
		String[] arFailMsg = {"ȸ�������� ���� �������ּ���.", "�α����� ���� �������ּ���."};
		String[] arSignUpMsg = {"�̸��� �Է����ּ��� : ", "���̸� �Է����ּ��� : "};
		String[] arSuccessMsg = {"ȸ������ ����", "�α��� ����", userName + ", " + userAge};
//		String[] arClick = new String[3];		// ����ڰ� �Է��� ��ư ��� ����
		boolean[] arSuccess = new boolean[2];	// ȸ������, �α��� ���� Ȯ��
		int click = 0, temp = 0;
		
		Scanner sc = new Scanner(System.in);
		
		
//		4 �Է� �޾��� �� ����
		while(click != 4) {
//			��ư ���� ���
			for(int i = 0; i < arMsg.length; i++) {
				System.out.println(arMsg[i]);
			}
			
//			��ư ���� �ޱ�
			System.out.print(selectBtnMsg);
			click = sc.nextInt();
			temp = click;
			
			System.out.println(click);
			
//			����ڰ� �Է��� ù��° ���� btn1�� �� 
//			ȸ������ �����ϸ� ������� �̸��� ���� �Է¹ޱ�
			
			if(click == 1) {
				System.out.print(arSignUpMsg[0]);
				userName = sc.next();
				System.out.print(arSignUpMsg[1]);
				userAge = sc.nextInt();
				temp = click;
//				arSuccess[0] = true;
			} else if(click == 2) {
				if(temp == 1) {
					System.out.println(arSuccessMsg[click - 1]);
				} else {
					System.out.println(arFailMsg[click - 2]);
				}
				temp = click;
				
//				arSuccess[0] = false;
			} else if(click == 3) {
				if(temp == 2) {
					System.out.println(arSuccessMsg[click - 1]);
				} else {
					System.out.println(arFailMsg[click - 2]);
				}
				temp = click;
//				arSuccess[0] = false;
			} else if(click == 4) {
				System.out.println("������");
				break;
			} else {
				System.out.println("�Է��� Ȯ�����ּ���.");
				arSuccess[0] = false;
			}
			
			if(arSuccess[0]) {
				for(int i = 1; i < arMsg.length; i++) {
					System.out.println(arMsg[i]);
				}
				System.out.println(selectBtnMsg);
				click = sc.nextInt();
//				System.out.println(click);
				
//				if(click == 2) {
//					System.out.println(userName + "�� �α��� �����ϼ̽��ϴ�.");
//					arSuccess[1] = true;
//				} else if(click == 3) {
//					System.out.println(arFailMsg[1]);
//				} else if(click == 4) {
//					System.out.println("������");
//				} else {
//					System.out.println("�Է��� Ȯ�����ּ���.");
//				}
//				
//				if(arSuccess[1]) {
//					for (int i = 2; i < arSuccess.length; i++) {
//						System.out.println(arMsg[i]);
//					}
//					System.out.println(selectBtnMsg);
//					click = sc.nextInt();
//					if(click == 3) {
//						System.out.println("�̸� : " + userName + "\n���� : " + userAge);
//					}
//				}
			}
			
			
		}
		System.out.println("����Ǿ����ϴ�.");
		
		

 		
//		ȸ������ ������ �ٽ� ��ư �Է� �ޱ�
		
	}
}
