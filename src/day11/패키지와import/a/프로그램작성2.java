package day11.패키지와import.a;

import day11.패키지와import.b.Snack;

public class 프로그램작성2 {
	public static void main(String[] args) {
		//다른 패키지에 있는 클래스를 import하는 방법에는 이렇게 두가지가 있다
//		day11.패키지와import.b.Snack snack = new day11.패키지와import.b.Snack();
		Snack snack = new Snack("오징어땅콩",2300);
		System.out.println(snack.toString());
		
	}
}
