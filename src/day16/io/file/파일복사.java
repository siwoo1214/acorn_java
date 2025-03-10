package day16.io.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class 파일복사 {
	public static void main(String[] args) {
		// 이미지파일 복사하기

		// 입력스트립(바이트 기반 스트림)
		// 출력스트립(바이트 기반 스트림)

		// FileInputStream
		// FileOutputStream 둘 다 바이트단위

		try (FileInputStream f = new FileInputStream("res/chillguy.jpg");
				FileOutputStream o = new FileOutputStream("res/imgcopy.jpg")) {
			while(true) {
				int data = f.read();   //파일의 끝  ==>  -1
				if(data==-1) break;
				o.write(data);   // sysout(data)를 바이트단위로 다른 파일에다가 복붙하는거임
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {

		}

	}
}
