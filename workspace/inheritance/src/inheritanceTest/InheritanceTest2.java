package inheritanceTest;

class Human {
	void eat() {
		System.out.println("�Ա�");
	}
	void sleep() {
		System.out.println("���ڱ�");
	}
	void walk() {
		System.out.println("�� �߷� �ȱ�");
	}
	
}

class Monkey extends Human{
	void shakeTail() {
		System.out.println("���� ġ��");
	}

	@Override
	void walk() {
		// TODO Auto-generated method stub
		super.walk();	// �θ𲨸� �����ϸ鼭 �߰�  // �θ� ��� ���ҰŸ� ���ָ� ��
		System.out.println("�� �߷� �ȱ�");
	}
}

public class InheritanceTest2 {
   public static void main(String[] args) {
	   Monkey kingkong = new Monkey();
	   kingkong.walk();
   }
}

