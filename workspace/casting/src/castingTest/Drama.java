package castingTest;

public class Drama extends Video{

	public void goods() {
		System.out.println("����(Drama)");
	}
	
	@Override
	void playVideo() {
		super.playVideo();
		System.out.println("��� ���� ����");
	}
}
