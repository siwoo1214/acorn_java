package myPrac;

import java.util.Scanner;

public class Developer implements people{
	String job;
	static Scanner sc = new Scanner(System.in);
	
	public Developer(String job) {
		this.job=job;
	}
	
	@Override
	public String work(String something) {
		// TODO Auto-generated method stub
		return something;
	}

	@Override
	public String sleep(String where) {
		// TODO Auto-generated method stub
		return where;
	}
	
	public static void main(String[] args) {
		Developer d = new Developer("개발자");
		System.out.println(d.job+"은 무슨 일을 하나요?");
		String something = sc.next();		
		System.out.println(d.job+"은 어디서 자나요?");
		String where = sc.next();
		
		System.out.println(d.job+"은 "+d.work(something)+"을 하고 "+d.sleep(where)+"에서 잡니다.");
	}
}
