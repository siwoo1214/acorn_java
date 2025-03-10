package day16.io.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex04 {
	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("res/input2.txt");){  //try-with-resource를 쓰면 안닫아줘도 정상 종료된다
			while(true) {
				int data = fis.read();
				if(data==-1) break;
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
}
