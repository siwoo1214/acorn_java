package day07;

import java.util.Scanner;

public class 일정관리프로그램2 {
	public static void main(String[] args) {
		String[] 일정 = new String[5];
		int index = 0;
		Scanner sc = new Scanner(System.in);
		
		loop:while(true) {
			System.out.println("1.등록 2.조회 3.종료");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("등록합니다");
				System.out.println("등록할 일정 입력하시오 : ");
				String title = sc.next();
				일정[index] = title;
				index++;
				break;
			case 2:
				System.out.println("조회합니다");
				for(int i=0; i<index; i++) {
					System.out.println(i+". "+일정[i]);
				}
				break;
			case 3:
				System.out.println("종료합니다");
				break loop;
			}
		}
		
		System.out.println("byebye~");
	}
}
