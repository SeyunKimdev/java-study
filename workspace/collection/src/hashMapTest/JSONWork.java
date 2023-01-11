package hashMapTest;

import java.util.HashMap;

import org.json.JSONException;
import org.json.JSONObject;

import hashSetTest.Goods;

public class JSONWork {
	public static void main(String[] args) {
//		��ǰ Ŭ���� ����(��ǰ ��ȣ, ��ǰ �̸�, ��ǰ ����, ��ǰ ���)
//		1. ��ǰ 1���� �����Ͽ� JSON�������� ����
		Goods chair = new Goods(1, "����", 20000, 5);
		JSONObject chairJSON = new JSONObject(chair);
		System.out.println(chair);
		System.out.println(chairJSON);
		
//		2. JSON������ ��ǰ ���� �� ��ǰ ��� ���
		try {
			System.out.println(chairJSON.get("stock"));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		3. ���� ���� ��ǰ ���� ����
		Goods desk = new Goods(2, "å��", 50000, 4);
//		4. ���� ���� ��ǰ�� KEY���� "discount"�� ����
//		5. JSON�������� ����
		JSONObject deskJSON = new JSONObject(desk);
		
//		6. JSON�� ������ �ʵ� �߰�
		
		try {
			deskJSON.put("discount", 20);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(deskJSON);
//		7. JSON������ ��ǰ ���� �� ���η� ���
		try {
			System.out.println("������ : " + deskJSON.get("discount") + "%");
			int price = (int)deskJSON.get("price");
			int discount = (int)deskJSON.get("discount");
			System.out.println(deskJSON.get("name")+ "�� ���ε� ���� : " + price * (100-discount)/100);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	}
}
