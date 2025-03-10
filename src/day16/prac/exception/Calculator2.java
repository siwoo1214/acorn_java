package day16.prac.exception;

public class Calculator2 {
	public int add(int su1,int su2) {
		if(su1<0 || su2<0) {
			System.out.println("음수 안된다고");
			return -99;   //int형 반환인데 잘못됬다고 알려야할 때 int반환의 약속을 지키기 위해서 -99라는 임의의 값을 사용하였음
		}
		
		return su1+su2;

	}
}
