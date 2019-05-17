package game;

/*
 * Create a class named GameObject that declares an update() method with a void return type. Place this in a
new package called, game. Create two other classes, Player and Enemy that both extend GameObject.
Place them in the same package as GameObject. Override the update() method for both Player and Enemy
to do print a message of your choice.
Create a fourth class, Game, in the game package. Write a main() method. In its main() method, create two
GameObjects that are a Player and an Enemy.
For example:
GameObject player = new Player();
Call the update() method on both objects. 
 */

public class Game {

	public static void main(String[] args) {
		
		GameObject Player = new Player();
		
		GameObject Enemy = new Enemy();
		
		Player.update();
		Enemy.update();

	}

}
