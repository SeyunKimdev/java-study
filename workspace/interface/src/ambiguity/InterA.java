package ambiguity;

public interface InterA {
	public default void printData() {	// abstract �ڸ��� abstract�� �ۼ����� �ʾƵ� ������ �Ǿ�
		System.out.println("InterA");	// �ֱ� ������ �� �ڸ��� default�� ����ؾ� �޼ҵ� ���� ����
	}
}
