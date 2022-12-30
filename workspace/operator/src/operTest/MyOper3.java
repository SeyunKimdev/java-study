package operTest;

import java.util.Scanner;

public class MyOper3 {
	public static void main(String[] args) {
//		사용자에게 키를 입력받고
//		정수라면 정수로 출력
//		실수라면 실수로 출력
//		예)	183 -> 183 출력
//			183.5 -> 183.5 출력
//		삼항 연산자를 사용!
		
//		뺄셈으로 풀면 쉬움
//		서식문자로 풀면 더 쉬움
//		double height = 0.0;
//		double result = 0.0;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("키를 입력해주세요 : ");
//		height = sc.nextDouble();
//		
//		result = height - (int)(height) > 0 ? height : (int)(height); 
//		
//		System.out.printf("%s", height - (int)(height) > 0 ? height : (int)(height));
		
//		사용자에게 입력받은 키를 저장할 변수
		double height = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.print("키를 입력해주세요 : ");
		
//		사용자가 입력한 값을 변수에 담음
		height = sc.nextDouble();
		
//		출력
		System.out.printf(height - (int)height == 0 ? "%.0f" : "%.1f", height);
	}
}
