package arrayListTask2;

import java.util.Arrays;

public class Food {
	private String name;
	private int price;
	private String foodType;	// 한식, 중식, 일식, 양식
	
	public Food() {;}

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

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + ", foodType=" + foodType + "]";
	}

	
	
	
}
