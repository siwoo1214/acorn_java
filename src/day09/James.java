package day09;

public class James {
	String name = "Lebron james";
	int age = 40;
	boolean marriage = true;
	int childs = 4;
	
	public void agePrint() {
		System.out.println("james씨의 나이는 "+age+"세 입니다");
	}
	
	public void namePrint() {
		System.out.println("james씨의 풀네임은 "+name+"입니다");
	}
	
	public void isMarried() {
		if(this.marriage) System.out.println("james씨는 기혼입니다");
		else System.out.println("james씨는 미혼입니다");
	}
	
	public void hasChild() {
		System.out.println("james씨는 "+childs+"명의 자녀가 있습니다");
	}
}
