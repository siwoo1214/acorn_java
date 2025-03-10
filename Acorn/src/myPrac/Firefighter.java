package myPrac;

import java.util.Scanner;

public class Firefighter implements people{
	String job;
	static Scanner sc = new Scanner(System.in);
	
	public Firefighter(String job) {
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
		Firefighter f = new Firefighter("소방관");
		System.out.println(f.job+"은 무슨 일을 하나요?");
		String something = sc.next();		
		System.out.println(f.job+"은 어디서 자나요?");
		String where = sc.next();
		
		System.out.println(f.job+"은 "+f.work(something)+"을 하고 "+f.sleep(where)+"에서 잡니다.");
	}
}
