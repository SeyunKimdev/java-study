package methodTest;

import java.util.Scanner;

public class MyMethodTask {
//	1 ~ 10���� println()���� ����ϴ� �޼ҵ�
	void printNum() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
	}
	
//	"ȫ�浿"�� n�� println()���� ����ϴ� �޼ҵ�
	void printHgd(int n) {
		for(int i = 0; i < n; i++) {
			System.out.println("ȫ�浿");
		}
	}
	
	//	�̸��� n�� println()���� ����ϴ� �޼ҵ�
	void printName(String name, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(name);
		}
	}
	
//	�� ������ ������ ���ִ� �޼ҵ�
	int minusThreeNum(int num1, int num2, int num3) {
		int result = num1 - num2 - num3;
		return result;
	}
	
//	�� ������ ������ �� ��� ������ �� ���� ���ϴ� �޼ҵ� 
	int[] div(int num1, int num2){
		int share = num1 / num2;
		int remainder = num1 % num2;
		
		int[] arResult = {share, remainder};
		return arResult;
	}
	
//	1~n������ ���� �����ִ� �޼ҵ�
	int sum(int num){
		int result = 0;
		for (int i = 1; i <= num; i++) {
			result += i;
		}
		
		return result;
	}
	
//	Ȧ���� ¦����, ¦���� Ȧ���� �ٲ��ִ� �޼ҵ�
	int changeOddEven(int num) {
		if(num == 1) {
			num += 1;
		} else {
			num += 1;
		}
		return num;
	}
	
//	���ڿ��� �Է¹ް� �ҹ��ڴ� �빮�ڷ�, �빮�ڴ� �ҹ��ڷ� �ٲ��ִ� �޼ҵ�
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
	
//  ���ڿ��� �Է¹ް� ���ϴ� ������ ������ �����ִ� �޼ҵ�
	int countCh(String str, char c) {
		int result = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == c) {
				result++;
			}
		}
		return result;
	}
	
//	5���� ������ �Է¹��� �� ���ϴ� �ε����� ���� �����ִ� �޼ҵ�
	int findIndex(int[] arNumbers, int index) {
		return arNumbers[index];
	}
	
//	�ѱ��� ������ �ٲ��ִ� �޼ҵ�(�ϰ��̻� -> 1024)
	String changeToNum(String num) {
		String result="";
		
		String hangle = "�����̻�����ĥ�ȱ�";
		
		for(int i = 0; i < num.length(); i++) {
			result += hangle.indexOf(num.charAt(i));
		}
		
		return result;
	}
	
//	5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�
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
		
////		�ִ밪
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
////		�ּҰ�
//		for(int i=0; i<5; i++) {
//			minNum = arNum[0];
//			minNum = minNum >= arNum[i] ? arNum[i] : minNum; 
//		}
		
		
		
	}
	
//	5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�(void)
	void findMaxMinVoid(int[] arNum) {
		int maxNum = arNum[0];
		int minNum = arNum[0];
//		int[] result = new int[2];
		
		for (int i = 1; i < arNum.length; i++) {
			if(maxNum < arNum[i]) {maxNum = arNum[i];}
			if(minNum > arNum[i]) {minNum = arNum[i];}
		}
		
		System.out.println("�ִ밪 : " + maxNum);
		System.out.println("�ּҰ� : " + minNum);
	}
	
//	indexOf() �����
//	���ڿ��� ���ڸ� �Է¹��� �� �ش� ���ڰ� �� ��° �ε����� �ִ� �� �˻��ϰ�
//	���� �ش� ���ڰ� ������ -1�� �����Ѵ�.
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
//		mt.printNum();		// 1��
//		mt.printHgd(5);	// 2��	
//		mt.printName("�輼��", 5);
//		System.out.println(mt.minusThreeNum(10, 5, 2));
//		System.out.println("�� : " + mt.div(10, 3)[0]);
//		System.out.println("������ : " + mt.div(10, 3)[1]);
		
//		System.out.println(mt.sum(10));
//		System.out.println(mt.changeOddEven(2));
//		System.out.println(mt.changeLetter("HEllo"));
//		System.out.println(mt.countCh("abababb", 'b'));
//		System.out.println(mt.changeToNum("�ϰ��̻�"));
//		System.out.println(mt.findMaxMin(2, 1, 4, 9, 8)[0]);
//		System.out.println(mt.findMaxMin(2, 1, 4, 9, 8)[1]);
//		int[] arNum = {1548,15,87,4,5};
//		mt.findMaxMinVoid(arNum);
		
		System.out.println(mt.findIndexFromStr("ABCABCD", 'D'));
		
		
	}
}
