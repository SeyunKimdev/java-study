package exceptionTest;

import java.util.Scanner;

public class MyExceptionTask {
	public static void main(String[] args) {
//		5���� ������ �Է¹ޱ�
//		- ���� �Է� ���·� ����
//		- q �Է� �� ������
//		- �� ������ �迭�� ���
//		- if���� �� �� ���� ����ϱ�
		Scanner sc = new Scanner(System.in);
		String[] inputs = new String[5];
//		int[] input = new int[5];
		int i = 0;
		boolean flag = true;
		while(flag) {
			try {
				inputs[i] = sc.next();
				inputs[i] = Integer.parseInt(inputs[i]) + "";
				if(inputs[i].equals("q") || i >= 4) {
					flag = false;
					for (int k = 0; k < inputs.length; k++) {
						System.out.println(k + 1 + "��° �Է��� �� : " +inputs[k]);
					}
					System.out.println("������ �Ϸ�");
					
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("5���� ������ �Է����ּ���.");
//				e.printStackTrace();
			} catch (NumberFormatException e) {
				System.out.println("������ �Է����ּ���!");
				i--;
//				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
//			if(inputs[i].equals("q") || i >= 4) {
//				flag = false;
//				for (int k = 0; k < inputs.length; k++) {
//					System.out.println(k + 1 + "��° �Է��� �� : " +inputs[k]);
//				}
//				System.out.println("������ �Ϸ�");
//			}
			
			i++;
		}
	}
}
