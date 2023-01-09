package nike;

public class Building {
	public static void main(String[] args) {
		Nike gangnam = new Nike();
		Nike jamsil = new Nike();
		
		jamsil.register(new Form() {
			
			@Override
			public String[] getMenu() {
				
				return new String[] {"���� Ƽ", "�ĵ� Ƽ", "�ȭ"};
			}

			@Override
			public void sell(String menu) {
				String[] menus = getMenu();
				for (int i = 0; i < menus.length; i++) {
					if(menu.equals(menus[i])) {
						System.out.println(menus[i] + " �Ǹ� �Ϸ�");
						return;
					}
				}
//					System.out.println("���� ����Դϴ�.");
			}
		});
		gangnam.register(new FormAdapter() {
			
			@Override
			public String[] getMenu() {
				System.out.println("���� Ƽ ���� ����");
				return null;
			}
		});
	}
}
