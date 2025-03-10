package day15.test;

public class Item {
	String name;
	int price;

	public Item(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "name=" + name + ", price=" + price;
	}

}

class test {
	public static void main(String[] args) {
		Item[] i = new Item[] { new Item("가가가", 13213), new Item("나나나", 1111) };
	}
}