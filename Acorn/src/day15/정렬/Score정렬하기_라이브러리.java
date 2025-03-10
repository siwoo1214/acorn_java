package day15.정렬;

import java.util.Arrays;

public class Score정렬하기_라이브러리 {
	public static void main(String[] args) {
		Score[] arr = new Score[5];

		arr[0] = new Score("박예린", 100, 97);
		arr[1] = new Score("이정호", 99, 90);
		arr[2] = new Score("김민환", 89, 100);
		arr[3] = new Score("김유민", 88, 77);
		arr[4] = new Score("박수경", 85, 89);
		
		Arrays.sort(arr);  //sort에 구현되어있는 compareTo를 오버라이딩해서 Score객체를 비교할 수 있도록 만들었음
		
		for(Score a : arr) {
			System.out.println(a);
		}
	}
}
