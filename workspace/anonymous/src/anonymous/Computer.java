package anonymous;

public class Computer {
	public static void main(String[] args) {
//		�������̽��� �������� ���� �ʵ尡 �����ϱ� ������, 
//		�͸� Ŭ������ ���� �� �������̽��� �����Ͽ� ������Ų��.
//		������ �͸� Ŭ������ �ʵ尡 �޸𸮿� �Ҵ�� �� �������̽� Ÿ���� 
//		��ü�� up casting �ȴ�.
		
		Game game = new Game() {
			
//			int data2 = 10; // ��ĳ���� �Ǹ鼭 +a�� �߸��� ������ 
							// ���� �ȵ� �κи� ä���ָ� �ȴ�.
			
			@Override
			public void play() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void exit() {
				// TODO Auto-generated method stub
				
			}
		};
		
	}
}
