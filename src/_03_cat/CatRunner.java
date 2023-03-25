package _03_cat;

public class CatRunner {
	public static void main(String[] args) {
		Cat cat = new Cat("molly");
		cat.meow();
		cat.printName();
		for(int i = 0; i<10; i++) {
		cat.kill();
		}
	}
}
