
public class Board {
    public String[] board;

    public void printBoard () {
		System.out.println("/---|---|---\\");
		System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("\\---|---|---/");
    }

    public void InitEmptyBoard () {
        board = new String[9];
        for (int i = 0; i < 9; i ++) {
            board[i] = String.valueOf(i+1);
        }
    }
    public void playChess (int position, String chess){
        board[position] = chess;
        printBoard();
    }

    public void printInstructions() {
        System.out.println("\nHello, This is my first Tic-Tac-Toe, where I took reference with some similar game templates online. \nIt requires 2 players, each has a representing chess piece, 'O' and 'X'. \nEach player will take turn and enter a slot number (1-9) to put your chess into the playboard. \nWhenever a player scores three of his chess in a row, no matter vertically, horizontally and diagonally, the player wins!\n");
    }
}