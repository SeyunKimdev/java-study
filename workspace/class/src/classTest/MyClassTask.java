//package classTest;
//
//class SuperCar {
////   �귣��, ���� ����
////   ���� ����
//   String brand;
//   String color;
//   int price;
//   boolean check;
//   String password;
//   String input;
//   int wrongCount;
//   
//   
////   ������
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
////   �õ� �ѱ�
////   ���� ���¸� Ȯ���ϰ�
////   �õ��� �����ִٸ�, "�õ� �ѱ�" ���
////   �̹� �õ��� �����ִٸ�, "�õ��� �̹� �����ֽ��ϴ�." ���
//   boolean engineStart() {
//      if(!check) {
//         check = true;
//         return true;
//      }
//      return false;
//   }
//   
////   �õ� ����
////   ���� ���¸� Ȯ���ϰ�
////   �õ��� �����ִٸ�, "�õ� ����" ���
////   �̹� �õ��� �����ִٸ�, "�õ��� �̹� �����ֽ��ϴ�." ���
//   boolean engineStop() {
//      if(check) {
//         check = false;
//         return true;
//      }
//      return false;
//   }
//   
////   �õ��� �ѱ� ���ؼ� ��й�ȣ 4�ڸ��� �Է¹޾ƾ� �Ѵ�.
////   3�� ���� �߸� �Է����� �� "���� �⵿" ���
////   �� ���ڿ� �񱳴� ==�� �ƴ� equals()�� ���Ѵ�.
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
////		   System.out.println("��ġ");
////		   return true;
////	   } else {
////		   System.out.println("Ʋ��");
////		   wrongCount++;
////	   }
////	   if(wrongCount >= 3) {
////		   System.out.println("���� �⵿");
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
