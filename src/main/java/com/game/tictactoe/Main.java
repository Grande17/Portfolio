package com.game.tictactoe;


import com.game.tictactoe.scenes.WelcomeScene;
import javafx.application.Application;
import javafx.stage.Stage;




public class Main extends Application {
    private static Stage stage;
    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        WelcomeScene welcomeScene = new WelcomeScene();
        stage = primaryStage;
        primaryStage.setTitle("Welcome Board");
        primaryStage.setScene(welcomeScene.welcomeScene());
        primaryStage.show();
    }

    public static Stage getStage(){
        return stage;

    }
}