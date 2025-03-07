package day07;

public class CallByReference {
	public static void main(String[] args) {
		//        = 배열공간확보(메모리 확보) 하고 시작주소를 반환
		int[] arr = new int[] {7,8,9,10,12};
		//arr : 주소를 기억하는 변수가 필요하다.
		//주소를 저장하는 변수를 참조형변수라고 한다
		
		/*
		 call by reference라는게 value와 달리 값을 갖고오는게 아니라 변수에 저장된 메모리공간 즉 변수가 참조하고 있는 형태이면
		 reference라고 부르고 진짜 그 주소를 갖고온다 따라서 값을 바꾸면 주소를 갖고와서 값을 바꾸기 때문에 실제로 그 값이 바뀐다
		 ※똑같은 곳을 참조하고 있기 때문에!
		 */
		
		//배열 출력하기
		printArray(arr);
	}
	
	//배열 출력하는 함수 만들기
	//함수명 : printArray
	//기능 : 배열을 출력하기
	//입력 : int[] 배열
	//반환 : X
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
