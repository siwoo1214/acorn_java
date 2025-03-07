package day11.패키지와import.b;

public class Book {
	// new에 의해서 만들어진 new Book();
	String name;
	int price;
	String author;
	
	public Book() {}
	
//	public Book(String name, int price, String author) {
//		this.name=name;
//		this.price=price;
//		this.author=author;
//	}
	
	//생성자 오버로딩
	public Book(String name, int price) {
		this.name=name;
		this.price=price;
	}
	
	//방법
	//데이터 넣는 방법 (특별한 방법 : 생성자)
	//데이터를 얻어오는 방법 (그래서 method라고 부른다)
	public String toString() {
		return name+price+author;
	}
	
	
}
