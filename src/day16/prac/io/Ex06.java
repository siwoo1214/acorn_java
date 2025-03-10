package day16.prac.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex06 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//System.in (기반)
		//InputStreamReader (보조)
		//BufferedReader (보조)
		
		//BufferedReader의 readLine은 String으로 한번에 읽어온다
		while(true) {
			try {
				String data = br.readLine();
				if(data.equals("종료")) break;
				System.out.println(data);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
