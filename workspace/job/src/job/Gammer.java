//package job;
//
//import java.util.Random;
//import java.util.Scanner;
//
//class Player {
//	String playerName;
//	int money; // 가지고 있는 돈
//	int rewardMoney; // 승급 시 받는 돈
//	int score; // 점수
//	int rewardScore; // 보상 점수
//	int winningStreak; // 연승 횟수
//	int playTime;		// 판수
//	int gameWin;		// 이긴 판수
//	int gameLose;		// 진 판수
//	String[] grade = { "아이언", "브론즈", "실버", "골드", "플래티넘", "다이아", "챌린저" }; // 단계
//	String myGrade; // 내 현재 단계
//
//	{ // 플레이어 생성시 초기화
//		money = 5;
//		score = 0;
//		myGrade = grade[2];
//		rewardScore = 15;
//		playTime = 0;
//		gameWin = 0;
//		gameLose = 0;
//		
//	}
//
//	
//	public Player(String playerName) {
//		this.playerName = playerName;
//	}
//
//
//
//
////	정보 출력
//	void printInfo() {
//		System.out.println(
//			"플레이어 이름 : "	+ playerName + ", " + money + "만원 보유 \n현재 점수 : " + score + "\n" + playTime + "판 진행중, " + winningStreak + "연승중 \n티어 : " + myGrade);
//	}
//
////	
////	void play() { 
////		
////	}
//
////	승리
//	void win() {
//		score += rewardScore;
//		winningStreak++;
//		gameWin++;
//		if (winningStreak == 0) {
//			rewardScore = 15;
//		} else if (winningStreak == 1) {	// 2연승 시 16점
//			rewardScore += 1;
//		} else if (winningStreak == 2) {	// 3연승 시 18점
//			rewardScore += 2;
//		} else if (winningStreak == 3) {	// 4연승 시 21점
//			rewardScore += 3;
//		} else if (winningStreak == 4) {	// 5연승 시 25점
//			rewardScore += 4;
//		} else {							// 5연승 이상시 25점 고정
//			rewardScore += 4;
//			if (rewardScore >= 25) {
//				rewardScore = 25;
//			}
//			
//		}
//
//		if (score >= 100) {							// score가 100점이 넘으면 승급
//			for (int i = 0; i < grade.length; i++) {
//				if (myGrade.equals(grade[6])) {		// 등급이 최고단계이면 승급이 불가능하므로 점수가 100점을 넘어도 더 올라감
//					continue;
//				}
//				score = 0;
//				if (myGrade.equals(grade[i])) {		// 승급시 돈을 지급
//					myGrade = grade[i + 1];
//					money += i + 3;
//					break;
//				}
//			}
//		}
//	}
//
////	패배
//	void lose() {
//		winningStreak = 0;
//		gameLose++;
//		rewardScore = 15;
//		score -= rewardScore;
//		if (score < 0) {
//			for (int i = 0; i < grade.length; i++) {
//				if ((grade[i]).equals(myGrade)) {
//					if (myGrade.equals(grade[0])) {
//						score = 0;
//						continue;
//					}
//					myGrade = grade[i - 1];
//					score = 75;
//				}
//			}
//		}
//	}
//
//}
//
//public class Gammer {
//	public static void main(String[] args) {
//		Random random = new Random();
//		Player player1 = new Player("player1");
//		Player player2 = new Player("player2");
//		
//		
//		int[] rating = new int[10];
//		int winningRate = 50;
//
//		for (int i = 0; i < winningRate / 10; i++) {
//			rating[i] = 1;
//		}
//		
//		int[] rating2 = new int[10];
//		int payToWin = 70;
//		
//		for (int i = 0; i < payToWin / 10; i++) {
//			rating2[i] = 1;
//		}
//		
//		String msg = "1. 게임 진행\t2. 팀운↑(만원)\t  3. 나가기";
//		
//		Scanner sc = new Scanner(System.in);
//		int choice = 0;
//		while(true) {
//			System.out.println(msg);
//			choice = sc.nextInt();
//			if(choice == 1) {
//				if (rating[random.nextInt(10)] == 1) {
//					System.out.println("승리");
//					player1.win();
//					player1.printInfo();
//					player1.playTime++;
//				} else {
//					System.out.println("패배");
//					player1.lose();
//					player1.printInfo();
//					player1.playTime++;
//				}
//			} else if(choice == 2) {
//				if(player1.money == 0) {
//					System.out.println("금액이 부족합니다.");
//					continue;
//				}				
//				if (rating2[random.nextInt(10)] == 1) {
//					System.out.println("승리");
//					player1.win();
//					player1.money -= 1;
//					player1.printInfo();
//					player1.playTime++;
//					
//				} else {
//					System.out.println("패배");
//					player1.lose();
//					player1.printInfo();
//					player1.playTime++;
//				}
//			} else if(choice == 3) {
//				System.out.println("종료합니다.");
//				break;
//			} else {
//				System.out.println("다시 입력해주세요.");
//			}
//			
//			if(player1.playTime > 49) {
//				System.out.println("배치게임 50판이 완료됐습니다. 총" + player1.gameWin + "승 " + player1.gameLose + "패\n최종 티어 : " + player1.myGrade + " " + player1.score + "점");
//				break;
//			}
//		}
//		
//	}
//}
