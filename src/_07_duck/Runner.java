package _07_duck;

public class Runner {
	public static void main(String[] args) {
		Monkey manny = new Monkey("banana",12);
		manny.eat();
		manny.swing();
		Duck donald = new Duck("bread", 2);
		donald.quack();
		donald.waddle();
	}
}
