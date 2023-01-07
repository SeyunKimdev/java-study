package interfaceTest;

public interface Pet {
	public final static int EYES = 2;	// 인터페이스에는 상수와 추상메소드만 존재한다
								// final static 생략 가능
								// static 붙이는 이유 : 모든 객체가 공유 하려고
	public int NOSE = 1;
	
	public abstract void giveYourHand();	// 인터페이스는 추상메소드만 선언 가능하기 때문에 abstract 키워드 생략 가능
	public void bang();
	public void sitDown();
	public void waitNow();
	public void getNose();
}
