package day11_변수종류_초기화;

class Customer{
	String name;
	int age;
	
	public Customer() {}
	
	//생성자르 만들면 기본생성자는 제공되지 않기 때문에
	//필요하면 만들어서 사용해야 함
	public Customer(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	//위에 만든 Data를 사용하는 방법 => 메소드
	public String toString() {
		return name+age;
	}
	
	//getter
	//setter => 변경이 필요한 속성들만 제공
	
}

public class 인스턴스활용 {
	public static void main(String[] args) {
		Customer c = new Customer("황예지",24);
		Customer c2 = new Customer("최하은",25);
		
		System.out.println(c.toString());
		System.out.println(c2.toString());
	}
}
