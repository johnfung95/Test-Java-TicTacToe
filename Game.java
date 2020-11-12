import java.util.InputMismatchException;
import java.util.Scanner;

class Game{
    static String turn;
    static Scanner in;
    static int numInput;

    public static void main(String[] args) {
        Board myBoard = new Board();
        in = new Scanner(System.in);
        turn = "O";

        myBoard.InitEmptyBoard();
        myBoard.printBoard();
        while (checkWinner(myBoard.board, turn)== false) {
            AskForInputs(myBoard.board, turn);
            myBoard.printBoard();
        }
    }

    static boolean checkWinner(String[] board, String turn) {
        String line = null;
        boolean winner = false;
        for (int i = 0;i < 8; i++){
            switch (i) {
                case 0:
                    line = board[0] + board[1] + board[2];
                    break;
                case 1:
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = board[2] + board[4] + board[6];
                    break;
            }
        }
        if (line.equals("XXX")) {
            turn = "X";
            winner = true;
        } else if (line.equals("OOO")) {
            turn = "O";
            winner = true;
        }
        return winner;
    }

    static String AskForInputs(String[] board, String turn) {
        try{
            numInput = in.nextInt();
            if (!(numInput > 0 && numInput <= 9)) {
                System.out.println("Invalid input, please re-enter integer values (between 1 - 9).");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input, please re-enter integer values (between 1 - 9).");
        } 
        if (board[numInput - 1].equals(String.valueOf(numInput))) {
            board[numInput - 1] = turn;
            if (turn.equals("X")) {
                turn = "O";
            } else {
                turn = "X";
            }
        } else {
            System.out.println("Invalid input, slot already taken, please enter another number.");
        }

        return turn;
    }
}