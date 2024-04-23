import java.util.List;

public class Game {
    Board board;
    List<Player> listOfPlayers;
    Player winner;
    List<Move> moves;
    GameState gameState;
    Move nextPlayerMoveIndex;
}