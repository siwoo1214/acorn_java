package day16.prac.exception;

import java.io.IOException;

public class Ex07 {
	public static void main(String[] args){
		
		//checked Exception 만나기 (io관련 기능들을 사용할 때)
		//예외처리가 필수적이다
		//방법 2가지 제공
		//1. try-catch, throws(예외던지기, 예외미루기)
		
		//키보드로부터 한 바이트 읽어오는 기능
		
		try {
			int result = System.in.read();     //read에서 발생하는 예외가 처리될 수 있음
			System.out.println(result);
			System.out.println((char)result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
