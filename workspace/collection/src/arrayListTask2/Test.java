package arrayListTask2;

public class Test {
	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant();
		Food jjajangmyeon = new Food();
		Food doncatz = new Food();
		Food samgyupsal = new Food();
		Food risotto = new Food();
		Food ramen = new Food();
		Food sushi = new Food();
		
		
		jjajangmyeon.setName("¥���");
		jjajangmyeon.setPrice(5000);
		jjajangmyeon.setFoodType("�߽�");
		
		doncatz.setName("���");
		doncatz.setPrice(6000);
		doncatz.setFoodType("�Ͻ�");
		
		samgyupsal.setName("����");
		samgyupsal.setPrice(8000);
		samgyupsal.setFoodType("�ѽ�");
		
		risotto.setName("������");
		risotto.setPrice(7000);
		risotto.setFoodType("���");
		
		ramen.setName("���");
		ramen.setPrice(3000);
		ramen.setFoodType("�Ͻ�");
		
		sushi.setName("����");
		sushi.setPrice(10000);
		sushi.setFoodType("�Ͻ�");
		
		
		
		
		
		restaurant.addFood(jjajangmyeon);
		restaurant.addFood(doncatz);
		restaurant.addFood(samgyupsal);
		restaurant.addFood(risotto);
		restaurant.addFood(ramen);
		restaurant.addFood(sushi);
		
		System.out.println(restaurant.checkFood("����"));
		System.out.println(restaurant.foods);
		
		System.out.println(restaurant.checkFoodByType("�Ͻ�"));
		System.out.println(restaurant.countFoodByType("�Ͻ�"));
		restaurant.setFoodNameAndPrice(ramen);
		System.out.println(restaurant.checkFoodByType("�ѽ�"));
		System.out.println(restaurant.checkFoodByType("�Ͻ�"));
		System.out.println(restaurant.foods);
	}
}
