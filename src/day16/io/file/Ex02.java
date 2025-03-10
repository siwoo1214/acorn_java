package day16.io.file;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex02 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("res/input.txt");
//		int data = fis.read();
//		System.out.print((char)data);
//		int data2 = fis.read();
//		System.out.print((char)data2);
//		int data3 = fis.read();
//		System.out.print((char)data3);
//		int data4 = fis.read();
//		System.out.print((char)data4);
//		int data5 = fis.read();
//		System.out.print((char)data5);
		
		
		  for(int i=0; i<5; i++){
		  	int data5 = fis.read();
			System.out.print((char)data5);
		  }
		 
		
		
	}
}
