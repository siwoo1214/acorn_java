package day16.실습;

import java.io.Serializable;

public class 학생성적 implements Serializable{
	String name;
	int age;
	int kor;
	int math;
	int eng;
	double avg;
	char grade;
	boolean scholarship;
	
	public 학생성적() {
		super();
	}

	public 학생성적(String name,int age, int kor, int math, int eng) {
		super();
		this.name = name;
		this.age=age;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		setInfo();
		ageDetermination(age);
	}
	
	public void ageDetermination(int age) {
		if(age<0 || age>150) {
			throw new 나이예외(name+"님의 나이는 올바르지 않은 나이입니다.");
		}
	}
	
	private void calcAvg() {
		avg=(kor+math+eng)/3.0;
	}
	
	private void isScholar() {
		if(avg>90) {
			scholarship=true;
		} else {
			scholarship=false;
		}
	}
	
	private void setInfo() {
		calcAvg();
		isScholar();
		
		if(avg>90) {
			grade='A';
		}else if(avg>=80) {
			grade='B';
		}else if(avg>=70) {
			grade='C';
		}else if(avg>=60) {
			grade='D';
		}else {
			grade='F';
		}
	}

	@Override
	public String toString() {
		return "학생성적 [이름 = " + name + ", 나이 = " + age+", 평균 = " + avg + ", 학점 = " + grade + ", 장학금 여부 = " + scholarship + "]";
	}
	
	
}
