package day03;

public class 변수_상수화 {
	public static void main(String[] args) {
		
		//변수를 상수화
		//대문자로 변수명을 사용함
		//final키워드 사용
		final int MAX = 100;
		final double PI = 3.14;
		// MAX=100;  선언시 초기화된 값으로 이용만 할 수 있다
		//우지보수성이 좋아진다, 가독성이 좋아진다
		
		System.out.println(MAX);
		System.err.println(PI);
		
	}
}
