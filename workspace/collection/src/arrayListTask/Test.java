package arrayListTask;

public class Test {
	public static void main(String[] args) {
		Market market = new Market();
		Fruit apple = new Fruit();
		Fruit orange = new Fruit();
		Fruit grapes = new Fruit();
		
		apple.setName("���");
		apple.setPrice(2000);
		
		orange.setName("������");
		orange.setPrice(3000);
		
		grapes.setName("����");
		grapes.setPrice(4000);
		
		market.addFruit(apple);
		market.addFruit(apple);	// �ߺ�Ȯ��
		market.addFruit(orange);
		market.addFruit(grapes);
		
//		System.out.println(market.checkCheaperThanAvg(apple));
//		System.out.println(market.checkCheaperThanAvg(grapes));
		System.out.println(market.checkFruit());
//		System.out.println(market.checkFruitByName("���"));
	}

}
