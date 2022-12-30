package controllStatement;

import java.util.Scanner;

public class IfTest {
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
		
		if(num1 > num2) {
			result = "큰 값 : " + num1;
		} else if (num1 < num2) {
			result = "큰 값 : " + num2;
		} else {
			result = "두 수가 같습니다.";
		}
		
		System.out.println(result);
		
	}
}
