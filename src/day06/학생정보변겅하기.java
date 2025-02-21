package day06;

import java.util.Scanner;

public class 학생정보변겅하기 {
	public static void main(String[] args) {
		String[] names = new String[5];
		Scanner sc = new Scanner(System.in);
		
		names[0]="정연수";
		names[1]="최지태";
		names[2]="김보성";
		names[3]="황예지";
		names[4]="최하은";
		
		//학생정보조회
		for(int i=0; i<names.length; i++) {
			System.out.println((i+1)+"째 사람 : "+names[i]);
		}
		
		//변경할 학생의 번호를 입력받는다
		int updateNo = sc.nextInt();
		
		//변경할 이름을 입력하세요
		String tempName = sc.next();
		
		//이름 변경
		names[updateNo-1]=tempName;
		
		System.out.println("변경이 완료되었습니다m");
		
		//학생조회하기
		for(int i=0; i<names.length; i++) {
			System.out.println((i+1)+"째 사람 : "+names[i]);
		}
		
		System.out.println("welcome th the show");
		sc.close();
	}
}
