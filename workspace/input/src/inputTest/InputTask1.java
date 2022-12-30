package inputTest;

import java.util.Scanner;

public class InputTask1 {
	public static void main(String[] args) {
//		두 정수를 입력한 뒤 덧셈 결과 출력
//		단, next()만 사용한다.
		Scanner sc = new Scanner(System.in);
		String num1="", num2="";
		System.out.print("두개의 정수를 입력해주세요 : ");
		num1 = sc.next();
		num2 = sc.next();
		int result = Integer.parseInt(num1) + Integer.parseInt(num2);
		
		System.out.println("두 정수의 합은 " + result + "입니다.");
	}
}
