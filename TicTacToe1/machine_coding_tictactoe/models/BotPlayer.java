package machine_coding_tictactoe.models;

import machine_coding_tictactoe.factories.BotPlayingStrategyFactory;
import machine_coding_tictactoe.strategies.bot_playing.BotPlayingStrategy;
import machine_coding_tictactoe.strategies.bot_playing.EasyBotPlayingStrategy;

public class BotPlayer extends Player{
    private BotLevel botLevel;
    private BotPlayingStrategy botPlayingStrategy;
    public BotPlayer(String name, Symbol s, BotLevel level) {
        super(name, s);
        this.botLevel=level;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy(botLevel);
    }

    @Override
    public Pair<Integer, Integer> makeMove(Board board) {
        return botPlayingStrategy.makeMove(board);
    }
}
