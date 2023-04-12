package snakeandladdergame;

public class UC1 {
      /*
       * Snake and Ladder game played with single player at start position 0.
       */
    public static void main(String[] args) {
        UC1 snakeAndLadderGame = new UC1();
        snakeAndLadderGame.snakeAndLadder();
    }

    public void snakeAndLadder() {
        Player sourabh = new Player();
        if(sourabh.getPostion() != 1) {
            System.out.println("Position = "+sourabh.getPostion());
        }
    }
}