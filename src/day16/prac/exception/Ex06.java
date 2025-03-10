package day16.prac.exception;

public class Ex06 {
	public static void main(String[] args) {
		String str = "100";
		String str2 = "hello";
		
		//숫자형태로 된 문자열 => 실제 숫자로 변환
		//라이브러리 제공한다
		//int Integert.parseInt(String str);
		
		int result = Integer.parseInt(str);
		System.out.println(result+10);
		
		try {
			int result2 = Integer.parseInt(str2);
			System.out.println(result2);
		}catch(Exception e) {    //Throwable을 상속받는 애들만 들어올 수 있기 때문에 Object는 들어올 수 없음
//			e.printStackTrace();
			System.err.println("숫자로된 문자열을 입력하세요");
		}
		System.out.println("프로그램 종료");
		//Object o = new NumberFormatException(); 도 가능은 하다만 ...
	}
}
