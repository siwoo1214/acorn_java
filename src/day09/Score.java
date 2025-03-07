package day09;

class StudentInfo{
	String name="홍길동";
	int kor=86;
	int eng=72;
	double avg;
	
	void printName() {
		System.out.println("이름 : "+name);
	}
	
	void printkor() {
		System.out.println("국어 : "+kor);
	}
	
	void printeng() {
		System.out.println("영어 : "+eng);
	}
	
	private double avgcalc() {
		double avg=(kor+eng)/2.0;
		return avg;
	}
	
	void printavg() {
		System.out.println("평균 : "+avgcalc());
	}
}

public class Score {
	public static void main(String[] args) {
		StudentInfo si = new StudentInfo();
		si.printName();
		si.printkor();
		si.printeng();
		si.printavg();
	}
}
