package arrayListTask3;

import java.util.ArrayList;
import java.util.Collections;

public class DateApp {
	ArrayList<Love> loves = DBConnecter.loves;

	
//	추가
	public void add(Love love) {
		loves.add(love);
	}
	
//	- 사용자가 원하는 나이의 이상형 목록 조회
	public ArrayList<Love> findLoveByAge(int age) {
		ArrayList<Love> love = new ArrayList<Love>();
		for (int i = 0; i < loves.size(); i++) {
			if (loves.get(i).getAge() == age) {
				love.add(loves.get(i));
			}
		}
		return love;
	}
	
//	- 이상형의 나이 수정
	public void setAgeOfLove(Love love) {
		love.setAge(love.getAge());
	}
	
//	- 이상형 나이 순 정렬
	public void sortLoveByAge() {
		ArrayList<Integer> ages = new ArrayList<Integer>();
		ArrayList<Love> lovess = new ArrayList<Love>();
		for (int i = 0; i < loves.size(); i++) {
			ages.add(loves.get(i).getAge());
		}
		Collections.sort(ages);
		for (int i = 0; i < ages.size(); i++) {
			for (int j = 0; j < loves.size(); j++) {
				if(ages.get(i) == loves.get(j).getAge()) {
					lovess.add(loves.get(j));
					loves.remove(loves.get(j));
				}
			}
		}
//		for (int i = 0; i < lovess.size(
//				); i++) {
//			loves.set(i, lovess.get(i));
//		}
		loves = lovess;
	}
//	public void sortLoveByAge() {
//		ArrayList<Love> love = new ArrayList<Love>();
//		for (int i = 0; i < loves.size(); i++) {
//			if(loves.get(i).getAge() <= loves.get(i + 1).getAge()) {
//				love.add(loves.get(i));
//			}
//		}
//	}
	
	
}
