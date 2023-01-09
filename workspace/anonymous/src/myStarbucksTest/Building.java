package myStarbucksTest;

import java.util.Arrays;
import java.util.Iterator;

public class Building {
	
	
	public static void main(String[] args) {
		Starbucks gangnam = new Starbucks();
		Starbucks jamsil = new Starbucks();
		
//		String[] menus = {"1. 아메리카노", "2. 카페라떼", "3. 에스프레소"};
		
		
		gangnam.register(new Form() {
			
			@Override
			public void sell(String[] menus) {
				System.out.println("-----------------------------\n스타벅스 강남점\n-----------------------------");
//				System.out.println(Arrays.toString(menus));
				for (int i = 0; i < menus.length; i++) {
					System.out.println(menus[i]);
				}
			}
			
			@Override
			public String[] getMenu() {
				return gangnam.menus;
			}
		});
		
		jamsil.register(new FormAdapter() {
			
			@Override
			public String[] getMenu() {
				System.out.println("-----------------------------\n스타벅스 잠실점\n-----------------------------");
				System.out.println("잠실점은 무료 나눔 행사중입니다.");
				for (int i = 0; i < jamsil.menus.length; i++) {
					System.out.println(jamsil.menus[i]);
				}
				return jamsil.menus;
			}
		});
		
	}
}
