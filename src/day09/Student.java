package day09;

public class Student {
	String name;
	int kor;
	int eng;
	int total;
	
	public Student() {}
	
	public Student(String name, int kor, int eng) {
		this.name=name;
		this.eng=eng;
		this.kor=kor;
	}
	
	public void input(String name, int kor, int eng) {
		this.name=name;
		this.kor=kor;
		this.eng=eng;
	}
	
	public void calc() {
		System.out.printf("%s님의 점수합계는 %d이고 평균은 %d입니다.",this.name, this.eng+this.kor,(this.eng+this.kor)/2);
	}
}
