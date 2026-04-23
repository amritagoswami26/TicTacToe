import java.util.Random;

public class TicTacToeUC7{

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    static char computerSymbol = 'O';

    public static void main(String[] args) {
        computerMove();
    }

    static void computerMove() {
        Random rand = new Random();
        int row, col;

        while (true) {
            row = rand.nextInt(3);
            col = rand.nextInt(3);

            if (board[row][col] == '-') {
                board[row][col] = computerSymbol;
                break;
            }
        }

        System.out.println("Computer placed at: " + row + ", " + col);
    }
}