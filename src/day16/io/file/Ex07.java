package day16.io.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex07 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("res/acorns.txt"))){
			while(true) {
				String data = br.readLine();  //read()는 int로 읽어오고 readLine()은 String으로 읽어온다
				if(data==null) break;
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}


//BufferedReader를 쓰면 한문장씩 읽어올 수가 있어서 readLine을 사용할 수 있음 그리고 char로 casting 안해줘도 String형으로
//반환되기 때문에 편리성면에서 좋다
//catch.문에서는 다 써줄거면 좁은 범위부터 쓰는게 좋고 하나로 퉁칠거면 그냥 Exception을 써야함