package apiTest;

import java.util.HashMap;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class MessageTest {
	public static void main(String[] args) {
		String api_key = "NCST8GJILHI0RWXP";
	       String api_secret = "21JWKCCJQHVDS73MU3OBYIADELGUWMED";
	       Message coolsms = new Message(api_key, api_secret);

	       // 4 params(to, from, type, text) are mandatory. must be filled
	       HashMap<String, String> params = new HashMap<String, String>();
	       params.put("to", "01071228966");
	       params.put("from", "01056337014");
	       params.put("type", "SMS");
	       params.put("text", "[이벤트 안내] 1초 인증 간편 뱅킹 이 앱 설치하고 커피 쿠폰 받아가세요~\n 앱설치 www.naver.com");
	       params.put("app_version", "test app 1.2"); // application name and version

	       try {
	         JSONObject obj = (JSONObject) coolsms.send(params);
	         System.out.println(obj.toString());
	       } catch (CoolsmsException e) {
	         System.out.println(e.getMessage());
	         System.out.println(e.getCode());
	       }
	}
}
