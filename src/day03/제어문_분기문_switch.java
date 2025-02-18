package day03;

public class 제어문_분기문_switch {
	public static void main(String[] args) {
		int code=1,price=0, time=10;
		
		switch(code) {
			case 1:
				price=1000;
				break;
			case 2:
				price=2000;
				break;
			case 3:
				price=3000;
				break;
			default:
				price=0;
		}
		
		int money=time*price;
		System.out.println(money);
	}
}
