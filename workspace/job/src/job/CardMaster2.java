package job;

import java.util.Random;
import java.util.Scanner;

// Ÿ¥
// ����(��, ��, ����)
// ���� ����� ���
// ���: ȣ��, ����, ����, Ÿ¥
// �и� ���� �� �߰� �ݾ� ����
// ���� �а� ���� �� ���� �� �� ��
// ����, �� ����
// �ǵ�: 1��
// ���� 3ȸ �¸� �� ��� ���

public class CardMaster2 {
//   �ʱ�ȭ
//   ȣĪ
   String nickname;
//  �ڱ�
   int money;
//   ����
   int level;
//   �� ī��
   int deck;
//   �̱� Ƚ��
   int winCount;

//   �⺻ ������
   public CardMaster2() {
      ;
   }

//   �Ű������� �̸�, �ʱ� �ڱ��� �޴� ������
   public CardMaster2(String nickname, int money) {
      this.nickname = nickname;
      this.money = money;
   }

//  �ǵ� �� �߰� �ݾ��� �޴´�.
   void deposit(int money) {
      this.money -= money;
   }

//  ��[2](60) ��[1](30) ����[0](10)
   void getMyDeck() {
      Random random = new Random();
//      �� ī���� Ȯ����ŭ �ش� ī���ȣ(�ε�����ȣ)�� rating �迭�� ����
      int[] rating = { 0, 1, 1, 1, 2, 2, 2, 2, 2, 2 };
//      10���� �ڸ����� �� �ڸ� ���� �������� �̾� 
//      rating�迭�� �ε����� �ְ� �� �ڸ����� �� ī��� Ȱ��
      this.deck = rating[random.nextInt(rating.length)];
   }

//   ����
//   getMyDeck()���� ������ deck�� �ѹ� (0 | ����, 1 | ��, 2 | ��)
//  ���� ī��� ��ǻ�ʹ��� ī�� ���� ������ draw
//  ���� ī�尡 ��ǻ�ʹ��� ī�� ������ ũ�� lose
//  ���� ī�尡 ��ǻ�ʹ��� ī�� ������ ������ win
   int battle(CardMaster cardMaster) {
      boolean draw = this.deck == cardMaster.deck;
      boolean lose = this.deck > cardMaster.deck;
      boolean win = this.deck < cardMaster.deck;
//      ���� ��� ���� true false�� status�� �����ϱ� ���� �迭 ����
//      0 : draw, 1 : lose, 2 : win 
      boolean[] status = { draw, lose, win };
//      ���Ӱ�� result = status�� �ε��� �ѹ�
      int result = 0;
//      true�� ���� status���� ã�Ƽ� �ش� �ε��� �ѹ��� result�� ����
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
//      level ��Ī �迭
      String[] arLevel = { "ȣ��", "����", "����", "Ÿ¥" };
//      ���� ���� getMyDeck()���� �� ���� ���� int�� ������ ���ұ� ������ ã�⽱��
      String[] decks = { "����", "��", "��" };
//      ���Ӱ�� battle(CardMaster cardMaster)���� ���Ϲ��� ���(int)�� ã��
      String[] status = { "���º�", "�й�", "�¸�" };
//      �⺻ �޴� 
      String message = "1. ����ϱ�\n2. ���� ����\n3. ������";
//      �߰��ݾ� �ȳ� �޼���
      String depositMessage = "1. �߰��ݾ� �Է�\n2. �߰��ݾ� ���� ����";
//      ���ú��� 0, �ڱ� 0 , �ʱ���þ� 10000, ���� ��� �� 0, �߰��ݾ� 0 ���� �ʱ�ȭ
      int choice = 0, money = 0, defaultMoney = 10_000, result = 0, depositMoney = 0;

      Scanner sc = new Scanner(System.in);

//      �� �г��� "���", �ʱ��ڱ� 0 ���� ��ü ����
      CardMaster me = new CardMaster("���", 0);
//      ����(��ǻ��) �г��� "�Ʊ�", �ʱ��ڱ� 0���� ��ü ����
      CardMaster computer = new CardMaster("�Ʊ�", 0);
//      ������� ����� ��Ʈ�� ����
//      while loop �� ���� �� ������ ���� �ʱ�ȭ �� �� ���� ������ null�� loop �ۿ��� ����
      String title = null;

      while (true) {
//        ���� ���� ���
         title = "[" + arLevel[me.level] + "]" + me.nickname + " �ڻ�: " + me.money + "\n" + "["
               + arLevel[computer.level] + "]" + computer.nickname + " �ڻ�: " + computer.money;
         System.out.println(title);
//       �޴� ��� �� �Է� �ޱ�
         System.out.println(message);
         choice = sc.nextInt();

//       ������ while Ż��
         if (choice == 3) {
            break;
         }

         switch (choice) {
         case 1: // ����ϱ�
//           �� �ڻ꿡�� �ʱ� ���þ� ����
            me.deposit(defaultMoney);
//          ��ǻ�� �ڻ꿡�� �ʱ� ���þ� ����
            computer.deposit(defaultMoney);
//          ���� �Ѿ� (�ʱ���þ� *2 (���ϳ� ��ǻ���ϳ�)
            money += defaultMoney * 2;
//          ���� ��ǻ�� ī�� �̱�
            me.getMyDeck();
            computer.getMyDeck();
//          �� �� ���
            System.out.println("���� ��: " + decks[me.deck]);
//          �߰��ݾ� ���� �� �Է�
            System.out.println(depositMessage);
            choice = sc.nextInt();

//          �߰������ϱ�� ����
            if (choice == 1) {
//            �߰� �ݾ� �Է¹ޱ�
               System.out.print("�߰� �ݾ�: ");
               depositMoney = sc.nextInt();
//            �� �ڱݰ� ��ǻ�� �ڱݿ��� �߰� ���þ� ����
               me.deposit(depositMoney);
               computer.deposit(depositMoney);
//            �ǵ��� �߰����þ�*2 �߰� (���ϳ� ��ǻ�� �ϳ�)
               money += depositMoney * 2;
            }
//         �߰����� �ϴ� �� �ϴ� ���� ����
//         ���� ��ǻ���� ���� ���Ͽ� int�� ��� ������ �־� ��(battle()�� status �迭 �ε�����)
//            -1 : draw, 0 : lose, 1 : win 
            result = me.battle(computer);
//         ������� main()���� status �迭 ���� ��Ʈ�� ����� ���
            System.out.println(status[result + 1]);

//            ����� ��
            switch (result) {
//            -1 : draw, 0 : lose, 1 : win 
            case -1: // ���º�
//               ��� ���� ���º�(-1)�� ���� �ݺ�
               while (result == -1) {
//                  �ǵ� 2�� �ø���
                  money *= 2;
//                  �� ī�� ���� �̱�
                  me.getMyDeck();
                  computer.getMyDeck();
                  System.out.println("���� ��: " + decks[me.deck]);
//                  ��? ����?
                  System.out.println("1. ��\n2. ����");
                  choice = sc.nextInt();
//                  ����
                  if (choice == 2) {
//                     ����� �й�� 
                     result = 0;
                     System.out.println(status[result + 1]);
//                     ��ǻ�ʹ� �ǵ��� �� ������
                     computer.money += money;
//                     �� �ڱݿ��� �ǵ��� ���� ���� ���� ���� �ʱ� ���þ��� ����, �߰� ���þ׵� ����.
                     me.money -= money - (defaultMoney + depositMoney)*2;
//                     ���̷� �й������� �¸�Ƚ�� 0 �ʱ�ȭ
                     me.winCount = 0;
//                     ��ǻ�ʹ� �̰����ϱ� �¸�Ƚ��++
                     computer.winCount++;
//                     ���º� -> ���� -> while(���º�) Ż��
                     break;
                  }// end if(choice ==2) ���� ����
//                  �� �ϸ� ���� �� ��� ���
                  result = me.battle(computer);
                  System.out.println(status[result + 1]);

                  switch (result) {
                  case 0: // �й�
                     computer.money += money;
                     me.money -= money - (defaultMoney + depositMoney)*2;
                     me.winCount = 0;
                     computer.winCount++;
                     break;
                  case 1: // �¸�
                     me.money += money;
                     computer.money -= money - (defaultMoney + depositMoney)*2;
                     me.winCount++;
                     computer.winCount = 0;
                     break;
                  }
               }
               break;
            case 0: // �й�
               computer.money += money;
               me.money -= money - (defaultMoney + depositMoney)*2;
               me.winCount = 0;
               computer.winCount++;
               break;
            case 1: // �¸�
//               System.out.println(��);
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
         case 2: // ���� ����
            break;
         default: // �� ��
            System.out.println("�ٽ� �Է����ּ���.");
            break;
         }
      }

   }
}