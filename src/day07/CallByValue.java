package day07;

public class CallByValue {
	public static void main(String[] args) {
		int num1=3,num2=4;
		
		int result = adder(num1,num2);
		System.out.println(result);
	}
	
	//call by value => 함수 호출시에 전달되는 값, 실제로 사용되는 데이터값 전달(내용값)
	//함수
	//더하는 기능
	//입력 : 정수 2개
	//반환 : 더한 값
	
	public static int adder(int num1, int num2) {
		return num1+num2;
	}
}
