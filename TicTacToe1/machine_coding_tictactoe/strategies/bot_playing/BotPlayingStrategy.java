package machine_coding_tictactoe.strategies.bot_playing;

import machine_coding_tictactoe.models.Board;
import machine_coding_tictactoe.models.Pair;

public interface BotPlayingStrategy {
    public Pair<Integer, Integer> makeMove(Board board);
}
