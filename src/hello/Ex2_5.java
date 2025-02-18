package hello;

public class Ex2_5 {
	public static void main(String[] args) {
		int first = 2,sum=0;
		
        for (int i = 0; i < 7; sum += first, first *= 3, i++);
		System.out.println(sum);
	}
}
