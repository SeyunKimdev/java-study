package arrayListTask2;

import java.util.ArrayList;

public class Restaurant {

	public ArrayList<Food> foods = DBConnecter.foods;
	
	private final double RISE_RATE = 1.1;	// 10% 상승 
//	- 음식 추가
	public void addFood(Food food) {
		foods.add(food);
	}
	
//	-이름으로 음식 객체 접근
	public Food findFoodByName(String name) {
		for (int i = 0; i < foods.size(); i++) {
			if(foods.get(i).getName().equals(name)) {
				return foods.get(i);
			}
		}
		return null;
	}
//	-이름으로 음식 객체 접근
	public Food findFoodByType(String foodType) {
		for (int i = 0; i < foods.size(); i++) {
			if(foods.get(i).getFoodType().equals(foodType)) {
				return foods.get(i);
			}
		}
		return null;
	}
	
//	- 음식 이름으로 음식 종류 조회
	public String checkFood(String name) {
		return findFoodByName(name).getFoodType();
	}
////	- 음식 이름으로 음식 종류 조회
//	public String checkFood(String name) {
//		for (int i = 0; i < foods.size(); i++) {
//			if(foods.get(i).getName().equals(name)) {
//				return foods.get(i).getFoodType(); 
//			}
//		}
//		return null;
//	}
	
//	- 사용자가 원하는 종류의 음식 전체 조회
//	public ArrayList<String> checkFoodByType(String foodType) {
//		ArrayList<String> foodNames = new ArrayList<String>();
//		foodNames.add(findFoodByType(foodType).getName());
//		return foodNames;
//	}
//	- 사용자가 원하는 종류의 음식 전체 조회
	public ArrayList<String> checkFoodByType(String foodType) {
		ArrayList<String> foodNames = new ArrayList<String>();
		for (int i = 0; i < foods.size(); i++) {
			if(foods.get(i).getFoodType().equals(foodType)) {
				foodNames.add(foods.get(i).getName());
			}
		}
		return foodNames;
	}
	
//	- 음식 종류 수정 후 가격 10% 상승
	public void setFoodNameAndPrice(Food food) {
		food.setFoodType(food.getFoodType());
		food.setPrice((int)(food.getPrice() * RISE_RATE));
	}
	
//	- 사용자가 원하는 종류의 음식 개수 조회
//	public int countFoodByType(String foodType) {
//		int count = 0;
//		if(findFoodByType(foodType).equals(foodType)) count++;
//		return count;
//	}
//	- 사용자가 원하는 종류의 음식 개수 조회
	public int countFoodByType(String foodType) {
		int count = 0;
		for (int i = 0; i < foods.size(); i++) {
			if(foods.get(i).getFoodType().equals(foodType)) count++;
		}
		return count;
	}
	
}
