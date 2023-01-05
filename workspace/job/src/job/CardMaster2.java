package job;

import java.util.Random;
import java.util.Scanner;

// 타짜
// 족보(끗, 땡, 광땡)
// 나랑 상대방과 대결
// 계급: 호구, 물주, 마담, 타짜
// 패를 받을 시 추가 금액 설정
// 같은 패가 나올 시 다음 판 두 배
// 다이, 고 결정
// 판돈: 1억
// 연속 3회 승리 시 계급 상승

public class CardMaster2 {
//   초기화
//   호칭
   String nickname;
//  자금
   int money;
//   레벨
   int level;
//   내 카드
   int deck;
//   이긴 횟수
   int winCount;

//   기본 생성자
   public CardMaster2() {
      ;
   }

//   매개변수로 이름, 초기 자금을 받는 생성자
   public CardMaster2(String nickname, int money) {
      this.nickname = nickname;
      this.money = money;
   }

//  판돈 및 추가 금액을 받는다.
   void deposit(int money) {
      this.money -= money;
   }

//  끗[2](60) 땡[1](30) 광땡[0](10)
   void getMyDeck() {
      Random random = new Random();
//      각 카드의 확률만큼 해당 카드번호(인덱스번호)를 rating 배열로 선언
      int[] rating = { 0, 1, 1, 1, 2, 2, 2, 2, 2, 2 };
//      10개의 자리에서 한 자리 값을 랜덤으로 뽑아 
//      rating배열의 인덱스로 넣고 그 자리값을 내 카드로 활용
      this.deck = rating[random.nextInt(rating.length)];
   }

//   게임
//   getMyDeck()에서 정해진 deck의 넘버 (0 | 광땡, 1 | 땡, 2 | 끗)
//  나의 카드와 컴퓨터댁의 카드 값이 같으면 draw
//  나의 카드가 컴퓨터댁의 카드 값보다 크면 lose
//  나의 카드가 컴퓨터댁의 카드 값보다 작으면 win
   int battle(CardMaster cardMaster) {
      boolean draw = this.deck == cardMaster.deck;
      boolean lose = this.deck > cardMaster.deck;
      boolean win = this.deck < cardMaster.deck;
//      게임 결과 값을 true false로 status에 전달하기 위해 배열 선언
//      0 : draw, 1 : lose, 2 : win 
      boolean[] status = { draw, lose, win };
//      게임결과 result = status의 인덱스 넘버
      int result = 0;
//      true인 값을 status에서 찾아서 해당 인덱스 넘버를 result로 리턴
//      -1 : draw, 0 : lose, 1 : win 
      for (int i = -1; i < 2; i++) {
         if (status[1 + i]) {
            result = i;
            break;
         }
      }
      return result;

   }// end CardMaster;

