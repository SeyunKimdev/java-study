package operTest;

import java.util.Scanner;

public class MyOper4 {
   public static void main(String[] args) {
//      �ɸ� �׽�Ʈ
      /*
       * Q. ����� �����ϴ� ���� �����ϼ���.
       * 1. ������
       * 2. �����
       * 3. ������
       * 4. ���
       * 
       * ������ : �Ұ��� �������̰� �������̴�.
       * ����� : �߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�.
       * ������ : �����ϰ� ����ϰ� ��ö�ϰ� ������.
       * ��� : õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.
       * 
       */
	   String question = "Q. ����� �����ϴ� ���� �����ϼ���.\n"
	   		+ "1. ������\n"
	   		+ "2. �����\n"
	   		+ "3. ������\n"
	   		+ "4. ���\n",result = "";
	   
	   int choice = 0;
	   Scanner sc = new Scanner(System.in);
	   System.out.print(question);
	   choice = sc.nextInt();
	   
	   result = choice == 1 ? "�Ұ��� �������̰� �������̴�."
			   		: choice == 2 ? "�߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�."
			   				: choice == 3 ? "�����ϰ� ����ϰ� ��ö�ϰ� ������."
			   						: choice == 4 ? "õ�簰�� ����ϰ� ������ �����ϰ� ������� ����." : "����� �Է����ּ���.";
	   
	   System.out.println(result);
	   
	   
	   
	   
   }
}