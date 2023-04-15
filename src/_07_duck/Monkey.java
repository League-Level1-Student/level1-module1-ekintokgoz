package _07_duck;

public class Monkey {
	int numberOfFriends;
	String favoriteFood;
	Monkey(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
}
	void eat() {
		System.out.println("Your monkey goes looking for " +favoriteFood+ "s with his " + numberOfFriends + " other friends.");
	}
	void swing() { 
	System.out.println("Your monkey goes swinging on the tree branches with " + numberOfFriends + " other monkey friends");
	}
}
