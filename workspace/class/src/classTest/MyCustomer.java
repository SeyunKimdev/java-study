package classTest;

public class MyCustomer {
	String name;
	String phoneNumber;
	int balance;
	int discountRate;
	
	public MyCustomer(String name, String phoneNumber, int balance, int discountRate) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.balance = balance;
		this.discountRate = discountRate;
	}
	
	String buyProduct(MyShop shop) {
		int productPrice;
		String result = "";
		productPrice = (shop.price * (100 - this.discountRate)) / 100;
		
		if (this.balance >= productPrice) {
			this.balance -= productPrice;
			shop.stock--;
			result = shop.productName + " ���� : " + shop.price + "��\n������ : " + this.discountRate + "%\n���ε� ��ǰ ���� : " + productPrice + "��\n��� �� ���� �ܰ� : " + this.balance + "��";
//			result += "\n��ǰ �ܿ� ���� : "+shop.stock;
		} else {
			result = "�ܾ� ����";
		}
		
		return result;
	}
	
	
}
