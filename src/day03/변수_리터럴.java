package day03;

public class 변수_리터럴 {
	public static void main(String[] args) {
		
		//프로그램에서 값 자체 => 리터럴이라고 함
		//상수라고도 함
		
		//리터럴도 저장된 후 사용된다
		//리터럴도 크기를 갖는다
		
		//정수형 리터럴 => int의 크기로 저장된다
		//실수형 리터럴 => double의 크기로 저장된다
		
		long l = 2200000000L;
		//1. 22억이 상수영역에 저장된다 int크기로(상수영역에 int크기로 저장되는 것에 문제 발생)
		//2. L long형 변수에 값이 저장된다
		
		//Long형 리터럴은 값뒤에 l,L을 붙여야함(소,대문자 L)
		System.out.println(l);
		
		//1. 3.3이 상수영역에 저장되는 것은 문제가 발생하지 않는다
		//2. double형 데이터를 더 작은 float에 저장하려고 하니까 문제가 발생한다(데이터 손실)
		float f = 3.3f;
		//값 뒤에 f,F를 분여야함
	}
}
