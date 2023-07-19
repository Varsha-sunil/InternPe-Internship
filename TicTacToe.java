import java.util.Scanner;

public class TicTacToe {

    private char[][] board;
    private char currentPlayer;
    private boolean gameWon;

    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';
        gameWon = false;
        initializeBoard();
    }

    public void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isWinner() {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true;
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] != '-' && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return true;
        }

        if (board[0][2] != '-' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return true;
        }

        return false;
    }

    public void changePlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }

    public boolean makeMove(int row, int col) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
            board[row][col] = currentPlayer;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        Scanner scanner = new Scanner(System.in);
        int row, col;

        while (!game.isBoardFull() && !game.isWinner()) {
            System.out.println("Current board:");
            game.printBoard();
            System.out.println("Player " + game.currentPlayer + ", enter your move (row [0-2] and column [0-2]):");

            while (true) {
                row = scanner.nextInt();
                col = scanner.nextInt();
                if (game.makeMove(row, col)) {
                    break;
                } else {
                    System.out.println("Invalid move! Try again.");
                }
            }

            game.changePlayer();
        }

        System.out.println("Final board:");
        game.printBoard();

        if (game.isWinner()) {
            System.out.println("Player " + game.currentPlayer + " wins!");
        } else {
            System.out.println("It's a tie!");
        }

        scanner.close();
    }
}
