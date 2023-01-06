package castingTest;

import java.util.Scanner;

//	���ø���
//	�ִϸ��̼�, ��ȭ, ��� Ŭ���� ����

//	����ڰ� ������ ������

//	�ִϸ��̼��̶�� "�ڸ�����" ��� ���

//	��ȭ��� "4D" ��� ���

//	��󸶶�� "����"��� ���

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
		String msg = "======================\n��û�Ͻ� ������ �������ּ���.\n1. ���󿡸�\n2. �ƹ�Ÿ\n3. �帲����";
		
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
				System.out.println("�ٽ� �Է����ּ���.");
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
