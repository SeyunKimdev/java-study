package exceptionTest;

import java.util.Scanner;

public class Chatting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = null;
		
		System.out.println("�޼���: ");
		message = sc.nextLine();
		
		if(message.contains("�ٺ�")) {
			try {
				throw new BadWordException("�弳�� �ȵſ�!");
			} catch (BadWordException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		
	}
}
