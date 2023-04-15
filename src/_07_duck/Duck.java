package _07_duck;

public class Duck {
	int numberOfFriends;
	String favoriteFood;
	Duck(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	   	
	}
	void quack() {
		System.out.println("your monkey goes quack quack with "+numberOfFriends+ " other ducks for some "+favoriteFood);
	}
	void waddle() {
		System.out.println("You duck goes to waddle out with his "+numberOfFriends+ " other friends");
	}
}
