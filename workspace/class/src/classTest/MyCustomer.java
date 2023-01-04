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
			result = shop.productName + " 가격 : " + shop.price + "원\n할인율 : " + this.discountRate + "%\n할인된 상품 가격 : " + productPrice + "원\n계산 후 통장 잔고 : " + this.balance + "원";
//			result += "\n상품 잔여 개수 : "+shop.stock;
		} else {
			result = "잔액 부족";
		}
		
		return result;
	}
	
	
}
