package day11_변수종류_초기화;

class Acorn{
	private String id;     //인스턴스 변수, new에 의해서 메모리 확보
	private String pw;
	private String name;
	
	static int cnt=0;  //클래스 변수, 한개만 생겨도 모든 객체에서 동일하게 적용된다, 공통으로 사용되는(공유하는) 변수
	static String teacher = "우주연";  //공통되는 변수는 static으로 선언하면 좋음
	
	
	//생성자 (인스턴ㅡ 변수에 값 넣는 방법
	public Acorn() {}
	
	public Acorn(String id, String pw, String name) {
		cnt++;  //생성될때마다 ++됨
		this.id=id;
		this.pw=pw;
		this.name=name;
	}
	
	//method (방법 : 데이터를 사용하는 방법을 제공하겠다)
	public String toString() {
		return id+" "+pw+" "+name;
	}
	
	//getter 각 속성의 값을 반환하는 방법
	//getter규칙 : get속성명 (), 속성명의 첫글자는 대문자로 규칙임
	public String getId() {
		return id;
	}
	
	public String getPw() {
		return pw;
	}
	
	public String getName() {
		return name;
	}
	
	//비번변셩 해야한다
	//속성값을 변경하는 방법
	//setter
	//규칙 : set속성명 (첫글자 대문자)
	public void setPw(String pw) {
		this.pw=pw;
	}
	
	// 이유 : 객체 생성이후 사용할 수 있는 메소드 이기 때문에
	// 객체생성과 상관없이 바로 사용할 수 있는 변수를 사용하는 것은 당연하다
//	public void printCnt() {
	public static void printCnt() {   //객체생성과 상관없이 사용할 수 있다
		System.out.println(cnt);      //객체변수를 사용해야한다? 그냥 public 
	}							   	  
	
	//메소드 작성시 static 여부 결정하는 기준은
	//인스턴스 변수의 사용 유무 => 사용한다면 인스턴스 메소드로 만들어야한다 (필수)
	//                    => 사용 안한다면  static메소드로 만들 수 있다(선택), static메소드로 사용하는 것을 권장
	
	
}

public class 클래스변수홣용 {
	public static void main(String[] args) {
		Acorn acorn = new Acorn("딸기","1234","박시우");   //괄호안에 아무것도 없는 생성자 : 디폴트 생성자
		Acorn acorn2 = new Acorn("포도","9090","정연수");
		Acorn acorn3 = new Acorn("사과","4343","최지태");
		
		//acorn=null; //가비지 컬렉터에 의해 반환됨 이렇게 된다면
		
		
	}
}
