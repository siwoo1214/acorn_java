package day09;

public class 학생정보프로그램5 {
	public static void main(String[] args) {
		Student4 s = new Student4();
		s.input("이정호", 100, 90);
		s.calc();
		s.printInfo();
		
		Student4 s2 = new Student4();
		s2.input("김민환", 99, 99);
		s2.calc();
		s2.printInfo();

		Student4 s3 = new Student4();
		s3.input("김유민", 99, 99);
		s3.calc();
		s3.printInfo();
		
		Student4 s4 = new Student4();
		s4.input("박수경", 99, 99);
		s4.calc();
		s4.printInfo();
		
		System.out.println("===============반복문으로 객체정보 출력하기================");
		
		Student4[] list = {s,s2,s3,s4};
		
		for(int i=0; i<list.length; i++) {
			list[i].printInfo();
		}
	}
}
