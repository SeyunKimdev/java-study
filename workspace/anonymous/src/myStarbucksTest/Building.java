package myStarbucksTest;

import java.util.Arrays;
import java.util.Iterator;

public class Building {
	
	
	public static void main(String[] args) {
		Starbucks gangnam = new Starbucks();
		Starbucks jamsil = new Starbucks();
		
//		String[] menus = {"1. �Ƹ޸�ī��", "2. ī���", "3. ����������"};
		
		
		gangnam.register(new Form() {
			
			@Override
			public void sell(String[] menus) {
				System.out.println("-----------------------------\n��Ÿ���� ������\n-----------------------------");
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
				System.out.println("-----------------------------\n��Ÿ���� �����\n-----------------------------");
				System.out.println("������� ���� ���� ������Դϴ�.");
				for (int i = 0; i < jamsil.menus.length; i++) {
					System.out.println(jamsil.menus[i]);
				}
				return jamsil.menus;
			}
		});
		
	}
}
