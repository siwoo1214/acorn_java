package day03;

public class 연산자_논리연산자 {
	public static void main(String[] args) {
		
		//논리연산자 : &&, ||, !
		int kor=80, eng=90;
		
		boolean result= (kor>=90)&&(eng>=90);
		System.out.println(result==true?"장학금지급":"장학금 미지급");
		
		boolean result2 = (kor>=90)||(eng>=90);
		System.out.println(result2==true?"장학금지급":"장학금 미지급");
		
		boolean result3=kor>=90;
		boolean result4=!(kor>=90);
		System.out.println(result3);
		System.out.println(result4);
	}
}
