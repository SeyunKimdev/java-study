package arrayListTask;

public class Test {
	public static void main(String[] args) {
		Market market = new Market();
		Fruit apple = new Fruit();
		Fruit orange = new Fruit();
		Fruit grapes = new Fruit();
		
		apple.setName("사과");
		apple.setPrice(2000);
		
		orange.setName("오렌지");
		orange.setPrice(3000);
		
		grapes.setName("포도");
		grapes.setPrice(4000);
		
		market.addFruit(apple);
		market.addFruit(apple);	// 중복확인
		market.addFruit(orange);
		market.addFruit(grapes);
		
//		System.out.println(market.checkCheaperThanAvg(apple));
//		System.out.println(market.checkCheaperThanAvg(grapes));
		System.out.println(market.checkFruit());
//		System.out.println(market.checkFruitByName("사과"));
	}

}
