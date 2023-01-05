package inheritanceTest;

class Human {
	void eat() {
		System.out.println("먹기");
	}
	void sleep() {
		System.out.println("잠자기");
	}
	void walk() {
		System.out.println("두 발로 걷기");
	}
	
}

class Monkey extends Human{
	void shakeTail() {
		System.out.println("꼬리 치기");
	}

	@Override
	void walk() {
		// TODO Auto-generated method stub
		super.walk();	// 부모꺼를 유지하면서 추가  // 부모꺼 사용 안할거면 없애면 됨
		System.out.println("네 발로 걷기");
	}
}

public class InheritanceTest2 {
   public static void main(String[] args) {
	   Monkey kingkong = new Monkey();
	   kingkong.walk();
   }
}

