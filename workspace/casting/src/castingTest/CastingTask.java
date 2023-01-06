package castingTest;

import java.util.Scanner;

//	넷플릭스
//	애니메이션, 영화, 드라마 클래스 선언

//	사용자가 선택한 영상이

//	애니메이션이라면 "자막지원" 기능 사용

//	영화라면 "4D" 기능 사용

//	드라마라면 "굿즈"기능 사용

public class CastingTask {

	public static void main(String[] args) {
		Video ani = new Animation();
		Animation doraemong = (Animation)ani;
		
		doraemong.subTitle();
		doraemong.playVideo();
		
		Video movie = new Film();
		Film avatar = (Film)movie;
		
		avatar.play4D();
		avatar.playVideo();
		
		Video drama = new Drama();
		Drama dreamHigh = (Drama)drama;
		
		dreamHigh.goods();
		dreamHigh.playVideo();
		
		Video[] videos = {doraemong, avatar, dreamHigh};
		Video videoChoice = null;
		Scanner sc = new Scanner(System.in);
		String msg = "======================\n시청하실 영상을 선택해주세요.\n1. 도라에몽\n2. 아바타\n3. 드림하이";
		
		int choice = 0;
		while(true) {
			System.out.println(msg);
			choice = sc.nextInt();
			
			if(choice - 1 == 0) {
				videoChoice = videos[0];
			} else if(choice - 1 == 1) {
				videoChoice = videos[1];
			} else if(choice - 1 == 2) {
				videoChoice = videos[2];
			} else {
				System.out.println("다시 입력해주세요.");
				continue;
			}
			
			if(videoChoice instanceof Film) {
				((Film) videoChoice).play4D();
			} else if(videoChoice instanceof Animation) {
				((Animation) videoChoice).subTitle();
			} else if(videoChoice instanceof Drama) {
				((Drama) videoChoice).goods();
			} else {
				break;
			}
			
		}
	}
}
