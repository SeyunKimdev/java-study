package interfaceTest;

public interface Pet {
	public final static int EYES = 2;	// �������̽����� ����� �߻�޼ҵ常 �����Ѵ�
								// final static ���� ����
								// static ���̴� ���� : ��� ��ü�� ���� �Ϸ���
	public int NOSE = 1;
	
	public abstract void giveYourHand();	// �������̽��� �߻�޼ҵ常 ���� �����ϱ� ������ abstract Ű���� ���� ����
	public void bang();
	public void sitDown();
	public void waitNow();
	public void getNose();
}
