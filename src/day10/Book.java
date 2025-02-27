package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {
	String title;
	String author;
	int price;
	int totalprice;
	Scanner sc = new Scanner(System.in);
	ArrayList<Book> list = new ArrayList<>();

	public Book() {}
	
	public Book(String title, String author, int price) {
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	
	public String toString() {
		return "책 제목 : "+title+" | 작가 : "+author+" | 가격 : "+price;
	}
	
	
	public void input() {
		loop : while(true) {
			System.out.println("책 정보를 입력해주세요(제목,작가,가격)\n다 입력하셨다면 '종료'를 입력해주세요");
			String author=sc.next();
			if(author.equals("종료")) break loop;
			
			String bookName=sc.next();
			int price=sc.nextInt();

			list.add(new Book(author,bookName,price));
		}
	}
	
	public void printBooks() {
		for(Book i : list) {
			System.err.println(i.toString());
		}
	}
	
	public void borrow_book() {
		System.out.print("어떤 책을 대여하시겠습니까? (책제목 입력)");
		String book_borrow=sc.next();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).title.equals(book_borrow)) {
				list.remove(i);
			}
		}
		
		System.err.println("대여 완료!");
	}
}
