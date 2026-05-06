import java.util.Scanner;

public class TicTacToeUC8{

    static boolean isHumanTurn = true;
    static boolean gameOver = false;
    static char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Tic Tac Toe!");

        while (!gameOver) {
            printBoard();

            if (isHumanTurn) {
                System.out.println("Your turn (X). Enter row and column (0-2): ");
                int row = sc.nextInt();
                int col = sc.nextInt();

                if (isValidMove(row, col)) {
                    board[row][col] = 'X';
                    isHumanTurn = false;
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            } else {
                System.out.println("Computer's turn (O)");
                computerMove();
                isHumanTurn = true;
            }

            checkGameStatus();
        }

        printBoard();
        sc.close();
    }

    static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

    static void computerMove() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    board[i][j] = 'O';
                    return;
                }
            }
        }
    }

    static void checkGameStatus() {
        if (checkWin('X')) {
            System.out.println("You win!");
            gameOver = true;
        } else if (checkWin('O')) {
            System.out.println("Computer wins!");
            gameOver = true;
        } else if (isBoardFull()) {
            System.out.println("It's a draw!");
            gameOver = true;
        }
    }

    static boolean checkWin(char player) {
        // Rows & Columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }

        // Diagonals
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
            (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }

        return false;
    }

    static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}