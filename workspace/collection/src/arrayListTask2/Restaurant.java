package arrayListTask2;

import java.util.ArrayList;

public class Restaurant {

	public ArrayList<Food> foods = DBConnecter.foods;
	
	private final double RISE_RATE = 1.1;	// 10% ��� 
//	- ���� �߰�
	public void addFood(Food food) {
		foods.add(food);
	}
	
//	-�̸����� ���� ��ü ����
	public Food findFoodByName(String name) {
		for (int i = 0; i < foods.size(); i++) {
			if(foods.get(i).getName().equals(name)) {
				return foods.get(i);
			}
		}
		return null;
	}
//	-�̸����� ���� ��ü ����
	public Food findFoodByType(String foodType) {
		for (int i = 0; i < foods.size(); i++) {
			if(foods.get(i).getFoodType().equals(foodType)) {
				return foods.get(i);
			}
		}
		return null;
	}
	
//	- ���� �̸����� ���� ���� ��ȸ
	public String checkFood(String name) {
		return findFoodByName(name).getFoodType();
	}
////	- ���� �̸����� ���� ���� ��ȸ
//	public String checkFood(String name) {
//		for (int i = 0; i < foods.size(); i++) {
//			if(foods.get(i).getName().equals(name)) {
//				return foods.get(i).getFoodType(); 
//			}
//		}
//		return null;
//	}
	
//	- ����ڰ� ���ϴ� ������ ���� ��ü ��ȸ
//	public ArrayList<String> checkFoodByType(String foodType) {
//		ArrayList<String> foodNames = new ArrayList<String>();
//		foodNames.add(findFoodByType(foodType).getName());
//		return foodNames;
//	}
//	- ����ڰ� ���ϴ� ������ ���� ��ü ��ȸ
	public ArrayList<String> checkFoodByType(String foodType) {
		ArrayList<String> foodNames = new ArrayList<String>();
		for (int i = 0; i < foods.size(); i++) {
			if(foods.get(i).getFoodType().equals(foodType)) {
				foodNames.add(foods.get(i).getName());
			}
		}
		return foodNames;
	}
	
//	- ���� ���� ���� �� ���� 10% ���
	public void setFoodNameAndPrice(Food food) {
		food.setFoodType(food.getFoodType());
		food.setPrice((int)(food.getPrice() * RISE_RATE));
	}
	
//	- ����ڰ� ���ϴ� ������ ���� ���� ��ȸ
//	public int countFoodByType(String foodType) {
//		int count = 0;
//		if(findFoodByType(foodType).equals(foodType)) count++;
//		return count;
//	}
//	- ����ڰ� ���ϴ� ������ ���� ���� ��ȸ
	public int countFoodByType(String foodType) {
		int count = 0;
		for (int i = 0; i < foods.size(); i++) {
			if(foods.get(i).getFoodType().equals(foodType)) count++;
		}
		return count;
	}
	
}
