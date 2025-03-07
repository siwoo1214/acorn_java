package day15.정렬.myarrays;


//public class Score extends Object{}
public class Score implements MyComparable{
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
		return "{name=" + name + ", kor=" + kor + ", eng=" + eng+"}";
	}
	
	@Override
	public int compareTo(Object another) {  //sort를 쓰면 compareTo메소드가 오버라이딩된 기능으로 작동하게 된다
		Score s = (Score)another;  //기준객채(this), 비교객체(another)
		return this.kor-s.kor;  //기준이 크면 양수, 작으면 음수를 반환
	}
}
