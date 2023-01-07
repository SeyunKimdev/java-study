package interfaceTest;

public class Puppy implements Pet {

	@Override
	public void giveYourHand() {
		// TODO Auto-generated method stub
		System.out.println("여기요!");
	}

	@Override
	public void bang() {
		// TODO Auto-generated method stub
		System.out.println("눕는다.");
	}

	@Override
	public void sitDown() {
		// TODO Auto-generated method stub
		System.out.println("앉는다.");
	}

	@Override
	public void waitNow() {
		// TODO Auto-generated method stub
		System.out.println("기다린다.");
	}

	@Override
	public void getNose() {
		// TODO Auto-generated method stub
		System.out.println("손가락에 코를 넣는다.");
	}

}
