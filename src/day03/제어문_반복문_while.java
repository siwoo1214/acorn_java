package day03;

import java.util.Scanner;

public class 제어문_반복문_while {
	public static void main(String[] args) {
		//while => 반복횟수가 정해져 있지 않고 특정조건일 때까지 반복
		//1~10까지 합
//		int n=0,sum=0;
//		while(++n<=10) {
//			sum+=n;
//		}
//		System.out.println(sum);
		//0이 입력되면 반복이 종료되도록 하겠다
		//0이 입력될 때 까지 수를 더하시오
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int sum=0;
		while(input!=0) {
			sum+=input;
			input = sc.nextInt();
		}
		System.out.println(sum);
		//while(true)문으로 만들면 반드시 while문 안에 break를 넣어야한다
	}
}
