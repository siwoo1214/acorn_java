package day15.정렬;

public class Beverage_박시우 extends AcornStudent{
	@Override
	public void 음료마시기() {
		System.out.println("저는 라떼로 하겠습니다!");
	}
	
	public static void main(String[] args) {
		AcornStudent bev = new Beverage_박시우();
		bev.음료마시기();
	}
}
