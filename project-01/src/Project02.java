import java.util.Random;

public class Project02 {
    static final int NUM_OF_SHUFFLE_MOVES = 3;
    static Random rnd = new Random();
    static  int[][] gameBoard = new int[4][4];
    static int emptyRow;
    static int emptyColumn;
    public static void main(String[] args) {
        initBoard();
        shuffleBoard();
        printBoard();

    }

    private static void shuffleBoard() {
        int nMove = 0;
        while(nMove < NUM_OF_SHUFFLE_MOVES) {
            int dir = rnd.nextInt(4);
            int dr = 0;
            int dc = 0;
            switch(dir){
                case 0:
                    dr = -1;
                    break;
                case 1:
                    dc = 1;
                    break;
                case 2:
                    dr = 1;
                    break;
                case 3:
                    dc = -1;
                    break;
            }
            if (0 <= emptyRow+dr && emptyRow + dr < 4 && emptyColumn + dc >= 0 && emptyColumn + dc < 4) {
                gameBoard[emptyRow][emptyColumn] = gameBoard[emptyRow + dr][emptyColumn + dc];
                emptyRow += dr;
                emptyColumn += dc;
                gameBoard[emptyRow][emptyColumn] = 16;

                nMove++;
            }
        }
    }

    private static void initBoard() {
        int currentV = 1;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                gameBoard[row][col] = currentV;
                currentV++;
            }
        }
        emptyRow = 3;
        emptyColumn = 3;
    }

    private static void printBoard(){
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                if (gameBoard[row][col] != 16) {
                    System.out.printf("%3d", gameBoard[row][col]);
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
