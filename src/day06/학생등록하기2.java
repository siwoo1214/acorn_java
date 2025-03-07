package day06;

import java.util.Scanner;

public class 학생등록하기2 {
	public static void main(String[] args) {
		
		//배열특징
		//1. 같은 자료형이어야 한다
		//2. 반드시 크기를 알야야 한다 (크기를 정해야 한다)
		final int MAX=5;//현재 배열의 크기
		String[] names = new String[5];
		Scanner sc = new Scanner(System.in);
		int index=0;  //현재 배열의 size(크기)
		
		
		//index
		//0 1 2 3 4 까지는 ㄱㅊ
		//index 5 => 배열의 크기가 부족한 사이즈를 늘려야 함
		// => 더 큰 배열을 만들어서 해결. 큰배열에 요소를 복사
		
		//크기 체크
		if(index>=MAX) {
			String[] newNames = new String[MAX+MAX]; //
			for(int i=0; i<names.length; i++) {
				newNames[i]=names[i];
			}
			names=newNames;  //기본배열이 새롭게 만든 배열을 레퍼런스 할 수 있도록 만들어주는 과정을 해줘야함
		}else {
			System.out.println("이름을 등록 : ");
			String name = sc.next();
			names[index]=name;	
			index++;
		}

		if(index>=MAX) {
			String[] newNames = new String[MAX+MAX]; //
			for(int i=0; i<names.length; i++) {
				newNames[i]=names[i];
			}
			names=newNames;  //기본배열이 새롭게 만든 배열을 레퍼런스 할 수 있도록 만들어주는 과정을 해줘야함
		}else {
			System.out.println("이름을 등록 : ");
			String name = sc.next();
			names[index]=name;	
			index++;
		}
		
		if(index>=MAX) {
			String[] newNames = new String[MAX+MAX]; //
			for(int i=0; i<names.length; i++) {
				newNames[i]=names[i];
			}
			names=newNames;  //기본배열이 새롭게 만든 배열을 레퍼런스 할 수 있도록 만들어주는 과정을 해줘야함
		}else {
			System.out.println("이름을 등록 : ");
			String name = sc.next();
			names[index]=name;	
			index++;
		}
		
		
		if(index>=MAX) {
			String[] newNames = new String[MAX+MAX]; //
			for(int i=0; i<names.length; i++) {
				newNames[i]=names[i];
			}
			names=newNames;  //기본배열이 새롭게 만든 배열을 레퍼런스 할 수 있도록 만들어주는 과정을 해줘야함
		}else {
			System.out.println("이름을 등록 : ");
			String name = sc.next();
			names[index]=name;	
			index++;
		}
		
		if(index>=MAX) {
			String[] newNames = new String[MAX+MAX]; //
			for(int i=0; i<names.length; i++) {
				newNames[i]=names[i];
			}
			names=newNames;  //기본배열이 새롭게 만든 배열을 레퍼런스 할 수 있도록 만들어주는 과정을 해줘야함
		}else {
			System.out.println("이름을 등록 : ");
			String name = sc.next();
			names[index]=name;	
			index++;
		}
		
		System.out.println("새로운 배열이 만들어졌다");
		
		if(index>=MAX) {
			String[] newNames = new String[MAX+MAX]; //
			for(int i=0; i<names.length; i++) {
				newNames[i]=names[i];
			}
			names=newNames;  //기본배열이 새롭게 만든 배열을 레퍼런스 할 수 있도록 만들어주는 과정을 해줘야함
		}else {
			System.out.println("이름을 등록 : ");
			String name = sc.next();
			names[index]=name;	
			index++;
		}
		
		System.out.println();
		System.out.println(names.length);
		
	}
}
