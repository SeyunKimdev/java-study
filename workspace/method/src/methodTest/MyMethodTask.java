package methodTest;

import java.util.Scanner;

public class MyMethodTask {
//	1 ~ 10까지 println()으로 출력하는 메소드
	void printNum() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
	}
	
//	"홍길동"을 n번 println()으로 출력하는 메소드
	void printHgd(int n) {
		for(int i = 0; i < n; i++) {
			System.out.println("홍길동");
		}
	}
	
	//	이름을 n번 println()으로 출력하는 메소드
	void printName(String name, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(name);
		}
	}
	
//	세 정수의 뺄셈을 해주는 메소드
	int minusThreeNum(int num1, int num2, int num3) {
		int result = num1 - num2 - num3;
		return result;
	}
	
//	두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드 
	int[] div(int num1, int num2){
		int share = num1 / num2;
		int remainder = num1 % num2;
		
		int[] arResult = {share, remainder};
		return arResult;
	}
	
//	1~n까지의 합을 구해주는 메소드
	int sum(int num){
		int result = 0;
		for (int i = 1; i <= num; i++) {
			result += i;
		}
		
		return result;
	}
	
//	홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드
	int changeOddEven(int num) {
		if(num == 1) {
			num += 1;
		} else {
			num += 1;
		}
		return num;
	}
	
//	문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
	String changeLetter(String input) {
		String result = "";
		for(int i=0; i<input.length(); i++) {
			if((int)(input.charAt(i)) >= 65 && (int)(input.charAt(i)) <= 90) {
				result += (char)((int)(input.charAt(i)) + 32);
			} else if((int)(input.charAt(i)) >= 97 && (int)(input.charAt(i)) <= 122){
				result += (char)((int)(input.charAt(i)) - 32);
			} else {
				result += input.charAt(i);
			}
		}
		return result;
	}
	
//  문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드
	int countCh(String str, char c) {
		int result = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == c) {
				result++;
			}
		}
		return result;
	}
	
//	5개의 정수를 입력받은 후 원하는 인덱스의 값을 구해주는 메소드
	int findIndex(int[] arNumbers, int index) {
		return arNumbers[index];
	}
	
//	한글을 정수로 바꿔주는 메소드(일공이사 -> 1024)
	String changeToNum(String num) {
		String result="";
		
		String hangle = "공일이삼사오육칠팔구";
		
		for(int i = 0; i < num.length(); i++) {
			result += hangle.indexOf(num.charAt(i));
		}
		
		return result;
	}
	
//	5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
	int[] findMaxMin(int num1, int num2, int num3, int num4, int num5) {
		int[] arNum = {num1, num2, num3, num4, num5};
		int[] result = new int[2];
		int maxNum = num1;
		int minNum = num1;
		
		for (int i = 1; i < arNum.length; i++) {
			if(maxNum < arNum[i]) {maxNum = arNum[i];}
			if(minNum > arNum[i]) {minNum = arNum[i];}
		}
		
		result[0] = maxNum;
		result[1] = minNum;
		
		return result;
		
////		최대값
//		if(num2 >= maxNum) {
//			maxNum = num2;
//		} else if(num3 >= maxNum) {
//			maxNum = num3;
//		} else if(num4 >= maxNum) {
//			maxNum = num4;
//		} else if(num5 >= maxNum) {
//			maxNum = num5;
//		} 
//		
////		최소값
//		for(int i=0; i<5; i++) {
//			minNum = arNum[0];
//			minNum = minNum >= arNum[i] ? arNum[i] : minNum; 
//		}
		
		
		
	}
	
//	5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드(void)
	void findMaxMinVoid(int[] arNum) {
		int maxNum = arNum[0];
		int minNum = arNum[0];
//		int[] result = new int[2];
		
		for (int i = 1; i < arNum.length; i++) {
			if(maxNum < arNum[i]) {maxNum = arNum[i];}
			if(minNum > arNum[i]) {minNum = arNum[i];}
		}
		
		System.out.println("최대값 : " + maxNum);
		System.out.println("최소값 : " + minNum);
	}
	
//	indexOf() 만들기
//	문자열과 문자를 입력받은 뒤 해당 문자가 몇 번째 인덱스에 있는 지 검사하고
//	만약 해당 문자가 없으면 -1을 리턴한다.
	String findIndexFromStr(String str, char c) {
		boolean check = false;
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			check = str.charAt(i) == c;
			if(check) {
				result += i + ",";
			} 
		}
		if(result == "") {
			result = "-1";
		}
		if(result.charAt(result.length()-1) == ',') {
			result = result.substring(0, result.length()-1);
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		MyMethodTask mt = new MyMethodTask();
//		mt.printNum();		// 1번
//		mt.printHgd(5);	// 2번	
//		mt.printName("김세윤", 5);
//		System.out.println(mt.minusThreeNum(10, 5, 2));
//		System.out.println("몫 : " + mt.div(10, 3)[0]);
//		System.out.println("나머지 : " + mt.div(10, 3)[1]);
		
//		System.out.println(mt.sum(10));
//		System.out.println(mt.changeOddEven(2));
//		System.out.println(mt.changeLetter("HEllo"));
//		System.out.println(mt.countCh("abababb", 'b'));
//		System.out.println(mt.changeToNum("일공이사"));
//		System.out.println(mt.findMaxMin(2, 1, 4, 9, 8)[0]);
//		System.out.println(mt.findMaxMin(2, 1, 4, 9, 8)[1]);
//		int[] arNum = {1548,15,87,4,5};
//		mt.findMaxMinVoid(arNum);
		
		System.out.println(mt.findIndexFromStr("ABCABCD", 'D'));
		
		
	}
}
