package snakeandladdergame;

public class UC6 {

	int snake[] = { 12, 46, 57, 78 };
    int ladder[] = { 13, 47, 58, 79 };

    public static void main(String[] args) {
        UC6 snakeAndLadderGame = new UC6();
        snakeAndLadderGame.snakeAndLadder();
    }

    public void snakeAndLadder() {
        Player sourabh = new Player();
        for ( int dieRoll=0;dieRoll < 28;dieRoll++){
          while(sourabh.getPostion() != 100) {
           System.out.println("Position = "+sourabh.getPostion());
           System.out.println("dierolled was:"+dieRoll);
	      player(sourabh);
	     break;
    }
          System.out.println("Position = "+sourabh.getPostion());
         
  }
}
        
    public void player(Player sourabh) {
        int position = sourabh.getPostion();
        int randomNum = getRandomNumber(6);
        while (randomNum == 6 && position <= 94) {
            position += randomNum;

            if (isSnake(position)) {
                position -= 5;
                break;
            } else if (isLadder(position)) {
                position += 5;
                randomNum = getRandomNumber(6);
            } else {
                randomNum = getRandomNumber(6);
            }
        }

        if ((position <= 95 && randomNum == 5) || (position <= 96 && randomNum == 4)
                || (position <= 97 && randomNum == 3) || (position <= 98 && randomNum == 2)
                || (position <= 99 && randomNum == 1)) {
            position += randomNum;
            if (isSnake(position)) {
                position -= 5;
            } else if (isLadder(position) && position + 5 <= 100) {
                position += 5;
                randomNum = getRandomNumber(6);
            }
        }

        sourabh.setPostion(position);

    }

    public boolean isSnake(int position) {
        for (int i = 0; i < snake.length; i++) {
            if (position == snake[i]) {
                return true;
            }
        }
        return false;
    }

    public boolean isLadder(int position) {
        for (int i = 0; i < ladder.length; i++) {
            if (position == ladder[i]) {
                return true;
            }
        }
        return false;
    }

    public int getRandomNumber(int value) {
        return (int) Math.floor(Math.random() * value + 1);
    }
}