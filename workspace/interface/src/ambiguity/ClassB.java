package ambiguity;

public class ClassB extends ClassA implements InterA/* , InterB */ {

	@Override
		public void printData() {		// ������ �θ� Ŭ������ �켱������ ������, �������̽��� �ִ�
			super.printData();			// �޼ҵ带 ����ϰ� ������ ������ �ϸ� �����ϴ�.
		}
	
//	@Override
//	public void printData() {
//		// TODO Auto-generated method stub
//		InterA.super.printData();	// ���ϴ� �θ��� ���� ��� ����� �� ����
////		InterB.super.printData();
//	}
	public static void main(String[] args) {
		new ClassB().printData();
	}
}
