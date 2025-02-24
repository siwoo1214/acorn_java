package private_prac;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File_read {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\siwoo\\OneDrive\\바탕 화면\\에이콘_java\\prac.txt"));
		while(true) {
			String line = br.readLine();
			if(line==null) break;
			System.out.println(line);
		}
		br.close();
		
	}
}
