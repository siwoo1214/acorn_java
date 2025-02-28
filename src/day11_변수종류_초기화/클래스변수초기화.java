package day11_변수종류_초기화;

class Lotto{
	static int[] lotto = new int[5];
    static int cnt=5;  //명시적 초기화
	//static int cnt;  //기본값 초기화
    
    //static 초기화 블럭
    static {
    	//초기화 할 내용
    	for(int i=0; i<lotto.length; i++) {
    		int random = (int)(Math.random()*45)+1;  //0~44 + 1
    		lotto[i]=random;
    	}
    }
    
	public static void printLotto() {
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+", ");
		}
	}
	
	public static void printCnt() {
		System.out.println(cnt);
	}
	
	//메소드로 
//	public static void init() {
//		for(int i=0; i<lotto.length; i++) {
//    		int random = (int)(Math.random()*45)+1;  //0~44 + 1
//    		lotto[i]=random;
//    	}
//	}
}

public class 클래스변수초기화 {
	public static void main(String[] args) {
		Lotto.printLotto();  //함수가 static이기 때문에 그냥 클래스이름으로 불러와도 사용 가능하다
		Lotto.printCnt();
	}
	
	/*
	 * 클래스 변수 초기화 방법과 순서
	 * 1. 기본값으로 초기화
	 * 2. 명시적 초기화
	 * 3. static 초기화 블럭 : 복잡한 초기화
	 *  static {
	 *  }
	 */
	
	//프로그램의 시작 순서    main에서부터 시작됨
	//static정보가 먼저 로드됨
	//static 초기화 블럭이 실행됨
	//static main을 실행시킴
}
