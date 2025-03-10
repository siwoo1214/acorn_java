package day16.io.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Ex09 {
	public static void main(String[] args) {
		ArrayList<Score> list = new ArrayList<>();
		
		//파일읽어서 Score객체로 만들어서 list에 추가하기
		try (BufferedReader br = new BufferedReader(new FileReader("res/acornScore.txt"));){
			while(true) {
				String line = br.readLine();
				if(line==null) break;
				
				String[] data = line.split(",");
				String name = data[0];
				int kor = Integer.parseInt(data[1]);
				
				Score s = new Score(name,kor);
				list.add(s);
			}
			for(Score tmp : list) {
				System.out.println(tmp);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
