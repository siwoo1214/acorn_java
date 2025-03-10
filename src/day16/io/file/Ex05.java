package day16.io.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) {
		try (FileReader fr = new FileReader("res/names.txt");){
			while(true) {
				int data = fr.read();
				if(data==-1) break;
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
