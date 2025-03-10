package day16.실습;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class 성적처리프로그램 {
	public static void main(String[] args) {
		ArrayList<학생성적> list = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader("res/acornScore2.txt"))){
			String line;
			while((line=br.readLine())!=null) {
				String[] data = line.split(",");
				학생성적 student = new 학생성적(data[0],Integer.parseInt(data[1]),Integer.parseInt(data[2]),Integer.parseInt(data[3]),Integer.parseInt(data[4]));
				list.add(student);
			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		try (ObjectOutputStream op = new ObjectOutputStream(new FileOutputStream("res/학생성적.txt"))){
			for(학생성적 tmp : list) {
				op.writeObject(tmp);
				op.flush();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		try (ObjectInputStream os = new ObjectInputStream(new FileInputStream("res/학생성적.txt"))){
		
			while(true) {				
				 학생성적 s = (학생성적)os.readObject();
				 System.out.println(s);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} 
	}
}
