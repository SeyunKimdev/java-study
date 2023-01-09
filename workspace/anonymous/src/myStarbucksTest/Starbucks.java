package myStarbucksTest;

public class Starbucks {
	
	String[] menus = {"1. 아메리카노", "2. 카페라떼", "3. 에스프레소"};
//	String[] menus = null;
	

//	public String[] getMenus() {
//		return menus;
//	}
//
//	public void setMenus(String[] menus) {
//		this.menus = menus;
//	}

	public void register(Form form) {
		form.getMenu();
		form.sell(form.getMenu());
		
	}
}
