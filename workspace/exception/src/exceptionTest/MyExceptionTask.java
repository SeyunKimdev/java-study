package exceptionTest;

import java.util.Scanner;

public class MyExceptionTask {
	public static void main(String[] args) {
//		5개의 정수만 입력받기
//		- 무한 입력 상태로 구현
//		- q 입력 시 나가기
//		- 각 정수는 배열에 담기
//		- if문은 딱 한 번만 사용하기
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
						System.out.println(k + 1 + "번째 입력한 값 : " +inputs[k]);
					}
					System.out.println("나가기 완료");
					
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("5개의 정수만 입력해주세요.");
//				e.printStackTrace();
			} catch (NumberFormatException e) {
				System.out.println("정수만 입력해주세요!");
				i--;
//				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
//			if(inputs[i].equals("q") || i >= 4) {
//				flag = false;
//				for (int k = 0; k < inputs.length; k++) {
//					System.out.println(k + 1 + "번째 입력한 값 : " +inputs[k]);
//				}
//				System.out.println("나가기 완료");
//			}
			
			i++;
		}
	}
}
