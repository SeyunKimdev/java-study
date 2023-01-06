package castingTest;

public class Drama extends Video{

	public void goods() {
		System.out.println("굿즈(Drama)");
	}
	
	@Override
	void playVideo() {
		super.playVideo();
		System.out.println("드라마 영상 실행");
	}
}
