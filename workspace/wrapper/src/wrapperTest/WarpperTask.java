package wrapperTest;

public class WarpperTask {
	public static void main(String[] args) {
//		1, 12.5, 86.6F, 'Z', "Hi", false
//		위 6개의 값을 6칸 배열에 담기
		
//		int data1 = 1;
//		double data2 = 12.5;
//		float data3 = 86.6F;
//		char data4 = 'Z';
//		String data5 = "Hi";
//		boolean data6 = false;
//		
//		Object[] datas = {data1, data2, data3, data4, data5, data6};
		Object[] datas = {1, 12.5, 86.6F, 'Z', "Hi", false};

		for (int i = 0; i < datas.length; i++) {
			System.out.println(datas[i]);
		}
	}
}
