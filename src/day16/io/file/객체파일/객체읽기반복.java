package day16.io.file.객체파일;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

//객체기반 입출력은 EOFException을 활용해서 반복문을 빠져나간다

public class 객체읽기반복 {
	public static void main(String[] args) {
		try (ObjectInputStream os = new ObjectInputStream(new FileInputStream("res/objOutput.txt"))){
			while(true) {
				try {
					Score s = (Score)os.readObject();
					System.out.println(s.toString());
				}catch(EOFException e) {
					break;
				}
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
