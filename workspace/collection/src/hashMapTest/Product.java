package hashMapTest;

public class Product {
	private int number;	// ��ȣ
	private String name;// �̸�
	private int price;	// ����
	private int stock;	// ���
	
	public Product() {;}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Goods [number=" + number + ", name=" + name + ", price=" + price + ", stock=" + stock + "]";
	}

	public Product(int number, String name, int price, int stock) {
		super();
		this.number = number;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	
}
