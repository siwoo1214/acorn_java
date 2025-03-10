package day16.prac.exception;

public class Ex01 {
	public static void main(String[] args) {
		int[] arr = new int[] {10,20,30,40};
		
		try { 
			//예외가 발생할 수 있는 코드
			//예괴가 발생되면 예외객체가 생성된다 !!
			
			for(int i=0; i<=arr.length; i++) {
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		
		
		System.out.println("프로그램 종료");
	}
}
