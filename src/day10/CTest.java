package day10;

public class CTest {
	public static void main(String[] args) {
		C c = new C();
		//static이 아닌것은 반드시 객체생성을 한 다음에 사용할 수 있다
		//static은 객체생성과 무관하기 때문에 this를 먹지를 않는다
		int result = c.add(3, 5);
	}
}
