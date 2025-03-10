package day16.io.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) {

		// 파일로 부터 쓰기
		// 파일로 부터 읽기

		// 기반스트림 - 바이트 스트림, 문자 스트림

		// 바이트 스트림
		// 기반스트림(입력용,출력용)
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("res/input.txt");
			int data = fis.read();
			System.out.println((char) data);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 파일열기
			// 파일닫기
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}