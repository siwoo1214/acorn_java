package day06;

import java.util.Scanner;

public class 학생관리2 {
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
				//등록코드
				System.out.println("1. 등록한다");
				System.out.print("이름을 입력하세요 : ");
				String name = sc.next();
				names[index]=name;
				index++;
				break;
			case 2:
				System.out.println("2. 조회한다");
				//조회코드
				for(int i=0; i<index; i++) {
					System.out.println(names[i]);
				}
				System.out.println();
				break;
			case 3:
				System.out.println("3. 변경한다");
				//변켱코드
				for(int i=0; i<index; i++) {
					System.out.print((i+1)+". "+names[i]);
				}
				
				System.out.print("변경할 학생을 입력하시오 : ");
				int updateNo=sc.nextInt();
				updateNo-=1;
				System.out.print("변경할 이름을 입력하세요 : ");
				String temp=sc.next();
				names[updateNo]=temp;
				System.out.println("변경이 완료되었습니다");
				break;
			case 4:
				System.out.println("4. 삭제한다");
				//삭제코드
				for(int i=0; i<index; i++) {
					System.out.println(names[i]);
				}
				
				System.out.print("삭제할 학생번호 입력하세요 : ");
				int deleteNo = sc.nextInt();
				deleteNo-=1;  //인덱스로 변경
				
				for(int i=deleteNo; i<names.length-1; i++) {   //마지막 인덱스는 오른쪽이 없기때문에 -1인덱스까지만 가게된다
					names[i]=names[i+1];
				}
				
				index--;
				
				System.out.println("삭제되었습니다");
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
