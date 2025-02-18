package day03;

public class 연산자_증감연산자_10까지합 {
	public static void main(String[] args) {
		/*
		int n=0;
		int sum=0;
		
		while(n<10) {
			n++; sum+=n;
		}
		
		System.out.println(sum);
		*/
		
		int n=0, sum=0;
		while(++n<=10) {
			sum+=n;
		}
		System.out.println(sum);
	}
}
