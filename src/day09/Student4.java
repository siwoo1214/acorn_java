package day09;

public class Student4 {
	String name;
	int kor;
	int eng;
	int total;
	double avg;
	
	//입력하기
	public void input(String name, int kor, int eng) {
		this.name=name;
		this.kor=kor;
		this.eng=eng;
	}
	
	//성적처리하기
	private void calcTotal() {
		total=eng+kor;
	}
	
	//성적처리 : 쳥균구하기
	public void calc() {
		calcTotal();
		avg=total/2.0;
	}
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.eng);
		System.out.println(this.kor);
		System.out.println(this.total);
		System.out.println(this.avg);
	}
}
