package com.game.tictactoe.controller;

import com.game.tictactoe.scenes.GameBoard;
import com.game.tictactoe.scenes.SetNumberOfGamesScene;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;


import java.util.Random;

public class Computer extends ActionEvent {
    private GameBoard gb = SetNumberOfGamesScene.gameBoard;


    public Button getRandomButton(Button[] buttons){
        Random random = new Random();
        int f = random.nextInt(buttons.length);
        return buttons[f];
    }
    public void oTurn() {
        Button random;
        do {
            random = getRandomButton(gb.getButtons());
        } while (random.isDisable());
        random.setText(Features.O.toString());
        random.setDisable(true);
        gb.getLabel().setText("X Turn");
    }
}
