package day15.정렬;


//public class Score extends Object{}
@SuppressWarnings("rawtypes")
public class Score implements Comparable{
	String name;
	int kor;
	int eng;
	double avg;

	//기본생성자
	public Score() {
		// TODO Auto-generated constructor stub
	}
	
	//생성자 오버로딩 (매개변수가 다른 여러개의 생성자를 말한다)
	//생성자(특별한 메소드)
	public Score(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		calcAvg();
	}

	private void calcAvg() {
		int total=kor+eng;
		avg=total/2;
	}
	
	//toString() 이거 살짝 객체 출력할 때 이런 형식으로 출력된다 라고 명시하는 그런 느낌임
	@Override
	public String toString() {
		return "name=" + name + ", kor=" + kor + ", eng=" + eng;
	}
	
	@Override
	public int compareTo(Object o) {  //기준이 크면 양수를 전달하고 기준이 작으면 음수를 전달  
		Score score = (Score)o; //Object객체를 Score객체로 down casting
		return this.kor - score.kor;//기준이 크면 양수가 전달되고 기준이 작으면 음수가 전달되고 같으면 0 전달되게 오버라이딩
	}
}
