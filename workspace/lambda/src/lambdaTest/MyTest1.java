package lambdaTest;

import java.util.Scanner;
//[��ȭ �ǽ�]
//���� ���� ������ �Է¹޾Ƽ� �˸´� ����, ���� ����� Ȯ���ϴ� ���ø����̼� ����
//
//�Է� ��1) 7 + 35 - 9
//��� ��1) 33
//
//�Է� ��2) -9 + 8 + 10
//��� ��2) 9
//
//* "ABC".split("")�� [A][B][C] 3ĭ ���ڿ� �迭�� ���ϵȴ�.
//   "A,B,C".split(",")�� [A][B][C] 3ĭ ���ڿ� �迭�� ���ϵȴ�.
//   split("������")�� �����ϸ� ���ڿ����� ������ �������� �������� ���ڿ� ���� �߶� �� ���ڿ� �迭�� �����Ѵ�.
//   �������� ���� �� ����� ������ split("������|������")���� ����ϸ�, "+", "-"�� ���������� ����� ������ "\\+", "\\-"�� ǥ���Ѵ�.
//   ��)"4 + 9".split("\\+")�� [4][9] 2ĭ ���ڿ� �迭�� ����
//
//* ����ڰ� ���������θ� �Է��Ѵٴ� ���� �Ͽ� �����ϵ��� �Ѵ�.
//* �� ������ ���޹��� �� int�� �����ϴ� calc �߻�޼ҵ� ����(�Լ��� �������̽� ����)
//* �� ������ ����, ������ �����ִ� �Լ��� �������̽��� �����ϴ� static �޼ҵ� ����(���ٽ� ����)
//* ��ü ���� ���޹��� �� String[]�� �����ϴ� getOpers �߻�޼ҵ� ����(�Լ��� �������̽� ����)
//* main�޼ҵ忡 getOper�� ���ٽ����� ����
//* ù��° ������ ������ ��� ���� �ذ�
public class MyTest1 {
	
//	public static String[] getOpers(String str) {
//		String[] results = null;
//		results = str.split(" ");
//		
//		return results;
//	}
	public static int calculator(String[] results) {
		int answer = 0;
		
		for (int i = 0; i < results.length; i++) {
			if(i == 1) {
				if(results[i].equals("+")) {
					answer += Integer.parseInt(results[i-1]) + Integer.parseInt(results[i+1]);
				} else if(results[i].equals("-")) {
					answer -= Integer.parseInt(results[i-1]) + Integer.parseInt(results[i+1]);
				}
			}
			else {
				if(results[i].equals("+")) {
					answer += Integer.parseInt(results[i+1]);
				} else if(results[i].equals("-")) {
					answer -= Integer.parseInt(results[i+1]);
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
//		Calc calc = (a, b) -> a + b;
		OperCheck operCheck = str -> {
			String[] results = str.split(" ");
			return results;
		};
		
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
//		String[] results = input.split(" ");
//		calculator(operCheck.getOpers(input));
		
		
		
//		int answer = 0;
//		for (int i = 0; i < results.length; i++) {
//			if(i == 1) {
//				if(results[i].equals("+")) {
//					answer += Integer.parseInt(results[i-1]) + Integer.parseInt(results[i+1]);
//				} else if(results[i].equals("-")) {
//					answer -= Integer.parseInt(results[i-1]) + Integer.parseInt(results[i+1]);
//				}
//			}
//			else {
//				if(results[i].equals("+")) {
//					answer += Integer.parseInt(results[i+1]);
//				} else if(results[i].equals("-")) {
//					answer -= Integer.parseInt(results[i+1]);
//				}
//			}
//		}
//		System.out.println(answer);
		System.out.println(calculator(operCheck.getOpers(input)));
	}
}
