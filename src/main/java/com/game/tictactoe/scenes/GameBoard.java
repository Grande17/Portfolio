package com.game.tictactoe.scenes;

import com.game.tictactoe.controller.ResultCheck;
import com.game.tictactoe.controller.Controller;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;





public class GameBoard extends ActionEvent {
    private Button[] buttons;
    private Label label;
    public static Controller controller = new Controller();


    public Scene gameBoardScene() {
        ResultCheck resultCheck = Controller.resultCheck;

        GridPane gridPane = new GridPane();
        gridPane.setPrefWidth(800);
        gridPane.setPrefHeight(800);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setBackground(new Background(new BackgroundFill(Color.SILVER, null, null)));

        BorderPane borderPane = new BorderPane();
        borderPane.setPrefSize(800, 800);
        borderPane.setBackground(new Background(new BackgroundFill(Color.BLUE, null, null)));
        borderPane.setCenter(gridPane);


        Label pw = new Label("Player won: " + resultCheck.getPlayerWon());
        pw.setPrefSize(200, 200);
        pw.setAlignment(Pos.CENTER);
        pw.setBackground(new Background(new BackgroundFill(Color.WHITE, null, null)));
        pw.setFont(new Font(20));

        Label cw = new Label("Computer won: " + resultCheck.getCompWon());
        cw.setPrefSize(200, 200);
        cw.setAlignment(Pos.CENTER);
        cw.setBackground(new Background(new BackgroundFill(Color.WHITE, null, null)));
        cw.setFont(new Font(20));

        borderPane.setLeft(pw);
        borderPane.setRight(cw);

        label = new Label();

        label.setText("Hello in my TicTacToe");
        label.setFont(Font.font("Helvetica", 30));
        label.setAlignment(Pos.CENTER);
        label.setBackground(new Background(new BackgroundFill(Color.RED, null, null)));
        label.setPrefSize(800, 150);
        borderPane.setTop(label);

        Scene scene = new Scene(borderPane, 800, 800);


        buttons = new Button[9];
        for (int a = 0; a < 9; a++) {
            buttons[a] = new Button();
            buttons[a].setPrefSize(125, 125);
            buttons[a].setFont(Font.font(40));
            buttons[a].setOnAction(controller::buttonsHandler);
            buttons[a].setTextFill(Color.BLACK);
        }
        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gridPane.add(buttons[index], j, i);
                index++;
            }
        }
        return scene;
    }

    public Label getLabel() {
        return label;
    }

    public Button[] getButtons() {
        return buttons;
    }
}





