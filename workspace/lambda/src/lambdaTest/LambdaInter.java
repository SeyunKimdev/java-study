package lambdaTest;

@FunctionalInterface
public interface LambdaInter {
	public boolean checkMultipleOf10(int number);
//	public boolean checkMultipleOf20(int number); 메소드를 2개 이상 만들면 오류 -> 1개만 사용 가능
}