//package job;
//
//import java.util.Random;
//import java.util.Scanner;
//
//class Player {
//	String playerName;
//	int money; // ������ �ִ� ��
//	int rewardMoney; // �±� �� �޴� ��
//	int score; // ����
//	int rewardScore; // ���� ����
//	int winningStreak; // ���� Ƚ��
//	int playTime;		// �Ǽ�
//	int gameWin;		// �̱� �Ǽ�
//	int gameLose;		// �� �Ǽ�
//	String[] grade = { "���̾�", "�����", "�ǹ�", "���", "�÷�Ƽ��", "���̾�", "ç����" }; // �ܰ�
//	String myGrade; // �� ���� �ܰ�
//
//	{ // �÷��̾� ������ �ʱ�ȭ
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
////	���� ���
//	void printInfo() {
//		System.out.println(
//			"�÷��̾� �̸� : "	+ playerName + ", " + money + "���� ���� \n���� ���� : " + score + "\n" + playTime + "�� ������, " + winningStreak + "������ \nƼ�� : " + myGrade);
//	}
//
////	
////	void play() { 
////		
////	}
//
////	�¸�
//	void win() {
//		score += rewardScore;
//		winningStreak++;
//		gameWin++;
//		if (winningStreak == 0) {
//			rewardScore = 15;
//		} else if (winningStreak == 1) {	// 2���� �� 16��
//			rewardScore += 1;
//		} else if (winningStreak == 2) {	// 3���� �� 18��
//			rewardScore += 2;
//		} else if (winningStreak == 3) {	// 4���� �� 21��
//			rewardScore += 3;
//		} else if (winningStreak == 4) {	// 5���� �� 25��
//			rewardScore += 4;
//		} else {							// 5���� �̻�� 25�� ����
//			rewardScore += 4;
//			if (rewardScore >= 25) {
//				rewardScore = 25;
//			}
//			
//		}
//
//		if (score >= 100) {							// score�� 100���� ������ �±�
//			for (int i = 0; i < grade.length; i++) {
//				if (myGrade.equals(grade[6])) {		// ����� �ְ�ܰ��̸� �±��� �Ұ����ϹǷ� ������ 100���� �Ѿ �� �ö�
//					continue;
//				}
//				score = 0;
//				if (myGrade.equals(grade[i])) {		// �±޽� ���� ����
//					myGrade = grade[i + 1];
//					money += i + 3;
//					break;
//				}
//			}
//		}
//	}
//
////	�й�
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
//		String msg = "1. ���� ����\t2. �����(����)\t  3. ������";
//		
//		Scanner sc = new Scanner(System.in);
//		int choice = 0;
//		while(true) {
//			System.out.println(msg);
//			choice = sc.nextInt();
//			if(choice == 1) {
//				if (rating[random.nextInt(10)] == 1) {
//					System.out.println("�¸�");
//					player1.win();
//					player1.printInfo();
//					player1.playTime++;
//				} else {
//					System.out.println("�й�");
//					player1.lose();
//					player1.printInfo();
//					player1.playTime++;
//				}
//			} else if(choice == 2) {
//				if(player1.money == 0) {
//					System.out.println("�ݾ��� �����մϴ�.");
//					continue;
//				}				
//				if (rating2[random.nextInt(10)] == 1) {
//					System.out.println("�¸�");
//					player1.win();
//					player1.money -= 1;
//					player1.printInfo();
//					player1.playTime++;
//					
//				} else {
//					System.out.println("�й�");
//					player1.lose();
//					player1.printInfo();
//					player1.playTime++;
//				}
//			} else if(choice == 3) {
//				System.out.println("�����մϴ�.");
//				break;
//			} else {
//				System.out.println("�ٽ� �Է����ּ���.");
//			}
//			
//			if(player1.playTime > 49) {
//				System.out.println("��ġ���� 50���� �Ϸ�ƽ��ϴ�. ��" + player1.gameWin + "�� " + player1.gameLose + "��\n���� Ƽ�� : " + player1.myGrade + " " + player1.score + "��");
//				break;
//			}
//		}
//		
//	}
//}
