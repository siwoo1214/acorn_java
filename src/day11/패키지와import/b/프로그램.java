package day11.패키지와import.b;

public class 프로그램 {
	public static void main(String[] args) {
		
		/*
		 * public class Snack {
				String name;  //default 접근제한자를 갖는다 (같은 package에서 접근 가능)
				int price;    //default
		 */
		
		Snack s = new Snack("새우깡",1200);
		s.toString();
		s.name="";  //접근이 가능함
		s.price=0;  //접근이 가능함 (접근제한자가 default이기 때문에)
		
		/*
		 * public class Snack {
				private String name;  //private은 내 클래스에서만 사용 가능하다
				private int price;    
			이렇게 private으로 변수들을 설정하면 사용할 수 없다 쿨래스에서만 쓸 수 있으니까
		 */
	}
}
