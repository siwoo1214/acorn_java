package 학생관리;

import java.util.Scanner;

public class 학생관리프로그램3 {
	public static void main(String[] args) {
		Student[] list = new Student[10];
		int index=0;
		Scanner sc = new Scanner(System.in);
		
		loop : while(true) {
			System.out.println("1.등록 2.조회 3.성적처리 4.종료 5.변경");
			
			int menu=sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("학생이름 : ");
				String name = sc.next();
				
				System.out.println("국어 성적 : ");
				int kor=sc.nextInt();
				
				System.out.println("영어 성적 : ");
				int eng=sc.nextInt();
				
				Student s1 = new Student(name,kor,eng);
				list[index]=s1;
				index++;
				break;
			case 2:
				for(int i=0; i<index; i++) {
					System.out.println((i+1)+". "+list[i].toString());
				}
				break;
			case 3:
				for(int i=0; i<index; i++) {
					list[i].calc();
				}
				break;
			case 4:
				break loop;
			case 5:
				for(int i=0; i<index; i++) {
					System.out.println((i+1)+". "+list[i].toString());
				}
				System.out.println("학생번호를 선택하시오");
				int updateIndex = sc.nextInt()-1; //인덱스로 사용하려면 -1 해줘야함
				
				System.out.println("변경할 국어점수 입력하시오");
				int newKor=sc.nextInt();
				
				Student search = list[updateIndex];
				search.setKor(newKor);
				System.err.println("변경되었습니다");
				break;
			default:
					System.out.println("메뉴가 잘못됬엉");
			}//switch
		}//while
	}
}
