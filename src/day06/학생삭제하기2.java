package day06;

import java.util.Scanner;

public class 학생삭제하기2 {
	public static void main(String[] args) {
//		탈퇴했어라는 정보를 따로 갖는것이 삭제된다는 마스크
		Scanner sc = new Scanner(System.in);
		String[] names = new String[5];
		
		int index=5;
		
		names[0]="정연수";
		names[1]="최지태";
		names[2]="김보성";
		names[3]="황예지";
		names[4]="최하은";
		
		//학생조회
		for(int i=0; i<names.length; i++) {
			System.out.println((i+1)+" "+names[i]);
		}
		
		//삭제할 학생번호 입력 받는다
		int deleteNo = sc.nextInt();  
		deleteNo-=1;
		
		//  0       1      2       3        4
		//"정연수" "퇴지태" "김보성"  "황예지"   "최하은"
		
		//"퇴지태" "김보성"  "황예지" "최하은"   "최하은"    2번 방법 <= 삭제된 모습
		
		for(int i=deleteNo; i<names.length-1; i++) {
			names[i]=names[i+1];
		}
		
		index--;
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		System.err.println("삭제 완료된 리스트");
		for(int i=0; i<index; i++) {
			System.out.println(names[i]);
		}
		sc.close();
	}
}
