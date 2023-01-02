package stringTest;

import java.util.Scanner;

public class MyStringTask {
	public static void main(String[] args) {
//		사용자에게 입력받은 문자열 중 소문자는 모두 대문자로,
//		대문자는 모두 소문자로 변경한다.
//		String input = "", result = "", msg = "영어 문자를 입력해주세요 : ";
//		Scanner sc = new Scanner(System.in);
//		System.out.println(msg);
//		input = sc.nextLine();
//		for(int i = 0; i < input.length(); i++) {
//			if((int)(input.charAt(i)) >= 97 && (int)(input.charAt(i)) <= 122){
//				result += (char)((int)(input.charAt(i)) - 32);
//			} else if((int)(input.charAt(i)) >= 65 && (int)(input.charAt(i)) <= 90){
//				result += (char)((int)(input.charAt(i)) + 32);
//			}
//		}
//		System.out.println(result);
//		정수를 한글로 변경
//		예) 1024 -> 일공이사
		String hangle = "공일이삼사오육칠팔구";
		String result = "", input="", msg="한글로 변환할 정수를 입력해주세요 : ";
		
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		input = sc.next();
		for(int i = 0; i < input.length(); i++) {
			result += hangle.charAt((int)(input.charAt(i) - 48));
		}
		System.out.println(result);
		
//		한글을 정수로 변경
//		예) 일공이사 -> 1024
//		String hangle = "공일이삼사오육칠팔구";
//		String result = "", input="", msg="숫자로 변환할 한글 정수를 입력해주세요 : ";
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print(msg);
//		input = sc.next();
//		for(int i = 0; i < input.length(); i++) {
//			result += hangle.indexOf(input.charAt(i));
//		}
//		System.out.println(result);
		
	}
}
