package ambiguity;

public interface InterA {
	public default void printData() {	// abstract 자리에 abstract를 작성하지 않아도 생략이 되어
		System.out.println("InterA");	// 있기 때문에 그 자리에 default를 사용해야 메소드 선언 가능
	}
}
