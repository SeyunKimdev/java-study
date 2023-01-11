package arrayListTask;

import java.util.ArrayList;

public class Market {

	public ArrayList<Fruit> fruits = DBConnecter.fruits;
	
//	과일 추가
	public void addFruit(Fruit fruit) {
		if(!fruits.contains(fruit)) {
			fruits.add(fruit);
		}
	}
//	public void addFruit(Fruit fruit) {
//			fruits.add(fruit);
//	}
	
//	과일 삭제
	public void removeFruit(Fruit fruit) {
		fruits.remove(fruit);
	}
	
//	과일 가격이 평균 가격보다 낮은 지 검사
	public boolean checkCheaperThanAvg(Fruit fruit) {
		int sum = 0;
		double avg = 0.0;
		for (int i = 0; i < fruits.size(); i++) {
			sum += fruits.get(i).getPrice();
		}
		avg = sum / fruits.size();
		return fruit.getPrice() < avg;
	}
	
//	원래 했던 것
//	과일 가격이 평균 가격보다 낮은 지 검사
//	public boolean checkPrice(int price) {
//		int sum = 0;
//		double avg = 0.0;
//		for (int i = 0; i < fruits.size(); i++) {
//			sum += fruits.get(i).getPrice();
//		}
//		avg = sum / fruits.size();
//		return price < avg;
//	}
	
//	과일 전체 조회
	public ArrayList<Fruit> checkFruit() {
		return fruits;
	}
	
//	과일 이름으로 전체 조회
	public Fruit checkFruitByName(String name) {
		for (int i = 0; i < fruits.size(); i++) {
			if(fruits.get(i).getName().equals(name)) {
				return fruits.get(i);
			}
		}
		return null;
	}
}
