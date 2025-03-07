package day06;

public class 배열2차원 {
	public static void main(String[] args) {
		///TODO 내가 해야하는 목록 적어놓기
		
		//2차원 배열 : 1차원 배열을 요소로 가지는 배열이다
		int[][] arr = new int[2][3];  //2행 3열짜리 2차원 배열 생성
		
		/*
		 * 2 4 6
		 * 8 10 12
		 */
		arr[0][0]=2;
		arr[0][1]=4;
		arr[0][2]=6;
		arr[1][0]=8;
		arr[1][1]=10;
		arr[1][2]=12;
		
		int[][] arr2 = new int[][] {
			{2,4,6},
			{8,10,12}
		};
		
		int[][] arr3 = {
				{2,4,6},
				{8,10,12}
		};
	}
}
