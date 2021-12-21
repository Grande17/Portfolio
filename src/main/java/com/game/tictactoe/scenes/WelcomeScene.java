package com.game.tictactoe.scenes;

import com.game.tictactoe.Main;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

public class WelcomeScene {
    private BorderPane borderPane;
    private Button button1;
    private Scene welcomeScene;
    private MenuBoard menuBoard = new MenuBoard();


    public Scene welcomeScene(){

        borderPane = new BorderPane();
        borderPane.setBackground(new Background(new BackgroundFill(Color.SADDLEBROWN,null,null)));
        button1 = new Button("Click to continue");
        button1.setPrefSize(600,600);
        button1.setAlignment(Pos.CENTER);
        borderPane.setCenter(button1);
        welcomeScene = new Scene(borderPane,800,800);
        button1.setOnAction(event -> Main.getStage().setScene(menuBoard.menu()));
        return welcomeScene;
    }

}
