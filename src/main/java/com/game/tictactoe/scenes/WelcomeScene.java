package com.game.tictactoe.scenes;

import com.game.tictactoe.Main;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class WelcomeScene {
    private BorderPane borderPane;
    private Button button1;
    private Scene welcomeScene;
    private MenuBoard menuBoard = new MenuBoard();


    public Scene welcomeScene(){
        Image image = new Image("com/game/tictactoe/image.png");
        BackgroundImage bImg = new BackgroundImage(image,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(1.0,1.0,true,true,false,false));
        Background bGround = new Background(bImg);


        borderPane = new BorderPane();
        borderPane.setBackground(bGround);
        button1 = new Button("Click to continue");
        button1.setPrefSize(150,100);
        button1.setAlignment(Pos.CENTER);
        borderPane.setCenter(button1);
        welcomeScene = new Scene(borderPane,800,800);
        button1.setOnAction(event -> Main.getStage().setScene(menuBoard.menu()));
        return welcomeScene;
    }

}
