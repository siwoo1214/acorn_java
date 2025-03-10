package day15.정렬;

public class Testmain {
	public static void main(String[] args) {
		Child c = new Child("박시우",26);
		c.speak();
		c.info();
		
		Parent c1 = new Child("부모님",56);
		c1.speak();
		c1.info();
		
		Parent p = new Parent("부모님");
		p.speak();
		p.info();
	}
}
