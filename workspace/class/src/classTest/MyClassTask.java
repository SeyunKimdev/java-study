//package classTest;
//
//class SuperCar {
////   브랜드, 색상 가격
////   엔진 상태
//   String brand;
//   String color;
//   int price;
//   boolean check;
//   String password;
//   String input;
//   int wrongCount;
//   
//   
////   생성자
//   public SuperCar() {}
//   
//   public SuperCar(String brand, String color, int price) {
//      this.brand = brand;
//      this.color = color;
//      this.price = price;
//   }
//   
//   
//public SuperCar(String brand, String color, int price, String password) {
//	super();
//	this.brand = brand;
//	this.color = color;
//	this.price = price;
//	this.password = password;
//}
//
//public SuperCar(String password) {
//	this.password = password;
//}
//
////   시동 켜기
////   엔진 상태를 확인하고
////   시동이 꺼져있다면, "시동 켜기" 출력
////   이미 시동이 켜져있다면, "시동이 이미 켜져있습니다." 출력
//   boolean engineStart() {
//      if(!check) {
//         check = true;
//         return true;
//      }
//      return false;
//   }
//   
////   시동 끄기
////   엔진 상태를 확인하고
////   시동이 켜져있다면, "시동 끄기" 출력
////   이미 시동이 꺼져있다면, "시동이 이미 꺼져있습니다." 출력
//   boolean engineStop() {
//      if(check) {
//         check = false;
//         return true;
//      }
//      return false;
//   }
//   
////   시동을 켜기 위해서 비밀번호 4자리를 입력받아야 한다.
////   3번 연속 잘못 입력했을 시 "경찰 출동" 출력
////   ※ 문자열 비교는 ==이 아닌 equals()로 비교한다.
//   boolean checkPw(String input) {
//	   if(input.equals(password)) {
//		   wrongCount = 0;
//		   return true;
//	   } else {
//		   wrongCount++;
//	   }
//	   if(wrongCount >= 3) {
//		   return false;
//	   }
//	return false;
//   }
////   boolean checkPw(String input) {
////	   if(input.equals(password)) {
////		   System.out.println("일치");
////		   return true;
////	   } else {
////		   System.out.println("틀림");
////		   wrongCount++;
////	   }
////	   if(wrongCount >= 3) {
////		   System.out.println("경찰 출동");
////		   return false;
////	   }
////	   return false;
////   }
//   
//}
//
//public class ClassTask {
//	public static void main(String[] args) {
//		SuperCar myCar = new SuperCar("1111");
//		
//		myCar.checkPw("1112");
//		myCar.checkPw("1112");
//		myCar.checkPw("1112");
//		myCar.checkPw("1112");
//	}
//	
//}
//
//
//
//
//
//
//
//
