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
		
		
		jjajangmyeon.setName("짜장면");
		jjajangmyeon.setPrice(5000);
		jjajangmyeon.setFoodType("중식");
		
		doncatz.setName("돈까스");
		doncatz.setPrice(6000);
		doncatz.setFoodType("일식");
		
		samgyupsal.setName("삼겹살");
		samgyupsal.setPrice(8000);
		samgyupsal.setFoodType("한식");
		
		risotto.setName("리조또");
		risotto.setPrice(7000);
		risotto.setFoodType("양식");
		
		ramen.setName("라멘");
		ramen.setPrice(3000);
		ramen.setFoodType("일식");
		
		sushi.setName("스시");
		sushi.setPrice(10000);
		sushi.setFoodType("일식");
		
		
		
		
		
		restaurant.addFood(jjajangmyeon);
		restaurant.addFood(doncatz);
		restaurant.addFood(samgyupsal);
		restaurant.addFood(risotto);
		restaurant.addFood(ramen);
		restaurant.addFood(sushi);
		
		System.out.println(restaurant.checkFood("삼겹살"));
		System.out.println(restaurant.foods);
		
		System.out.println(restaurant.checkFoodByType("일식"));
		System.out.println(restaurant.countFoodByType("일식"));
		restaurant.setFoodNameAndPrice(ramen);
		System.out.println(restaurant.checkFoodByType("한식"));
		System.out.println(restaurant.checkFoodByType("일식"));
		System.out.println(restaurant.foods);
	}
}
