
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
}