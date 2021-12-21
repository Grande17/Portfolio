package com.game.tictactoe.controller;

import com.game.tictactoe.Main;
import com.game.tictactoe.scenes.Alerts;
import com.game.tictactoe.scenes.GameBoard;
import com.game.tictactoe.scenes.MenuBoard;
import com.game.tictactoe.scenes.SetNumberOfGamesScene;
import javafx.event.ActionEvent;

public class Controller extends ActionEvent{
    private int buttonsNumber = 9;
    public static ResultCheck resultCheck = new ResultCheck();


    public void buttonsHandler(ActionEvent event){
        Alerts alerts = new Alerts();
        GameBoard gameBoard = SetNumberOfGamesScene.gameBoard;
        SetNumberOfGamesScene setNumberOfGamesScene = MenuBoard.setNumber;
        Computer computer = new Computer();

        for (int i=0; i<9; i++){
            if (event.getSource() == gameBoard.getButtons()[i]){
                if(!gameBoard.getButtons()[i].isDisable()){
                    gameBoard.getButtons()[i].setText(Features.X.toString());
                    gameBoard.getButtons()[i].setDisable(true);
                    buttonsNumber--;
                    resultCheck.whoWon();
                    gameBoard.getLabel().setText("O Turn");
                    if (resultCheck.getResult() != Result.WIN && resultCheck.getResult() != Result.LOSE){
                        if (buttonsNumber != 0 && buttonsNumber %2 ==0) {
                            computer.oTurn();
                            buttonsNumber--;
                            resultCheck.whoWon();
                        }
                    }
                    if(resultCheck.getPlayerWon() == setNumberOfGamesScene.getNumberOfGames()){
                        alerts.winAlert();
                    }
                    if (resultCheck.getCompWon() == setNumberOfGamesScene.getNumberOfGames()){
                        alerts.looseAlert();
                    }

                }
            }
        }
    }

    public void setButtonsNumber(int buttonsNumber) {
        this.buttonsNumber = buttonsNumber;
    }

    public int getButtonsNumber() {
        return buttonsNumber;
    }
}
