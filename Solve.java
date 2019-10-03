import com.chess.impl.Chess;
import com.chess.IChess;

public class Solve {
    public static void main(String[] args) {
        IChess chess = new Chess();
        chess.evaluate(3, 4, "King");
    }
}
