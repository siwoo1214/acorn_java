package day16.prac.exception;


//Exception을 상속받으면 => checked Exception (구현하는 코드에서 반드시 try-catch 문을 사용해줘야한다)
//RuntimeException을 상속받으면 => Unchecked Exception
public class 음수예외 extends Exception{
	
	//생성자
	public 음수예외() {
		
	}
	
	//매개변수 있는 생성자
	public 음수예외(String message) {
		super(message);
	}
	
	
}
