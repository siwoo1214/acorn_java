package hello;

public class Ex02 {
	public static void main(String[] args) {
		int sum=0,term=0;
		
		for (int i = 1; i <=100; i++) {
			term  = term+i;
			sum = sum + term;
		}
		
		System.out.println(sum);
	}
}
