package 학생관리;

public class 학생관리프로그램1 {
	public static void main(String[] args) {
		//배열생성
		Student[] list = new Student[10];
		//0 1 2 3 4 5 6 7 8 9 모두 null로 채워져있음
		
		list[0]= new Student("임형택",100,89);
		list[1]= new Student("윤현기",88,96);
		list[2]= new Student("오윤석",92,97);
		list[3]= new Student("이동우",79,83);
		list[4]= new Student("권지언",90,93);
		list[5]= new Student("홍길동",59,79);
		
//		for(int i=0; i<6; i++) {
//			System.out.println(list[i].toString());
//		}
		
		for(int i=0; i<6; i++) {
			list[i].calc();
		}
		
		for(int i=0; i<6; i++) {
			System.out.println(list[i]);
		}
	}
}
