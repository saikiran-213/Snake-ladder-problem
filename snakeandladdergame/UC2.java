package snakeandladdergame;

public class UC2 {

	/*
	 * The Player rolls the die to get a number between 1 to 6.
	 */
	public static void main(String[] args) {
		
		int die = (int) (Math.random() * 6 + 1);
		System.out.println("Diece number is:" + die);
	}

}
