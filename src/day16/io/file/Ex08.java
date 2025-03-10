package day16.io.file;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex08 {
	public static void main(String[] args) {
		int total=0;
		int cnt=0;
		double avg;
		
		try (BufferedReader br = new BufferedReader(new FileReader("res/math.txt"))){
			while(true) {
				String data = br.readLine();
				if(data==null) break;
				cnt++;
				int score = Integer.parseInt(data);
				total+=score;
			}
			//평균구하기
			avg=total/(double)cnt;
			System.out.println("수학점수 평균 : "+avg);
		} catch (Exception e) {
		}
	}
}
