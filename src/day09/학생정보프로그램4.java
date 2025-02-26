package day09;

public class 학생정보프로그램4 {
	public static void main(String[] args) {
		Student s = new Student("박시우",99,99);
		
		//여기서 s를 객체라고 부른다
		//변수 덩어리(구조화된 변수) => 객체라고 부른다
		//변수의 정보 + 변수가 사용할 수 있는 함수의 정보를 갖고있다
		//접근제한자와 생성자를 통해서 데이터를 보호할 수 있다
		
		s.calc();
		
		//변수
		int a;
		a=10;
		System.out.println(a);
		
		Student st = new Student();
		st.name="박시우";
		st.name="박시우2";
		
		st.eng=89;
		st.eng=89;
		
	}
}
