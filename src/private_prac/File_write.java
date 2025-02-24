package private_prac;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class File_write {
	public static void main(String[] args) throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\siwoo\\OneDrive\\바탕 화면\\에이콘_java\\prac.txt"));
		for(int i=0; i<=10; i++) {
			String data = i+"번째 줄입니다";
			pw.println(data);
		}
		pw.close();
		
	}
}
