package machine_coding_tictactoe.strategies.check_for_win;

import machine_coding_tictactoe.models.Board;
import machine_coding_tictactoe.models.Cell;
import machine_coding_tictactoe.models.Move;

public interface PlayerWonStrategy {
    public boolean checkForWin(Board board, Cell currentCell);
    public void handleUndo(Move move);
}
