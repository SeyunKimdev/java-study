package nike;

public class Building {
	public static void main(String[] args) {
		Nike gangnam = new Nike();
		Nike jamsil = new Nike();
		
		jamsil.register(new Form() {
			
			@Override
			public String[] getMenu() {
				
				return new String[] {"반팔 티", "후드 티", "운동화"};
			}

			@Override
			public void sell(String menu) {
				String[] menus = getMenu();
				for (int i = 0; i < menus.length; i++) {
					if(menu.equals(menus[i])) {
						System.out.println(menus[i] + " 판매 완료");
						return;
					}
				}
//					System.out.println("없는 목록입니다.");
			}
		});
		gangnam.register(new FormAdapter() {
			
			@Override
			public String[] getMenu() {
				System.out.println("반팔 티 무료 증정");
				return null;
			}
		});
	}
}
