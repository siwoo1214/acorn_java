package day15.정렬;

public class Child extends Parent implements Uncle{
	public int age;
	
	public Child(String name, int age) {
		super(name);
		this.age = age;
	}
	
	public void speak() {
		System.out.println("아들이 곧 나간다고 말하네요");
	}
	
	public void info() {
		System.out.println(name+" "+age);
	}

	@Override
	void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void workout() {
		// TODO Auto-generated method stub
		System.out.println("ok");
	}
	
	
}
