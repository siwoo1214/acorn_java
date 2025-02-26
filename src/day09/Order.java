package day09;

class Shoppingmall {
	String order_number="201803120001";
	String user_ID="abc123";
	String order_date="2018년3월12일";
	String user_name="홍길순";
	String object_num="D0345-12";
	String address="서울시 영등포구 여의도동 20번지";
	
	void print_order_number(){
		System.out.println("주문 번호 : "+order_number);
	}
	void print_user_ID(){
		System.out.println("주문자 아이디 : "+user_ID);
	}
	void print_order_date(){
		System.out.println("주문 날짜 : "+order_date);
	}
	void print_user_name(){
		System.out.println("주문자 이름 : "+user_name);
	}
	void print_object_num(){
		System.out.println("주문 상품 번호 : "+object_num);
	}
	void print_address(){
		System.out.println("배송주소 : "+address);
	}
}

public class Order{
	public static void main(String[] args) {
		Shoppingmall sm = new Shoppingmall ();
		sm.print_order_number();
		sm.print_user_ID();
		sm.print_order_date();
		sm.print_user_name();
		sm.print_object_num();
		sm.print_address();
	}
	
	
}
