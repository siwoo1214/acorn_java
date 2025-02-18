package day03;

public class 정수연산_실수연산 {
	public static void main(String[] args) {
		
		//정수연산
		//피연산자가 모두 정수라면 => 정수의 연산으로 수행 => 결과로 정수가 발생
		//10과 3 모두 정수이므로 정수연산 실행 => 결과는 3이 나옴
		
		//10/3 의 결과가 실수형의 값을 얻어야 된다면 두개 중에 한개를 실수형 type으로 변환해야함
		
		//3=>3.0 or 강제형변환을 사용하여 double형으로 변환하여 연산을 수행해야 한다
		double result=10/3;
		System.out.println(result);  //얘는 3이 3.0으로 casting된것임
		
		double result2=10/3.0;
		System.out.println(result2);
		
		int su1=10;
		int su2=3;
		double result3;
		
		//피연산자중에서 큰값으로 형이 변환됨, 둘 다 double형으로 변환됨
		//실수연산을 수행함
		
		result3=su1/(double)su2;
		System.out.println(result3);
	}
}
