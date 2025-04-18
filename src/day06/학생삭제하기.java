package day06;

import java.util.Scanner;

public class 학생삭제하기 {
	public static void main(String[] args) {
//		탈퇴했어라는 정보를 따로 갖는것이 삭제된다는 마스크
		Scanner sc = new Scanner(System.in);
		String[] names = new String[5];
		
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
		
		//배열에서 삭제한다
		names[deleteNo-1]="0"; //삭제된 요소를 의미함
		     
		//1. 배열의 요소에 0을 입력한다 (0=> 삭제된 학생이다)
		//2. 오른쪽 요소를 왼쪽요소로 저장하기
		
		//조회하기 (0인 것은 조회되지 않도록 하기)
		for(int i=0; i<names.length; i++) {
			if(!names[i].equals("0")) {
				System.err.println(names[i]);
			}
		}
		
		//  0       1      2       3        4
		//"정연수" "퇴지태" "김보성"  "황예지"   "최하은"
		
		//"정연수" "0" "김보성"  "황예지"   "최하은"    1번 방법
		//"퇴지태" "김보성"  "황예지"   "최하은"        2번 방법
	}
}
