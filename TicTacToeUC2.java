import java.util.Random;

public class TicTacToeUC2{

    public static void main(String[] args) {

        // Game state variables
        char userSymbol;
        char computerSymbol;
        String currentPlayer;

        // Step 1: Random toss (0 or 1)
        Random random = new Random();
        int toss = random.nextInt(2);

        // Step 2: Decide who starts and assign symbols
        if (toss == 0) {
            currentPlayer = "User";
            userSymbol = 'X';
            computerSymbol = 'O';
        } else {
            currentPlayer = "Computer";
            userSymbol = 'O';
            computerSymbol = 'X';
        }

        // Step 3: Display results
        System.out.println("Toss Result:");
        System.out.println(currentPlayer + " will start first!");
        System.out.println("User Symbol: " + userSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }
}