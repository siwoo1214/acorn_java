package day11_변수종류_초기화;

class Product{
	private String name;   //기본값으로 초기화
	private int price=100; //명시적 초기화   //점찍으면 얘네도 보이기 때문에 private 으로 써서 캡슐화 시킨다
	private static int cnt=0; //기본값 초기화 0
	
	//인스턴스 초기화 블럭
	{
		cnt++;
		System.out.println("초기화 블럭 실행됨");
	}
	
	//생성자
	public Product(){
		//cnt++;
	}
	
	public Product(String name, int price) {
		this.name=name;
		this.price=price;
		//cnt++;
	}
	
	//메소드(함수)
	//인스턴스 변수의 값을 얻어오는 방법을 제공
	public String toString() {
		return name+price;
	}
	
	public void printCnt() {
		System.out.println(cnt);
	}
	
	//getter : 각각의 속성 값을 제공하는 방법
	//setter : 각각의 속성 값을 변경하는 방법
	
}

public class 인스턴스변수초기화 {
	public static void main(String[] args) {
		
		/* 인스턴스 변수 초기화 방법과 순서
		 * 1. 기본값으로 초기화  int age; (int=0, double=0.0, String=null, 객체는 모두 null
		 * 2. 명시적으로 초기화  int age=20;
		 * 3. 초기화 블럭     {  }
		 * 4. 생성자
		 */
		
		Product p = new Product("샤넬백",12000000);
		Product p2 = new Product("구찌백",40000000);
		
		System.out.println(p.toString());
		System.out.println(p2.toString());
		
		Product p3 = new Product();
		System.out.println(p3.toString());
		p.printCnt();
	}
}
