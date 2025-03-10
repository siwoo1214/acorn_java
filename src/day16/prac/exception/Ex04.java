package day16.prac.exception;

public class Ex04 {
	public static void main(String[] args) {
		A a = new A();
		a.놀기();
		
		Object o = (Object)a; //업캐스팅, 자동형변환
		//o.놀기(); 는 사용할 수 없다 (Object로만 해석가능함) Object가 가지는 기능만 쓸 수 있다
		
		System.out.println(o.toString());
		
		B b = new B();
		Object o2 = b;
//		o2.공부하기(); 사용불가
		
		System.out.println(o2.toString());
		
		//올바른 다운캐스팅
		((B)o2).공부하기();
		
		//잘못된 다운캐스팅
		Object o3 = new Object();
		//이것이 잘못된 다운캐스팅이다
		((B)o3).공부하기();
		
		//올렸다가 내리는거는 다운캐스팅이 되는데 내리기만 하는거는 될 수 없음
		//근본적으로 태생이 다르기 때문에 메소드를 갖고있지 않아서 될 수가 없는것임
		
		
	}
}
