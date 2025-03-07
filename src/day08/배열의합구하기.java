package day08;

public class 배열의합구하기 {
	public static void main(String[] args) {
		int[] arr = new int[] {70,88,100,89,78};
		
//		int sum=0;
//		sum+=arr[0];
//		sum+=arr[1];
//		sum+=arr[2];
//		sum+=arr[3];
//		sum+=arr[4];
//		System.out.println(sum);
//		
		int result = 배열의합구하기(arr);
		System.out.println(result);
		//배열의 합 함수초훌하기
		
		int result2 = 배열의가장큰값구하기(arr);
		System.out.println(result2);
	}
	
	//배열의 합을 반환하는 함수 만들기
	//기능 : 배열의 합 구하기
	//입력 : 배열
	//반환 : 배열 요소의 합계
	
	public static int 배열의합구하기(int[] arr) {
		int sum=0;
		sum+=arr[0];
		sum+=arr[1];
		sum+=arr[2];
		sum+=arr[3];
		sum+=arr[4];
		return sum;
	}
	
	//배열에서 가장 큰 값 반환하기
	public static int 배열의가장큰값구하기(int[] arr) {
		int max = arr[0];  
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		return max;
	}
	
	//메뉴추천
	//입력 : 없다
	//출력 : 임의의 메뉴
	public static String 메뉴추천하기() {
		String[] menu = new String[] {"돈까스", "제육", "짜장면", "카레라이스", "우동 김밥"};
		int index = (int)Math.random()*menu.length;
		
		String result = menu[index];
		return result;
	}
}
