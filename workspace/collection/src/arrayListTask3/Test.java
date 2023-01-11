package arrayListTask3;

public class Test {
	public static void main(String[] args) {
		DateApp dateApp = new DateApp();
		Love love1 = new Love();
		Love love2 = new Love();
		Love love3 = new Love();
		Love love4 = new Love();
		Love love5 = new Love();
		Love love6 = new Love();
		Love love7 = new Love();
		
		love1.setAge(22);
		love1.setNumber(1);
		love1.setName("1번 이상형");
		
		love2.setAge(25);
		love2.setNumber(2);
		love2.setName("2번 이상형");
		    
		love3.setAge(24);
		love3.setNumber(3);
		love3.setName("3번 이상형");
		
		love4.setAge(30);
		love4.setNumber(4);
		love4.setName("4번 이상형");
		
		love5.setAge(27);
		love5.setNumber(5);
		love5.setName("5번 이상형");
		
		love6.setAge(26);
		love6.setNumber(6);
		love6.setName("6번 이상형");
		
		love7.setAge(22);
		love7.setNumber(7);
		love7.setName("7번 이상형");
		
		dateApp.add(love1);
		dateApp.add(love2);
		dateApp.add(love3);
		dateApp.add(love4);
		dateApp.add(love5);
		dateApp.add(love6);
		dateApp.add(love7);
		
		System.out.println(dateApp.findLoveByAge(22));
		System.out.println(dateApp.findLoveByAge(23));
		dateApp.setAgeOfLove(love1);
		System.out.println(dateApp.findLoveByAge(22));
		System.out.println(dateApp.loves);
		dateApp.sortLoveByAge();
		System.out.println(dateApp.loves);
		
	}
}
