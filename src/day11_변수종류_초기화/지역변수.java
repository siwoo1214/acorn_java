package day11_변수종류_초기화;

public class 지역변수 {
	public static void main(String[] args) {
		//메소드 안에서 만들어지는 변수
		//메소드 호출 시 변수가 생기고 메소드 반환시 사라짐
		
		int result = add(3,5);
		System.out.println(result);
	}
	
	public static int add(int su1, int su2) {
		int total;          //su1, su2 매개변수도 지역변수
		total=su1+su2;      //total도 지역변수
		return total;
	}
}

//heap과 stack을 분리하는 이유? 메모리 공간을 효율적으로 사용하기 위해서