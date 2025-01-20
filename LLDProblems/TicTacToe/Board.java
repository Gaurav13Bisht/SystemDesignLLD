package LLDProblems.TicTacToe;

public class Board {
    private int size;
    private Piece[][] playingBoard;

    public Board(int size){
        this.playingBoard = new Piece[size][size];
        this.size = size;
    }

    public Piece[][] getPlayingBoard() {
        return playingBoard;
    }

    public void setPlayingBoard(Piece[][] playingBoard) {
        this.playingBoard = playingBoard;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
