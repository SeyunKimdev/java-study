package myCodingTest;

public class Test1 {
	public int solution(String input){
		char[] numbers = input.toCharArray();
		int count = 0;
		int countMax = 0;
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] == '0') count = 0;
			if(numbers[i] == '1') {
				count++;
				if(count >= countMax) {
					countMax = count;
				}
			}
//			try {
//				if(numbers[i] == '1' && numbers[i + 1] == '1') {	// number[i+1] 때문에 오류남
//					count++;
//					if(count >= countMax) {
//						countMax = count;
//					}
//				}
//			} catch (Exception e) {;}
		}
		return countMax;
	}
	public static void main(String[] args) {
		Test1 test1 = new Test1();
		System.out.println(test1.solution("110111"));
		System.out.println(test1.solution("11"));
		System.out.println(test1.solution("1111111"));
	}
}
