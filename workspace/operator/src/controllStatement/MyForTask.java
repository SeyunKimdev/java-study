package controllStatement;

import java.util.Iterator;
import java.util.Scanner;

public class MyForTask {
	public static void main(String[] args) {
//		�����
//		1~100���� ���
//		for(int i=1; i<=100; i++) {
//			System.out.println(i);
//		}
		
//		100~1���� ���
//		for(int i=100; i>=1; i--) {
//			System.out.println(i);
//		}
		
//		1~100���� �� ¦���� ���
//		for(int i = 0; i<=98; i=i+2)
//		{
//			System.out.println(i + 2);
//		}
		
//		�ǹ�
//		1~10���� �� ���
//		int result = 0;
//		for(int i = 1; i <= 10; i++)
//		{
//			result += i;
//		}
//		System.out.println(result);
		
//		1~n���� �� ���
//		int result = 0;
//		int n = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("1~n���� ��\nn: ");
//		n = sc.nextInt();
//		for(int i = 1; i <= n; i++)
//		{
//			result += i;
//		}
//		System.out.println(result);
		
//		���
//		A~F���� ���
//		for(int i=65; i<71; i++) {
//			System.out.println((char)i);
//		}
//		A~F���� �� C�����ϰ� ���
//		String result = "";
//		for(int i=65; i<71; i++) {
//			result += (i != 67 ? (char)i + "\n" : ""); 
//		}
//		System.out.print(result);
		
		
//		���̾�
//		0 1 2 3 0 1 2 3 0 1 2 3 ���
//		String result = "";
//		for(int i = 0; i <= ; i++) {
//			for(int j = 0; j <= 3; j++) {
//				result += j + " ";
//			}
//		}
//		System.out.println(result);
		
//		aBcDeFgH...Z ���
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
