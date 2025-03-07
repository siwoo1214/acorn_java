package day10;

public class 객체배열 {
	public static void main(String[] args) {
		Customer c = new Customer("강해린",20);
		// c : Customer객체라고 함
		// C : 참조형 변수(주소를 기억하는 변수)
		// new : 메모리 공간 확보, 메모리의 주소를 반환함
		// 참조형변수의 기본값 : null (나 아직 아무것도 참조하고 있지 않아)
		// 참조형 변수가 배열로 만들어지면 기본값으로 초기화가 된다 (배열의 요소가 모두 null이다)
		Customer c2 = new Customer("유재석",46);
		Customer c3= new Customer("카리나",26);
		
		// 객체배열 선언
		// 주의사항 !! : 객체배열은 선언하면 객체가 3개 만들어진 것이 아니라
		// 3개 객체의 주소를 저장할 수 있는 참조형 변수가 배열로 만들어진 것이다
		Customer[] list = new Customer[3];  // c, c2, c3 변수 3개를 연속적으로 확보한 배열이 만들어진다
		
		
		//객체를 생성하고 참조형변수 (배열의 요소)에 저장한 다음 사용해야 한다
		list[0]= new Customer("강해린",20);
		list[1]=new Customer("유재석",46);
		list[2]=new Customer("카리나",26);
		
		list[0].printInfo();
		list[1].printInfo();
		list[2].printInfo();
		
		for(int i=0; i<list.length; i++) {
			Customer item = list[i];
			item.printInfo();
			
		}
		
		for(Customer i : list) {
			i.printInfo();
		}
		
	}
}
