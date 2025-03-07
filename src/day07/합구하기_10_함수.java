package day07;

public class 합구하기_10_함수 {
	public static void main(String[] args) {
		extracted();
	}

	public static void extracted() {
		getTentotal();
		int result = getTentotal2();
		System.out.println(result);
	}

	public static void getTentotal() {
		//함수명
		//기능 : 1부터 10까지 합
		//입력 : x
		//반환 : x
		
		int sum=0;
		
		for(int i=1; i<=10; i++){
			sum+=i;
		}
		
		System.out.println(sum);
	}
	
	public static int getTentotal2() {
		//함수명
		//기능 : 1부터 10까지 합
		//입력 : x
		//반환 : o
		
		int sum=0;
		
		for(int i=1; i<=10; i++){
			sum+=i;
		}
		
		System.out.println(sum);
		return sum;
	}
}
