package day06;

public class 약수구하기 {
	public static void main(String[] args) {
		int su = 6, index=0;
		int[] 약수 = new int[su];
		
		
		for(int i=1; i<=su; i++) {  //1부터 6
			if(su%i==0) {  //약수 발견
				//배열에 요소에 넣기
				//배열의 index
				약수[index]=i;
				index++;
			}
		}
		
		for(int i=0; i<index; i++) {
			System.out.print(약수[i]+" ");
		}
		
		/*반복문
		for(int i=1; i<=su; i++) {
			if(su%i==0) {
				System.out.println(i+"는 약수입니도");
			}
		}*/
		
		/*
		 * 1. 약수의 개수만큼 배열 만들기
		 * 새로운 배열에 약수내용 저장하기
		 * */
		
		System.out.println();
		
		int[] 약수최종 = new int[index];
		for(int i=0; i<index; i++) {
			약수최종[i]=약수[i];
		}
		
		for(int i=0; i<약수최종.length; i++) {
			System.out.print(약수최종[i]+" ");
		}
		
	}
}
