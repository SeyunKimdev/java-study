package myLambdaTest;

public class PrintNameTest {
	
	public static void printFullName(PrintName printName) {
		System.out.println(printName.getFullName("±è", "¼¼À±")); 
	}
	
	public static void main(String[] args) {
		
		printFullName((l,f) -> l + f);
//		PrintName printName = (l,f) -> l + f;
//		
//		PrintNameTest printNameTest = new PrintNameTest();
//		printNameTest.printFullName(printName);
		
	}
}
