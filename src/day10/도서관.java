package day10;

import java.util.Scanner;

public class 도서관 {
	public static void main(String[] args) {
		Book b = new Book();
		Scanner sc = new Scanner(System.in);

		loop: while (true) {
			System.out.println("도서관 프로그램에 오신걸 환영합니다");
			System.out.println("1.책 추가  2.책 대여  3.책 조회  4.종료");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				b.input();
				break;
			case 2:
				b.borrow_book();
				break;
			case 3:
				b.printBooks();
				break;
			case 4:
				break loop;

			}
		}
	}
}
