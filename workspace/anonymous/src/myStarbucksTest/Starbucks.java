package myStarbucksTest;

public class Starbucks {
	
	String[] menus = {"1. �Ƹ޸�ī��", "2. ī���", "3. ����������"};
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
