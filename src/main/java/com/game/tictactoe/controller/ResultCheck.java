package com.game.tictactoe.controller;

import com.game.tictactoe.scenes.GameBoard;
import com.game.tictactoe.scenes.SetNumberOfGamesScene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;

public class ResultCheck{
    GameBoard gb = SetNumberOfGamesScene.gameBoard;
    private Restart restart = new Restart();
    private Result result;
    private int playerWon = 0;
    private int compWon = 0;

    public Result getResult(int a, int b, int c){
        if(gb.getButtons()[a].getText().equals(Features.X.toString()) &&
                gb.getButtons()[b].getText().equals(Features.X.toString()) &&
                gb.getButtons()[c].getText().equals(Features.X.toString())){
            gb.getButtons()[a].setBackground(new Background(new BackgroundFill(Color.GOLD,null,null)));
            gb.getButtons()[b].setBackground(new Background(new BackgroundFill(Color.GOLD,null,null)));
            gb.getButtons()[c].setBackground(new Background(new BackgroundFill(Color.GOLD,null,null)));
            result = Result.WIN;
        }if (gb.getButtons()[a].getText().equals(Features.O.toString()) &&
                gb.getButtons()[b].getText().equals(Features.O.toString()) &&
                gb.getButtons()[c].getText().equals(Features.O.toString())) {
            gb.getButtons()[a].setBackground(new Background(new BackgroundFill(Color.RED,null,null)));
            gb.getButtons()[b].setBackground(new Background(new BackgroundFill(Color.RED,null,null)));
            gb.getButtons()[c].setBackground(new Background(new BackgroundFill(Color.RED,null,null)));
            result = Result.LOSE;
        }
        return  result;
    }

    public void whoWon(){
        Controller controller = GameBoard.controller;
        if (getResult(0,1,2) == Result.WIN ||
                getResult(3,4,5) == Result.WIN ||
                getResult(6,7,8) == Result.WIN ||
                getResult(0,3,6) == Result.WIN ||
                getResult(1,4,7) == Result.WIN ||
                getResult(2,5,8) == Result.WIN ||
                getResult(0,4,8) == Result.WIN ||
                getResult(2,4,6) == Result.WIN){
            playerWon++;
            restart.resetButtons();

        }
        if (getResult(0,1,2) == Result.LOSE ||
                getResult(3,4,5) == Result.LOSE ||
                getResult(6,7,8) == Result.LOSE ||
                getResult(0,3,6) == Result.LOSE ||
                getResult(1,4,7) == Result.LOSE ||
                getResult(2,5,8) == Result.LOSE ||
                getResult(0,4,8) == Result.LOSE ||
                getResult(2,4,6) == Result.LOSE){
            compWon++;
            restart.resetButtons();
        }
        if (controller.getButtonsNumber() == 0){
            restart.resetButtons();

        }

    }

    public int getPlayerWon() {
        return playerWon;
    }

    public int getCompWon() {
        return compWon;
    }

    public Result getResult() {
        return result;
    }

    public void setResultNull(){
        this.result = null;
    }

    public void setPlayerWon(int playerWon) {
        this.playerWon = playerWon;
    }

    public void setCompWon(int compWon) {
        this.compWon = compWon;
    }
}

