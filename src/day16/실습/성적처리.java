package day16.실습;

public class 성적처리 {
	public void ageDetermination(int age) {
		if(age<0 || age>150) {
			throw new 나이예외("올바르지 않은 나이입니다.");
		}
	}
}
