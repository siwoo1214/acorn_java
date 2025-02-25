package day08;

public class 고객정보출력하기2 {
	public static void main(String[] args) {
		//한 사람의 고객정보
		String name = "홍길동";
		String address = "서울시 노원구";
		int age = 25;
		
		//Customer자료형으로 변수 만들기
		Customer c = new Customer();  //변수 만들기
		c.name = "홍길동";
		c.address = "서울시";
		c.age = 25;
		
		printInfo(c);
//		System.out.println(c.name);
//		System.out.println(c.address);
//		System.out.println(c.age);
	}
	
	//고객정보 출력하기
	public static void printInfo(Customer c) {
		System.out.println(c.name);
		System.out.println(c.address);
		System.out.println(c.age);
	}
}
