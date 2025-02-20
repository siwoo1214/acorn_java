package day05;

public class 배열이란 {
	public static void main(String[] args) {
		//동일한 기억장소를 연속적으로 확보하고 사용하는 것을 말한다
		//반드시 같은 자료형이어야 한다
		//배열이름으로부터 인덱스로 접근한다
		//인덱스는 0부터 시작한다
		
		//배열에서 가장 중요한 것은 배열의 요소에 접근한는 일이다 (기억=>저장, 이용=>꺼내기, 읽기)
		
		//국어점수 5개를 배열로 선언하기
		int[] kors = new int[5];
		
		//배열의 값을 저장하기
		//배열의 요소
		//1차원 배열의 요소는 변수(기억장소이다)
		kors[0]=90;
		kors[1]=99;
		kors[2]=96;
		kors[3]=92;
		kors[4]=80;
		
		System.out.println(kors[0]);
		System.out.println(kors[1]);
		System.out.println(kors[2]);
		System.out.println(kors[3]);
		System.out.println(kors[4]);
	}
}
