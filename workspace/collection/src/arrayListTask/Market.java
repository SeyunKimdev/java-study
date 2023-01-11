package arrayListTask;

import java.util.ArrayList;

public class Market {

	public ArrayList<Fruit> fruits = DBConnecter.fruits;
	
//	���� �߰�
	public void addFruit(Fruit fruit) {
		if(!fruits.contains(fruit)) {
			fruits.add(fruit);
		}
	}
//	public void addFruit(Fruit fruit) {
//			fruits.add(fruit);
//	}
	
//	���� ����
	public void removeFruit(Fruit fruit) {
		fruits.remove(fruit);
	}
	
//	���� ������ ��� ���ݺ��� ���� �� �˻�
	public boolean checkCheaperThanAvg(Fruit fruit) {
		int sum = 0;
		double avg = 0.0;
		for (int i = 0; i < fruits.size(); i++) {
			sum += fruits.get(i).getPrice();
		}
		avg = sum / fruits.size();
		return fruit.getPrice() < avg;
	}
	
//	���� �ߴ� ��
//	���� ������ ��� ���ݺ��� ���� �� �˻�
//	public boolean checkPrice(int price) {
//		int sum = 0;
//		double avg = 0.0;
//		for (int i = 0; i < fruits.size(); i++) {
//			sum += fruits.get(i).getPrice();
//		}
//		avg = sum / fruits.size();
//		return price < avg;
//	}
	
//	���� ��ü ��ȸ
	public ArrayList<Fruit> checkFruit() {
		return fruits;
	}
	
//	���� �̸����� ��ü ��ȸ
	public Fruit checkFruitByName(String name) {
		for (int i = 0; i < fruits.size(); i++) {
			if(fruits.get(i).getName().equals(name)) {
				return fruits.get(i);
			}
		}
		return null;
	}
}
