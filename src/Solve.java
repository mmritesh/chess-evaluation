package src;

import src.com.chess.impl.Chess;
import src.com.chess.IChess;

public class Solve {
    public static void main(String[] args) {
        IChess chess = new Chess();
        chess.evaluate(3, 4, "King");
    }
}
