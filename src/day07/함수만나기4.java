package day07;

public class 함수만나기4 {
	public static void main(String[] args) {
		int[] result = 로또번호구하기();
		
		for(int i : result) {
			System.out.print(i+" ");
		}
	}
	
	/*
	 함수 : 
	 입력 : x
	 반환 : o
	 public static int 함수만들기4(){
	 	return 3;
	 }
	 */
	
	public static int[] 로또번호구하기() {
		int[] result = {8,12,20,41,32,28};
		return result;
	}
}
