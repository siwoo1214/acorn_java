package day16.io.file;

import java.io.FileWriter;
import java.io.IOException;

public class Ex11 {
	public static void main(String[] args) {
		
		//문자 출력 기반 스트림
		try (FileWriter w = new FileWriter("res/output.txt")){
			w.write("안녕하세요\n");
			w.write("파일이 생겼어요");
			w.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
