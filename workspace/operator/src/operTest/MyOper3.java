package operTest;

import java.util.Scanner;

public class MyOper3 {
	public static void main(String[] args) {
//		����ڿ��� Ű�� �Է¹ް�
//		������� ������ ���
//		�Ǽ���� �Ǽ��� ���
//		��)	183 -> 183 ���
//			183.5 -> 183.5 ���
//		���� �����ڸ� ���!
		
//		�������� Ǯ�� ����
//		���Ĺ��ڷ� Ǯ�� �� ����
//		double height = 0.0;
//		double result = 0.0;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Ű�� �Է����ּ��� : ");
//		height = sc.nextDouble();
//		
//		result = height - (int)(height) > 0 ? height : (int)(height); 
//		
//		System.out.printf("%s", height - (int)(height) > 0 ? height : (int)(height));
		
//		����ڿ��� �Է¹��� Ű�� ������ ����
		double height = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Ű�� �Է����ּ��� : ");
		
//		����ڰ� �Է��� ���� ������ ����
		height = sc.nextDouble();
		
//		���
		System.out.printf(height - (int)height == 0 ? "%.0f" : "%.1f", height);
	}
}
