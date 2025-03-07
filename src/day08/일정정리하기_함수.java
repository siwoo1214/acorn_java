package day08;

import java.util.Scanner;

public class 일정정리하기_함수 {
	static Scanner sc = new Scanner(System.in);
	static String[] schedule = new String[5];
	static int index = 0;
	
	public static void main(String[] args) {
		loop : while(true) {
			System.out.println("메뉴  1.등록 2.조회 3.변경 4.삭제");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				등록하기();
				break;
			case 2:
				조회하기();
				break;
			case 3:
				변경하기();
				break;
			case 4:
				삭제하기();
				break;
			case 5:
				System.out.println("종료합니다");
				break loop;
			default:
				System.out.println("메뉴가 잘못나왔어");	
			}
		}
		System.out.println("bye bye ~");
	}
	
	public static void 등록하기() {
		System.out.println("등록할 알정을 입력하세요");
		String tmp = sc.next();
		schedule[index]=tmp;
		index++;
	}
	
	public static void 조회하기() {
		for (int i = 0; i < index; i++) {
			System.out.println((i+1)+". "+schedule[i]);
		}
	}
	
	public static void 삭제하기() {
		조회하기();
		System.out.println("삭제할 일정을 선택하시오");
		int tmp = sc.nextInt()-1;
		
		for(int i=tmp; i<schedule.length-1; i++) {
			schedule[i]=schedule[i+1];
		}
		index--;
		
		System.err.println("삭제가 완료되었습니다");
		조회하기();
	}
	
	public static void 변경하기() {
		조회하기();
		System.out.println("변경할 일정을 선택하시오");
		int index = sc.nextInt();
		index-=1;
		
		System.out.println("변경할 일정을 입력하시오");
		String tmp = sc.next();
		
		schedule[index]=tmp;
	}
}
