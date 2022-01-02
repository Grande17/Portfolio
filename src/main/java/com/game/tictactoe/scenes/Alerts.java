package com.game.tictactoe.scenes;

import com.game.tictactoe.Main;
import com.game.tictactoe.controller.Controller;
import com.game.tictactoe.controller.ResultCheck;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;



public class Alerts {
    private ResultCheck resultCheck = Controller.resultCheck;
    private Controller controller = GameBoard.controller;
    private SetNumberOfGamesScene setNumberOfGamesScene = MenuBoard.setNumber;
    private GameBoard gameBoard = SetNumberOfGamesScene.gameBoard;

    public void winAlert(){
        Alert winAlert = new Alert(Alert.AlertType.NONE, "Congratulations, You won!");
        winAlert.setTitle("You won!");
        winAlert.setContentText("Do you want to play again?");
        winAlert.getButtonTypes().addAll(ButtonType.YES, ButtonType.NO);
        winAlert.showAndWait().ifPresent(buttonType ->{
            if(buttonType == ButtonType.YES){
                Main.getStage().setScene(MenuBoard.setNumber.numberOfGamesScene());
                resultCheck.setPlayerWon(0);
                resultCheck.setCompWon(0);
                resultCheck.setResultNull();
                controller.setButtonsNumber(9);
            }
            if(buttonType == ButtonType.NO){
                System.exit(0);
            }
        } );
    }

    public void looseAlert(){
        Alert looseAlert = new Alert(Alert.AlertType.NONE, "Unfortunately you LOST!");
        looseAlert.setTitle("You lost!");
        looseAlert.setContentText("Do you want to play again? ");
        looseAlert.getButtonTypes().addAll(ButtonType.YES, ButtonType.NO);
        looseAlert.showAndWait().ifPresent(buttonType ->{
            if(buttonType == ButtonType.YES){
                Main.getStage().setScene(MenuBoard.setNumber.numberOfGamesScene());
                resultCheck.setPlayerWon(0);
                resultCheck.setCompWon(0);
                resultCheck.setResultNull();
                controller.setButtonsNumber(9);
            }
            if(buttonType == ButtonType.NO){
                System.exit(0);
            }
        } );
    }

    public void launchAlert(){
        if (resultCheck.getPlayerWon() == setNumberOfGamesScene.getNumberOfGames()){
            gameBoard.getLabel().setText("You WON!");
            winAlert();
        }
        if (resultCheck.getCompWon() == setNumberOfGamesScene.getNumberOfGames()){
            gameBoard.getLabel().setText("You LOST!");
            looseAlert();;
        }
    }
}
