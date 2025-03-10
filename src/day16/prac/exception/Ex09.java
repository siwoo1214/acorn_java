package day16.prac.exception;

import java.io.IOException;

public class Ex09 {
	//예외 미루기
	public static void main(String[] args) {
		try {
			키보드로부터읽어오기();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//
	}
	
	/*
	public static void 키보드로부터읽어오기() {
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	*/
	
	
	//예외미루기
	//메서드를 호출하는 쪽으로 예외가 넘어감
	public static void 키보드로부터읽어오기() throws IOException {
		System.in.read();
	}
	
}
