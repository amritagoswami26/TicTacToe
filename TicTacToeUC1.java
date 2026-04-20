public class TicTacToeUC1{

    public static void main(String[] args) {

        // Step 1: Create a 3x3 character array
        char[][] board = new char[3][3];

        // Step 2: Initialize all cells with '-'
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        // Step 3: Print the board
        printBoard(board);
    }

    // Method to print the board clearly
    public static void printBoard(char[][] board) {
        System.out.println("Tic-Tac-Toe Board:\n");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println(); // move to next line after each row
        }
    }
}