package inputTest;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		초기값 : 아직 어떤 값을 넣을 지 모를 때 넣는 값
//		정수 : 0
//		실수 : 0.0
//		문자 : ' '
//		문자열 : null 또는 "" <- 빈문자열
		
		String name = "";
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.println("안녕하세요. " + name + " 회원님");
	}
}
