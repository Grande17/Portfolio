package com.game.tictactoe.scenes;


import com.game.tictactoe.Main;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class MenuBoard {
    public static  GameBoard gameBoard = new GameBoard();
    public static SetNumberOfGamesScene setNumber = new SetNumberOfGamesScene();


    public Scene menu(){
        BorderPane borderPane = new BorderPane();
        borderPane.setPrefSize(800,800);
        borderPane.setBackground(new Background(new BackgroundFill(Color.LIGHTYELLOW,null,null)));

        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        hBox.setSpacing(20);
        hBox.setStyle("-fx-background-color: #336699;");

        Button start = new Button("Start");
        start.setPrefSize(120,50);
        start.setOnAction(event -> Main.getStage().setScene(setNumber.numberOfGamesScene()));

        Button exit = new Button("Exit");
        exit.setPrefSize(120,50);
        exit.setOnAction(event -> System.exit(0));

        hBox.getChildren().addAll(start,exit);

        borderPane.setCenter(hBox);
        Scene scene = new Scene(borderPane);

        return scene;

    }
}
