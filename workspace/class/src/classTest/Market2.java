package classTest;

class Company2 {
	static int sequence;
	static int total;
	int id;
	String name;
	int income;
	
//	초기화 블럭
//	생성자 호출될 때마다 실행
	
	{
		this.id = ++sequence;
	}
}

public class Market2 {
	public static void main(String[] args) {
		Company2 한동석 = new Company2();
		Company2 정유찬 = new Company2();
		Company2 오태양 = new Company2();
		Company2 김욱성 = new Company2();
		
		
		System.out.println(한동석.id);
		System.out.println(정유찬.id);
		System.out.println(오태양.id);
		System.out.println(김욱성.id);
		
		Company2.total += 한동석.income = 1000;
		Company2.total += 정유찬.income = 2000;
		Company2.total += 오태양.income = -10000;
		Company2.total += 김욱성.income = -20000;
		
		System.out.println("회사 수익 : " + Company.total + "만원");
	}
}
