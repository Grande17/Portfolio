package com.game.tictactoe.controller;

import com.game.tictactoe.Main;
import com.game.tictactoe.scenes.GameBoard;
import com.game.tictactoe.scenes.MenuBoard;
import com.game.tictactoe.scenes.SetNumberOfGamesScene;
import javafx.animation.PauseTransition;
import javafx.util.Duration;

public class Restart {



    public void resetButtons(){
        if (MenuBoard.setNumber.getNumberOfGames() != Controller.resultCheck.getCompWon() &&
        MenuBoard.setNumber.getNumberOfGames() != Controller.resultCheck.getPlayerWon()) {
            Controller controller = GameBoard.controller;
            ResultCheck resultCheck = Controller.resultCheck;
            PauseTransition pause = new PauseTransition(Duration.seconds(2));
            pause.setOnFinished(event -> {
                Main.getStage().setScene(SetNumberOfGamesScene.gameBoard.gameBoardScene());
                controller.setButtonsNumber(9);
                resultCheck.setResultNull();
            });

            pause.play();
        }else {
            return;
        }
    }
}
