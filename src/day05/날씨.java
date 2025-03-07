package day05;

public class 날씨 {
	public static void main(String[] args) {
		  int[]  Temperatures  =  { 33 , 35, 32 ,35  ,36 ,35 ,34  }  ;
		  int avg=0,cnt=0,max=Temperatures[0];
		  
		  //1.
		  for(int i=0; i<Temperatures.length; i++) {
			  System.out.print(Temperatures[i]+"도");
			  avg+=Temperatures[i];
			  if(Temperatures[i]>35) {
				  cnt++;
			  }
			  
			  if(Temperatures[i]>max) {
				  max=Temperatures[i];
			  }
		  }
		  
		  System.out.println();
		  
		  //2.
		  System.out.println("이번주 평균온도는 "+(double)avg/Temperatures.length+"도 입니다");
		  
		  //3.
		  System.out.println("35도기 넘는 날의 횟수 : "+cnt);
		  
		  //4.
		  System.out.println("최고온도 : "+max);
	}
}
