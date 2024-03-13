package machine_coding_tictactoe.exceptions;

public class InvalidGameStateException extends RuntimeException {
    public InvalidGameStateException(String s) {
        super(s);
    }
}
