package arrayTest;

import java.util.Scanner;

public class MyArTask2 {
	public static void main(String[] args) {
//		각 버튼을 눌렀을 때, 이동하는 페이지는 다음과 같다.
//		btn1 : 회원가입 페이지
//		btn2 : 로그인 페이지
//		btn3 : 마이 페이지
		
//		회원가입 -> 로그인 -> 마이 페이지
//		위 순서대로 입력해야 하며, 만약 이전 단계를 진행하기 전에 다음 단계 버튼을 누를 경우, 이전 단계에 대한 메세지를 출력해준다.
//		예) 로그인 클릭 시, "회원가입을 먼저 진행해주세요" 출력
		
//		알맞은 단계의 버튼을 누르면, 해당 단계에 대한 메세지를 출력해준다.
//		예) 	회원가입 클릭 시, 회원가입 성공
//			마이페이지 클릭 시, 본인 이름과 나이 출력
//			
		String userName = "";
		int userAge = 0;
		String selectBtnMsg = "원하는 페이지의 버튼을 입력해주세요 : ";
		String[] arMsg = {"1. 회원가입 페이지", "2. 로그인 페이지", "3. 마이 페이지", "4. 나가기"};
		String[] arFailMsg = {"회원가입을 먼저 진행해주세요.", "로그인을 먼저 진행해주세요."};
		String[] arSignUpMsg = {"이름을 입력해주세요 : ", "나이를 입력해주세요 : "};
		String[] arSuccessMsg = {"회원가입 성공", "로그인 성공", userName + ", " + userAge};
//		String[] arClick = new String[3];		// 사용자가 입력한 버튼 목록 저장
		boolean[] arSuccess = new boolean[2];	// 회원가입, 로그인 상태 확인
		int click = 0, temp = 0;
		
		Scanner sc = new Scanner(System.in);
		
		
//		4 입력 받았을 때 종료
		while(click != 4) {
//			버튼 목차 출력
			for(int i = 0; i < arMsg.length; i++) {
				System.out.println(arMsg[i]);
			}
			
//			버튼 선택 받기
			System.out.print(selectBtnMsg);
			click = sc.nextInt();
			temp = click;
			
			System.out.println(click);
			
//			사용자가 입력한 첫번째 값이 btn1일 때 
//			회원가입 진행하며 사용자의 이름과 나이 입력받기
			
			if(click == 1) {
				System.out.print(arSignUpMsg[0]);
				userName = sc.next();
				System.out.print(arSignUpMsg[1]);
				userAge = sc.nextInt();
				temp = click;
//				arSuccess[0] = true;
			} else if(click == 2) {
				if(temp == 1) {
					System.out.println(arSuccessMsg[click - 1]);
				} else {
					System.out.println(arFailMsg[click - 2]);
				}
				temp = click;
				
//				arSuccess[0] = false;
			} else if(click == 3) {
				if(temp == 2) {
					System.out.println(arSuccessMsg[click - 1]);
				} else {
					System.out.println(arFailMsg[click - 2]);
				}
				temp = click;
//				arSuccess[0] = false;
			} else if(click == 4) {
				System.out.println("나가기");
				break;
			} else {
				System.out.println("입력을 확인해주세요.");
				arSuccess[0] = false;
			}
			
			if(arSuccess[0]) {
				for(int i = 1; i < arMsg.length; i++) {
					System.out.println(arMsg[i]);
				}
				System.out.println(selectBtnMsg);
				click = sc.nextInt();
//				System.out.println(click);
				
//				if(click == 2) {
//					System.out.println(userName + "님 로그인 성공하셨습니다.");
//					arSuccess[1] = true;
//				} else if(click == 3) {
//					System.out.println(arFailMsg[1]);
//				} else if(click == 4) {
//					System.out.println("나가기");
//				} else {
//					System.out.println("입력을 확인해주세요.");
//				}
//				
//				if(arSuccess[1]) {
//					for (int i = 2; i < arSuccess.length; i++) {
//						System.out.println(arMsg[i]);
//					}
//					System.out.println(selectBtnMsg);
//					click = sc.nextInt();
//					if(click == 3) {
//						System.out.println("이름 : " + userName + "\n나이 : " + userAge);
//					}
//				}
			}
			
			
		}
		System.out.println("종료되었습니다.");
		
		

 		
//		회원가입 성공시 다시 버튼 입력 받기
		
	}
}
