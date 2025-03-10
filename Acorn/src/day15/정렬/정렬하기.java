package day15.정렬;

public class 정렬하기 {
	public static void main(String[] args) {
		//숫자배열
		//오름차순 정렬
		int[] arr = new int[] {10,5,43,2,13,22,52,93};
		
		//선택정렬,버블정렬
		for(int i=0; i<arr.length; i++) {
			//j : 비교대상 (기준+1부터 끝까지 비교함)
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					//i번째와 j번째 교환
					int tmp = arr[j];
					arr[j]=arr[i];
					arr[i]=tmp;
					
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		//문자배열
	}
}
