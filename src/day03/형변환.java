package day03;

public class 형변환 {
	public static void main(String[] args) {
		//형 : 자료형
		//형변환 : type을 변환하는 것
		// 자동형변환(묵시적)
		// 강제형변환 (명시적)
		
		byte b = 127;  //128~127
		byte c = (byte)128;  //강제형변환  but 오버플로우
		
		System.out.println(c);
		
		double su1 = 10;
		double su2=3;
		System.out.println(su1);
		
		double result1=su1/(double)su2;  //  => su2변수를 일시적으로 형변환
		System.out.println(result1);
		
		double num=25.3;
		int su3 = (int)num;  //정수변수에 실수형데이터를 넣을 수 없으니까 int형으로 casting
		System.out.println(su3);
		
		//형변환
		//큰변수 = 작은변수  (자동으로 형변환됨)  맥주컵=소주컵
		//작은변수 = (작은 변수 type) 큰변수  (이 변수가 일시적으로 형을 변환하여 사용하겠다 : 강제형변환,명시적형변환)
		//데이터 손실이 발생한다  (소주컵 = 맥주컵)
	}
}
