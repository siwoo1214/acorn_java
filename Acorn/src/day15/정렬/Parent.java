package day15.정렬;

public abstract class Parent {
	String name;
	
	public Parent(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println("엄마가 밥먹으라고 하시네요");
	}
	
	public void info() {
		System.out.println(name);
	}
	
	abstract void test();
}