   public static void main(String[] args) {
//      level 명칭 배열
      String[] arLevel = { "호구", "물주", "마담", "타짜" };
//      패의 종류 getMyDeck()에서 내 덱의 값을 int로 저장해 놓았기 때문에 찾기쉽다
      String[] decks = { "광땡", "땡", "끗" };
//      게임결과 battle(CardMaster cardMaster)에서 리턴받은 결과(int)로 찾기
      String[] status = { "무승부", "패배", "승리" };
//      기본 메뉴 
      String message = "1. 대결하기\n2. 나의 정보\n3. 나가기";
//      추가금액 안내 메세지
      String depositMessage = "1. 추가금액 입력\n2. 추가금액 없이 진행";
//      선택변수 0, 자금 0 , 초기배팅액 10000, 게임 결과 값 0, 추가금액 0 으로 초기화
      int choice = 0, money = 0, defaultMoney = 10_000, result = 0, depositMoney = 0;

      Scanner sc = new Scanner(System.in);

//      내 닉네임 "고니", 초기자금 0 으로 객체 생성
      CardMaster me = new CardMaster("고니", 0);
//      상대방(컴퓨터) 닉네임 "아귀", 초기자금 0으로 객체 생성
      CardMaster computer = new CardMaster("아귀", 0);
//      현재상태 출력할 스트링 변수
//      while loop 한 바퀴 돌 때마다 새로 초기화 할 수 없기 때문에 null로 loop 밖에서 선언
      String title = null;

      while (true) {
//        현재 상태 출력
         title = "[" + arLevel[me.level] + "]" + me.nickname + " 자산: " + me.money + "\n" + "["
               + arLevel[computer.level] + "]" + computer.nickname + " 자산: " + computer.money;
         System.out.println(title);
//       메뉴 출력 및 입력 받기
         System.out.println(message);
         choice = sc.nextInt();

//       나가기 while 탈출
         if (choice == 3) {
            break;
         }

         switch (choice) {
         case 1: // 대결하기
//           내 자산에서 초기 배팅액 빼기
            me.deposit(defaultMoney);
//          컴퓨터 자산에서 초기 배팅액 빼기
            computer.deposit(defaultMoney);
//          배팅 총액 (초기배팅액 *2 (나하나 컴퓨터하나)
            money += defaultMoney * 2;
//          나랑 컴퓨터 카드 뽑기
            me.getMyDeck();
            computer.getMyDeck();
//          내 패 출력
            System.out.println("나의 패: " + decks[me.deck]);
//          추가금액 선택 및 입력
            System.out.println(depositMessage);
            choice = sc.nextInt();

//          추가배팅하기로 결정
            if (choice == 1) {
//            추가 금액 입력받기
               System.out.print("추가 금액: ");
               depositMoney = sc.nextInt();
//            내 자금과 컴퓨터 자금에서 추가 배팅액 제외
               me.deposit(depositMoney);
               computer.deposit(depositMoney);
//            판돈에 추가배팅액*2 추가 (나하나 컴퓨터 하나)
               money += depositMoney * 2;
            }
//         추가배팅 하던 안 하던 게임 진행
//         나랑 컴퓨터의 덱을 비교하여 int의 결과 값으로 넣어 줌(battle()의 status 배열 인덱스값)
//            -1 : draw, 0 : lose, 1 : win 
            result = me.battle(computer);
//         결과값은 main()안의 status 배열 안의 스트링 결과로 출력
            System.out.println(status[result + 1]);

//            결과값 비교
            switch (result) {
//            -1 : draw, 0 : lose, 1 : win 
            case -1: // 무승부
//               결과 값이 무승부(-1)인 동안 반복
               while (result == -1) {
//                  판돈 2배 올리기
                  money *= 2;
//                  내 카드 새로 뽑기
                  me.getMyDeck();
                  computer.getMyDeck();
                  System.out.println("나의 패: " + decks[me.deck]);
//                  고? 다이?
                  System.out.println("1. 고\n2. 다이");
                  choice = sc.nextInt();
//                  다이
                  if (choice == 2) {
//                     결과를 패배로 
                     result = 0;
                     System.out.println(status[result + 1]);
//                     컴퓨터는 판돈을 다 가져감
                     computer.money += money;
//                     내 자금에서 판돈을 빼고 다음 판을 위한 초기 배팅액을 빼고, 추가 배팅액도 뺀다.
                     me.money -= money - (defaultMoney + depositMoney)*2;
//                     다이로 패배했으니 승리횟수 0 초기화
                     me.winCount = 0;
//                     컴퓨터는 이겼으니까 승리횟수++
                     computer.winCount++;
//                     무승부 -> 다이 -> while(무승부) 탈출
                     break;
                  }// end if(choice ==2) 다이 종료
//                  고 하면 진행 후 결과 출력
                  result = me.battle(computer);
                  System.out.println(status[result + 1]);

                  switch (result) {
                  case 0: // 패배
                     computer.money += money;
                     me.money -= money - (defaultMoney + depositMoney)*2;
                     me.winCount = 0;
                     computer.winCount++;
                     break;
                  case 1: // 승리
                     me.money += money;
                     computer.money -= money - (defaultMoney + depositMoney)*2;
                     me.winCount++;
                     computer.winCount = 0;
                     break;
                  }
               }
               break;
            case 0: // 패배
               computer.money += money;
               me.money -= money - (defaultMoney + depositMoney)*2;
               me.winCount = 0;
               computer.winCount++;
               break;
            case 1: // 승리
//               System.out.println(돈);
               me.money += money;
               computer.money -= money - (defaultMoney + depositMoney)*2;
               me.winCount++;
               computer.winCount = 0;
               break;
            }
            if (me.winCount > 2 && me.level < 3) {
               me.level++;
            }
            if (computer.winCount > 2 && computer.level < 3) {
               computer.level++;
            }
            money = 0;
            break;
         case 2: // 나의 정보
            break;
         default: // 그 외
            System.out.println("다시 입력해주세요.");
            break;
         }
      }

   }
}