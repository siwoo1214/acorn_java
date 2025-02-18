package day03;

public class 연산자_증감연산자 {
	public static void main(String[] args) {
		//++a, a++
		//공통점 : 변수의 값을 1 증가 시킨다
		//차이점 : 연산의 결과가 다르다(++a => 증가된 후의 값을 반환)
		//                      (b++ => 증가되기 전의 값을 반환)
		
		int a=10,b=10;
		int result = a++;
		int result2 = ++b;
		
		System.out.println(a);
		System.out.println(result);
		System.out.println(b);
		System.out.println(result2);
		
		int x=10,y=9,z=8;
		int result3;
		
		x++; --y; z++;
		result3=--x + y++ + --z;
		System.out.println(result3);
	}
}
