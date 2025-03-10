package day16.io.file.객체파일;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class 객체읽기 {
	public static void main(String[] args) {
		//res/objOutput.txt
		
		//기반스트림 : FileInputStream
		//보조스트림 : ObjectInputStream
		
		try (ObjectInputStream oi = new ObjectInputStream(new FileInputStream("res/objOutput.txt"))){
			try {
				Object o = oi.readObject();
				Score s = (Score)o;
				System.out.println(s);
				
				o = oi.readObject();
				s = (Score)o;
				System.out.println(s);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
