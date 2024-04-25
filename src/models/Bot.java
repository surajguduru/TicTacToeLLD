package models;

import models.BotDifficultyLevel;
import models.Player;

import java.util.List;

public class Bot extends Player {
    BotDifficultyLevel botDifficultyLevel;

    public Bot(String name, Symbol symbol, PlayerType playerType, BotDifficultyLevel botDifficultyLevel) {
        super(name, symbol, playerType);
        this.botDifficultyLevel = botDifficultyLevel;
    }
    @Override
    public Move makeMove(Board board) {
        //Find the first empty cell and make the move there.
        for (List<Cell> row : board.getBoard()) {
            for (Cell cell : row) {
                if (cell.getCellState().equals(CellState.EMPTY)) {
                    return new Move(cell, this);
                }
            }
        }
        return null;
    }

}