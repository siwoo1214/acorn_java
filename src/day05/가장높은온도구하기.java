package day05;

public class 가장높은온도구하기 {
	public static void main(String[] args) {
		int[] Temperture = {33,35,32,35,36,35,34};
		int max=Temperture[0];
		
		//첫번쨰 요소 mmax변수의 값 비교
		if(Temperture[0]>max) {
			max=Temperture[0];
		}
		
		if(Temperture[1]>max) {
			max=Temperture[1];
		}
		
		if(Temperture[2]>max) {
			max=Temperture[2];
		}
		
		if(Temperture[3]>max) {
			max=Temperture[3];
		}
		
		if(Temperture[4]>max) {
			max=Temperture[4];
		}
		
		if(Temperture[5]>max) {
			max=Temperture[5];
		}
		
		if(Temperture[6]>max) {
			max=Temperture[6];
		}
		
		System.out.println(max);
	}
}
