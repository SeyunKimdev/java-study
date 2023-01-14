package myCodingTest;

import java.util.Iterator;

public class Test2 {
	public int solve(String input, String password) {
		int[] arInput = new int[input.length()];
		int[] arPassword = new int[password.length()];
		for (int i = 0; i < arInput.length; i++) {
			arInput[i] = input.toCharArray()[i] - 48;
			arPassword[i] = password.toCharArray()[i] - 48;
		}
		int count = 0;
		for (int i = 0; i < arPassword.length; i++) {
//			System.out.println(i + "번째 방 input : " + arInput[i]);
//			System.out.println(i + "번째 방 password : " +arPassword[i]);
			int result = 0;
			if(arInput[i] - arPassword[i] >= 5) {
				result = 10 - (arInput[i] - arPassword[i]);
			} else if(arInput[i] - arPassword[i] <= -5) {
				result = 10 - -(arInput[i] - arPassword[i]);
			} else if(arInput[i] >= arPassword[i]){
				result = arInput[i] - arPassword[i];
			} else {
				result = arPassword[i] - arInput[i];
			}
//			System.out.println(result);
			count += result;
		}
		return count;
	}
	public static void main(String[] args) {
		Test2 test2 = new Test2();
		System.out.println(test2.solve("82195", "64723"));
		System.out.println(test2.solve("00000000000000000000", "91919191919191919191"));
		System.out.println(test2.solve("12345", "12346"));
		System.out.println(test2.solve("12345", "67890"));
	}
}
