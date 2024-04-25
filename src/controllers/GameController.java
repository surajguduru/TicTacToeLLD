package controllers;
import exceptions.InvalidMoveException;
import models.*;
import java.util.List;

public class GameController {
    public Game startGame(int size, List<Player> players) {
        //Validate if two/more players have the same symbol
        // If yes, throw a custom exception
        return new Game(size, players);
    }

    public void makeMove(Game game) throws InvalidMoveException{
        game.makeMove();
    }

    public GameState checkState(Game game)  {
        return game.getGameState();
    }

    public void printBoard(Game game){
        game.printBoard();
    }

    public Player getWinner(Game game){
        return game.getWinner();
    }

}
