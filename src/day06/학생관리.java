package day06;

import java.util.Scanner;

public class 학생관리 {
	public static void main(String[] args) {
		//5명 이내의 학생관리 (학생이름관리 하는 프로그램)
		Scanner sc = new Scanner(System.in);
		String[] names = new String[5];  //배열 준비
		int index=0;//배열의 index관리
		
		int menu = 0;
		
		loop: while(true) {
			System.out.println("메뉴를 선택하시오 : 1. 등로, 2. 조회, 3. 변경, 4. 삭제, 5. 종료");
			menu=sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("1. 등록한다");
				//등록코드
				break;
			case 2:
				System.out.println("1. 조회한다");
				//조회코드
				break;
			case 3:
				System.out.println("1. 변경한다");
				//변켱코드
				break;
			case 4:
				System.out.println("1. 삭제한다");
				//삭제코드
				break;
			case 5:
				System.out.println("5. 종료한다");
				//5 입력하면 loop가 종료됨
				break loop;
			}
		}
		System.out.println("안녕히 가세요~");
		sc.close();
	}
}
