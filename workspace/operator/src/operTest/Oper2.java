package operTest;

import java.util.Scanner;

public class Oper2 {
	public static void main(String[] args) {
//		두 정수 대소비교
		int num1 = 0, num2 = 0;
		String msg1 = "첫번째 정수를 입력해주세요 : ";
		String msg2 = "두번째 정수를 입력해주세요 : ";
		String result = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println(msg1);
		num1 = sc.nextInt();
		System.out.println(msg2);
		num2 = sc.nextInt();
		
		result = num1 > num2 ? "큰수는 : " + num1 : num1 == num2 ? "두 수는 같습니다." : "큰수는 : " + num2;
		System.out.println(result);
		
	}
}
