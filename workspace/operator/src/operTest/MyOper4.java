package operTest;

import java.util.Scanner;

public class MyOper4 {
   public static void main(String[] args) {
//      심리 테스트
      /*
       * Q. 당신이 좋아하는 색을 선택하세요.
       * 1. 빨간색
       * 2. 노란색
       * 3. 검은색
       * 4. 흰색
       * 
       * 빨간색 : 불같고 열정적이고 적극적이다.
       * 노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.
       * 검은색 : 묵묵하고 든든하고 냉철하고 멋지다.
       * 흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.
       * 
       */
	   String question = "Q. 당신이 좋아하는 색을 선택하세요.\n"
	   		+ "1. 빨간색\n"
	   		+ "2. 노란색\n"
	   		+ "3. 검은색\n"
	   		+ "4. 흰색\n",result = "";
	   
	   int choice = 0;
	   Scanner sc = new Scanner(System.in);
	   System.out.print(question);
	   choice = sc.nextInt();
	   
	   result = choice == 1 ? "불같고 열정적이고 적극적이다."
			   		: choice == 2 ? "발랄하고 밝고 귀엽고 개성있고 착하다."
			   				: choice == 3 ? "묵묵하고 든든하고 냉철하고 멋지다."
			   						: choice == 4 ? "천사같고 깔끔하고 정리를 좋아하고 배려심이 많다." : "제대로 입력해주세요.";
	   
	   System.out.println(result);
	   
	   
	   
	   
   }
}