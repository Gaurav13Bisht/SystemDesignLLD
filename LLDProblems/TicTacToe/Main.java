package LLDProblems.TicTacToe;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe Game !!!!!!!!");
//        System.out.println("Enter number of players: ");
        System.out.println("Enter size of board: ");

        Scanner scn = new Scanner(System.in);
        final int boardSize = scn.nextInt();
//        final int numberOfPlayers = scn.nextInt();

        // Assign the piece size and add to the queue
        Queue<Player> players = new ArrayDeque<>();
//        for(int i = 0; i < numberOfPlayers; i++){
        players.add(new Player("Gaurav", new Piece(PieceType.X)));
        players.add(new Player("Harsh", new Piece(PieceType.O)));
//        }

        // Create Board
        final Board board = new Board(boardSize);
        play(board, players);
    }

    public static void play(Board board, Queue<Player> players) {
        Scanner scn = new Scanner(System.in);
        int remainingSpots = board.getSize() * board.getSize();
        Piece[][] playingBoard = board.getPlayingBoard();
        while (remainingSpots > 0) {
            for(int i = 0; i < board.getSize(); i++){
                for(int j = 0; j < board.getSize(); j++){
                    System.out.print((playingBoard[i][j] == null ? " " : playingBoard[i][j].getPieceType()) + " | ");
                }
                System.out.println();
            }

            Player player = players.peek();
            System.out.println(player.getName() + " (" + player.getPiece().getPieceType() + ")" + " please enter the row and col separated by 1 space: ");
            int row = scn.nextInt();
            int col = scn.nextInt();

            if(row < 0 || row >= board.getSize() || col < 0 || col >= board.getSize()){
                System.out.println("Please enter valid 0-index based row and col !!!");
            }
            else if (playingBoard[row][col] != null) {
                System.out.println("Spot already filled, Try Again !!!!");
            } else {
                playingBoard[row][col] = player.getPiece();
                if(checkIfWon(playingBoard, row, col)){
                    System.out.println(player.getName() + " has won the game !!");
                    break;
                }
                else{
                    players.poll();
                    players.add(player);
                }
                remainingSpots--;
            }

            if(remainingSpots == 0){
                System.out.println("DRAW !!!");
            }
        }
    }



    private static boolean checkIfWon(Piece[][] playingBoard, int row, int col) {
        Piece latestPiece = playingBoard[row][col];

        // Check for col
        for (int i = 0; i < playingBoard.length; i++) {
            if (playingBoard[i][col] == null || playingBoard[i][col].getPieceType() != latestPiece.getPieceType()) {
                break;
            }
            else if(i == playingBoard.length - 1){
                return true;
            }
        }

        // Check for row
        for (int j = 0; j < playingBoard[0].length; j++) {
            if (playingBoard[row][j] == null || playingBoard[row][j].getPieceType() != latestPiece.getPieceType()) {
                break;
            }
            else if(j == playingBoard[0].length - 1){
                return true;
            }
        }

        // Check for LR diagonal
        for (int d = 0; d < playingBoard[0].length; d++) {
            if (playingBoard[d][d] == null || playingBoard[d][d].getPieceType() != latestPiece.getPieceType()) {
                break;
            }
            else if(d == playingBoard[0].length - 1){
                return true;
            }
        }

        // Check for RL diagonal
        for (int d = playingBoard[0].length - 1; d >= 0; d--) {
            if (playingBoard[d][d] == null || playingBoard[d][d].getPieceType() != latestPiece.getPieceType()) {
                break;
            }
            else if(d == playingBoard[0].length - 1){
                return true;
            }
        }

        return false;
    }
}
