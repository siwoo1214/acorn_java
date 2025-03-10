package day16.io.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex06 {
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
