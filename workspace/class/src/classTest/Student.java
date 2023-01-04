package classTest;

public class Student {

	int studentNum;
	int kor;
	int eng;
	int math;
	
	int sum;
	double avg;
	
	
	
	public Student() {
		super();
	}



	public Student(int studentNum, int kor, int eng, int math) {
		super();
		this.studentNum = studentNum;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = kor + eng + math;
		this.avg = sum / 3.0;
	}
	
	
}
