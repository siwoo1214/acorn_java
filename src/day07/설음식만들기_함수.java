package day07;

public class 설음식만들기_함수 {
	public static void main(String[] args) {
		
		//만두 만들기
		String 음식1 = 만두만들기();
		
		//떡국 만들기
		String 음식2 = 떡국만들기(음식1);
		
		//전 만들기
		String 음식3 = 전만들기();
		
		//갈비찜 만들기
		String 음식4 = 갈비찜만들기();
		
		//상차리기
		상차리기(음식1, 음식2, 음식3, 음식4);
		
	}
	
	public static void 상차리기(String 음식1, String 음식2,String 음식3,String 음식4) {
		System.out.println("설날 상차리기");
		System.out.println(음식1+음식2+음식3+음식4);
	}
	
	//만두만들기
	public static String 만두만들기(){
		String 음식1;   //함수에서 만들어지는 변수 => 지역변수
		System.out.println("만두 만들기1");
		System.out.println("만두 만들기2");
		System.out.println("만두 만들기3");
		System.out.println("만두 만들기4");
		
		음식1 = "김치만두";
		return 음식1;
	}
	
	//떡국만들기
	public static String 떡국만들기(String 음식1) {
		String 음식2;
		System.out.println("떡국만들기1");
		System.out.println(음식1+"넣는다");
		
		음식2 = "떡국";
		
		return 음식2;
	}
	
	//전만들기
	public static String 전만들기(){
		String 음식3;
		System.out.println("전 만들기1");
		System.out.println("전 만들기2");
		System.out.println("전 만들기3");
		System.out.println("전 만들기4");
		
		음식3 = "신적";
		
		return 음식3;
	}
	
	public static String 갈비찜만들기() {
		String 음식4;
		
		System.out.println("갈비찜 만들기1");
		System.out.println("갈비찜 만들기2");
		System.out.println("갈비찜 만들기3");
		System.out.println("갈비찜 만들기4");
		
		음식4="소갈비찜";
		return 음식4;
	}
}
