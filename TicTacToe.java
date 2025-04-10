package lab13;
import java.util.Scanner;



public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = { {'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'} };
        Scanner input = new Scanner(System.in);
        char currentPlayer = 'X';
        boolean gameOn = true;

        // Game loop
        while (gameOn) {
            // Print the current state of the board
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }

            // Prompt the current player for input
            System.out.println("Player " + (currentPlayer == 'X' ? "one" : "two") + ": ");
            int row = input.nextInt() - 1; // adjust to 0-based index
            int col = input.nextInt() - 1; // adjust to 0-based index

            // Place the token if the cell is empty
            if (board[row][col] == '-') {
                board[row][col] = currentPlayer;

                // Check for a win or a draw
                boolean win = false;
                // Check rows and columns
                for (int i = 0; i < 3; i++) {
                    if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                        win = true;
                    }
                    if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                        win = true;
                    }
                }
                // Check diagonals
                if ((board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
                    (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)) {
                    win = true;
                }

                // Determine the game status
                if (win) {
                    // Print the final board
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(board[i][j] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println("Player " + (currentPlayer == 'X' ? "one" : "two") + " wins!");
                    gameOn = false;
                } else {
                    // Check if the board is full
                    boolean full = true;
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (board[i][j] == '-') {
                                full = false;
                                break;
                            }
                        }
                    }
                    if (full) {
                        // Print the final board
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 3; j++) {
                                System.out.print(board[i][j] + " ");
                            }
                            System.out.println();
                        }
                        System.out.println("It's a draw!");
                        gameOn = false;
                    } else {
                        // Continue the game
                        System.out.println("unfinished");
                        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                    }
                }
            } else {
                System.out.println("Cell already taken. Try again.");
            }
        }
        input.close();
    }
}
