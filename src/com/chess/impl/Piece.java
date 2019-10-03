package src.com.chess.impl;

public class Piece {
    private int[][] directions = {{0,1}, {0,-1}, {1,0}, {1, 1}, {1, -1}, {-1, 0}, {-1, 1}, {-1, -1}};
    private int[] canMove;
    private int numOfMoves;

    public Piece(int[] canMove, int numOfMoves) {
        this.canMove = canMove;
        this.numOfMoves = numOfMoves;
    }

    public int[][] getDirections() {
        return directions;
    }

    public int[] getCanMove() {
        return canMove;
    }

    public int getNumOfMoves() {
        return numOfMoves;
    }

    public void setDirections(int[][] directions) {
        this.directions = directions;
    }

    public void setCanMove(int[] canMove) {
        this.canMove = canMove;
    }

    public void setNumOfMoves(int numOfMoves) {
        this.numOfMoves = numOfMoves;
    }
}