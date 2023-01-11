package hashMapTest;

import java.util.HashMap;

import org.json.JSONException;
import org.json.JSONObject;

import hashSetTest.Goods;

public class JSONWork {
	public static void main(String[] args) {
//		상품 클래스 선언(상품 번호, 상품 이름, 상품 가격, 상품 재고)
//		1. 상품 1개를 제작하여 JSON형식으로 변경
		Goods chair = new Goods(1, "의자", 20000, 5);
		JSONObject chairJSON = new JSONObject(chair);
		System.out.println(chair);
		System.out.println(chairJSON);
		
//		2. JSON형식의 상품 정보 중 상품 재고 출력
		try {
			System.out.println(chairJSON.get("stock"));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		3. 할인 중인 상품 정보 제작
		Goods desk = new Goods(2, "책상", 50000, 4);
//		4. 할인 중인 상품의 KEY값은 "discount"로 설정
//		5. JSON형식으로 변경
		JSONObject deskJSON = new JSONObject(desk);
		
//		6. JSON에 할인율 필드 추가
		
		try {
			deskJSON.put("discount", 20);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(deskJSON);
//		7. JSON형식의 상품 정보 중 할인률 출력
		try {
			System.out.println("할인율 : " + deskJSON.get("discount") + "%");
			int price = (int)deskJSON.get("price");
			int discount = (int)deskJSON.get("discount");
			System.out.println(deskJSON.get("name")+ "의 할인된 가격 : " + price * (100-discount)/100);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	}
}
