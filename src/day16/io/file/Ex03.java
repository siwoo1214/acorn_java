package day16.io.file;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex03 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("res/input2.txt");
		
		//파일을 생성하면 파일의 끝을 알리는 문자가 같이 저장된다. 문자의 ascii코드값이 -1이다
		while(true) {
			int data = fis.read();
			if(data==-1) break;  //파일의 끝을 알 수 있는 값 == -1
			System.out.print((char)data);
		}
		
	}
}
