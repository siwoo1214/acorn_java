package day06;

import java.util.Scanner;

public class 학생등록하기 {
	public static void main(String[] args) {
		//5명의 학생이름을 저장할 배열 준비하기
		//String은 참조형변수, 참조형 변수의 기본값 : null
		String[] names = new String[5];  //null로 다 채워짐
		int index = 0;
		Scanner sc = new Scanner(System.in);
		
		//등록하기
		//등록할 학생이름을 입력하시오
		String name = sc.next();
		names[index]=name;
		index++;

		//등록할 학생이름을 입력하시오
		name = sc.next();
		names[index]=name;
		index++;

		//등록할 학생이름을 입력하시오
		name = sc.next();
		names[index]=name;
		index++;
		
		//학생 조회하기
		for(int i=0; i<index; i++) {
			System.out.println(names[i]);
		}
	}
}
