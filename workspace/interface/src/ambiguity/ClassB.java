package ambiguity;

public class ClassB extends ClassA implements InterA/* , InterB */ {

	@Override
		public void printData() {		// 무조건 부모 클래스의 우선순위가 높지만, 인터페이스에 있는
			super.printData();			// 메소드를 사용하고 싶으면 재정의 하면 가능하다.
		}
	
//	@Override
//	public void printData() {
//		// TODO Auto-generated method stub
//		InterA.super.printData();	// 원하는 부모의 것을 골라 사용할 수 있음
////		InterB.super.printData();
//	}
	public static void main(String[] args) {
		new ClassB().printData();
	}
}
