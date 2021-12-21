package com.game.tictactoe.scenes;

import com.game.tictactoe.Main;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class SetNumberOfGamesScene{
    private int numberOfGames = 0;
    public static GameBoard gameBoard = new GameBoard();


    public Scene numberOfGamesScene() {

        Text text = new Text("Set number of victories");
        Button button = new Button("Submit");
        TextField textField = new TextField();

        button.setOnAction(event -> {
            numberOfGames = Integer.parseInt(textField.getText());
            Main.getStage().setScene(gameBoard.gameBoardScene());
        });

        GridPane gridPane = new GridPane();
        gridPane.setMinSize(800,800);
        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(text,0,0);
        gridPane.add(textField,0,1);
        gridPane.add(button,0,3);


        Scene scene = new Scene(gridPane);

        return scene;
    }

    public int getNumberOfGames() {
        return numberOfGames;
    }

}
