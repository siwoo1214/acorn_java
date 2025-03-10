package day16.io.file;

public class Score2 {
	String name;
	int kor;
	int eng;
	double avg;
	char grade;
	
	public Score2() {
		// TODO Auto-generated constructor stub
	}

	public Score2(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		calc();
	}
	
	private void calcAvg() {
		int total=kor+eng;
		avg=total/2.0;
	}
	
	private void calc() {
		calcAvg();
		
		if(avg>90) {
			grade='A';
		}else if(avg>=80) {
			grade='B';
		}else if(avg>=70) {
			grade='C';
		}else {
			grade='F';
		}
	}

	@Override
	public String toString() {
		return "Score2 [name=" + name + ", kor=" + kor + ", eng=" + eng + ", avg=" + avg + ", grade=" + grade + "]";
	}

	public char getGrade() {
		return grade;
	}

	
	
	
	//getter,setter
}
