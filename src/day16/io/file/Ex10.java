package day16.io.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Ex10 {
	public static void main(String[] args) {
		ArrayList<Score2> list = new ArrayList<>();
		
		//파일읽어서 Score2객체로 만들어서 list에 추가하기
		try (BufferedReader br = new BufferedReader(new FileReader("res/acornScore2.txt"));){
			while(true) {
				String line = br.readLine();
				if(line==null) break;
				
				String[] data = line.split(",");
				String name = data[0];
				int kor = Integer.parseInt(data[1]);
				int eng = Integer.parseInt(data[2]);
				
				Score2 s = new Score2(name,kor,eng);
				list.add(s);
			}
			for(Score2 tmp : list) {
				System.out.println(tmp.name +"님 성적:"+ tmp.grade+" 평균:"+tmp.avg);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
