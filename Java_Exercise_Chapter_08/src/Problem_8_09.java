import java.util.Scanner;

public class Problem_8_09 {

    public static void main(String[] args) {
        playTicTacToe();
    }

    public static boolean hasWinner(int[][] board) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] != 0 && board[i][0] == board[i][1] && board[i][1] == board[i][2]) ||
                    (board[0][i] != 0 && board[0][i] == board[1][i] && board[1][i] == board[2][i])) {
                return true;
            }
        }
        return board[1][1] != 0 && ((board[0][0] == board[1][1] && board[1][1] == board[2][2]) ||
                board[0][2] == board[1][1] && board[1][1] == board[2][0]);
    }

    public static boolean hasNextPlay(int[][] board) {
        if (hasWinner(board)) return false;
        for (int[] aBoard : board) {
            for (int anABoard : aBoard) {
                if (anABoard == 0) return true;
            }
        }
        return false;
    }

    public static void printBoard(int[][] board) {
        System.out.println("-------------");
        for (int[] aBoard : board) {
            System.out.print("|");
            for (int anABoard : aBoard) {
                System.out.print(" ");
                if (anABoard == -1) System.out.print("O");
                if (anABoard == 0) System.out.print(" ");
                if (anABoard == 1) System.out.print("X");
                System.out.print(" |");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public static void playTicTacToe() {
        int[][] board = new int[3][3];
        int player = -1;
        char token;
        do {
            player = -player;
            token = player == 1 ? 'X' : 'O';
            printBoard(board);

            boolean isValidMove;
            do {
                isValidMove = true;
                int[] location = getPlayLocation(token);
                if (board[location[0]][location[1]] == 0) {
                    board[location[0]][location[1]] = player;
                } else {
                    System.out.println("Invalid play. That location has already been played");
                    isValidMove = false;
                }
            } while (!isValidMove);
        } while(hasNextPlay(board));
        printBoard(board);
        if (hasWinner(board)) {
            System.out.println(token + " player won");
        } else {
            System.out.println("It's a draw");
        }
    }

    public static int[] getPlayLocation(char token){
        Scanner scanner = new Scanner(System.in);
        int[] location = new int[2];
        System.out.print("Enter a row (0, 1, or 2) for player " + token + ": ");
        location[0] = scanner.nextInt();
        System.out.print("Enter a column (0, 1, or 2) for player " + token + ": ");
        location[1] = scanner.nextInt();
        return location;
    }

}
