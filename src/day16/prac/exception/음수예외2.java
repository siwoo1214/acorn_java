package day16.prac.exception;


//unchecked exception을 만들고싶으면 
//runtime ecxeption을 상속받자
public class 음수예외2 extends RuntimeException{
	
	//생성자
	public 음수예외2() {
		
	}
	
	//매개변수 있는 생성자
	public 음수예외2(String message) {
		super(message);
	}
	
	
}
