package classTest;

class Company2 {
	static int sequence;
	static int total;
	int id;
	String name;
	int income;
	
//	�ʱ�ȭ ��
//	������ ȣ��� ������ ����
	
	{
		this.id = ++sequence;
	}
}

public class Market2 {
	public static void main(String[] args) {
		Company2 �ѵ��� = new Company2();
		Company2 ������ = new Company2();
		Company2 ���¾� = new Company2();
		Company2 ��� = new Company2();
		
		
		System.out.println(�ѵ���.id);
		System.out.println(������.id);
		System.out.println(���¾�.id);
		System.out.println(���.id);
		
		Company2.total += �ѵ���.income = 1000;
		Company2.total += ������.income = 2000;
		Company2.total += ���¾�.income = -10000;
		Company2.total += ���.income = -20000;
		
		System.out.println("ȸ�� ���� : " + Company.total + "����");
	}
}
