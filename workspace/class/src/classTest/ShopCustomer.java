package classTest;

public class ShopCustomer {

	void discount(MyShop shop, MyCustomer customer) {
		int productPrice;
		productPrice = shop.price * (100 - customer.discountRate);
	}
	

//	String buyProduct(Shop shop, Customer customer) {
//		int productPrice;
//		String result = "";
//		productPrice = shop.price * (100 - customer.discountRate);
//		
//		if (customer.balance >= productPrice) {
//			customer.balance -= productPrice;
//			result = customer.balance + "";
//		} else {
//			result = "�ܾ� ����";
//		}
//		
//		return result;
//	}
	
	public static void main(String[] args) {
		MyShop snack = new MyShop("����", 1500, 5);
		MyShop beer = new MyShop("����", 3000, 10);
		MyShop chocolate = new MyShop("���ݸ�", 1000, 20);
		MyCustomer customer1 = new MyCustomer("1�� �մ�", "010-1234-1234", 20000, 50);
		MyCustomer customer2 = new MyCustomer("2�� �մ�", "010-5633-7014", 100000, 30);
		MyCustomer customer3 = new MyCustomer("3�� �մ�", "010-4854-5644", 50000, 20);
		
		System.out.println(customer1.buyProduct(chocolate));
		System.out.println(customer1.buyProduct(chocolate));
		System.out.println(customer1.buyProduct(beer));
		System.out.println();
		
	}
}
