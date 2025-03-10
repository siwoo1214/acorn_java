package day16.io.file;

public class Score {
	String name;
	int kor;
	
	//생성자
	public Score() {
		
	}

	public Score(String name, int kor) {
		super();  //부모가 없으면 Object가 부모
		this.name = name;
		this.kor = kor;
	}

	//toString();
	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + "]";
	}
	
	//getter,setter
}
