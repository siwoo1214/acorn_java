package day16.prac.exception;

public class Ex02 {
	public static void main(String[] args) {
		int[] arr = new int[] {10,20,30,40};
		
		//unchecked exception 
		//try ! catch문으로 예외를 처리해보자
		
		try { 
			//예외가 발생할 수 있는 코드
			//예괴가 발생되면 예외객체가 생성된다 !!
			
			for(int i=0; i<=arr.length; i++) {
				System.out.println(arr[i]);
			}
			System.out.println("======코드수행======");     //예외가 발생하면 아래 실행문 실행하지 않고 바로 catch블럭으로 이동함
			
		}catch(ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		
		
		System.out.println("프로그램 종료");
	}
}
