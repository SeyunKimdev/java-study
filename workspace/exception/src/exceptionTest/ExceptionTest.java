package exceptionTest;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
			System.out.println("연산 성공!");
			
		} catch (ArithmeticException e) {
//			e.printStackTrace(); 	// 오류 발생했을 때 검증하기 위함
//			System.out.println(e.getMessage());
//			System.out.println(e);
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
