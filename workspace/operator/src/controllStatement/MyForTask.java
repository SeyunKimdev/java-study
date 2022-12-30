package controllStatement;

import java.util.Iterator;
import java.util.Scanner;

public class MyForTask {
	public static void main(String[] args) {
//		브론즈
//		1~100까지 출력
//		for(int i=1; i<=100; i++) {
//			System.out.println(i);
//		}
		
//		100~1까지 출력
//		for(int i=100; i>=1; i--) {
//			System.out.println(i);
//		}
		
//		1~100까지 중 짝수만 출력
//		for(int i = 0; i<=98; i=i+2)
//		{
//			System.out.println(i + 2);
//		}
		
//		실버
//		1~10까지 합 출력
//		int result = 0;
//		for(int i = 1; i <= 10; i++)
//		{
//			result += i;
//		}
//		System.out.println(result);
		
//		1~n까지 합 출력
//		int result = 0;
//		int n = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("1~n까지 합\nn: ");
//		n = sc.nextInt();
//		for(int i = 1; i <= n; i++)
//		{
//			result += i;
//		}
//		System.out.println(result);
		
//		골드
//		A~F까지 출력
//		for(int i=65; i<71; i++) {
//			System.out.println((char)i);
//		}
//		A~F까지 중 C제외하고 출력
//		String result = "";
//		for(int i=65; i<71; i++) {
//			result += (i != 67 ? (char)i + "\n" : ""); 
//		}
//		System.out.print(result);
		
		
//		다이아
//		0 1 2 3 0 1 2 3 0 1 2 3 출력
//		String result = "";
//		for(int i = 0; i <= ; i++) {
//			for(int j = 0; j <= 3; j++) {
//				result += j + " ";
//			}
//		}
//		System.out.println(result);
		
//		aBcDeFgH...Z 출력
		String result = "";
		for(int i = 97; i <= 122; i++)
		{
			if(i % 2 == 1) {
				result += (char)i;
			} else {
				result += (char)(i-32);
			}
		}
		System.out.println(result);
	}
}
