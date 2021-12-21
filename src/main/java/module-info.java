module com.game.tictactoe {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.game.tictactoe to javafx.fxml;
    exports com.game.tictactoe;
    exports com.game.tictactoe.scenes;
    opens com.game.tictactoe.scenes to javafx.fxml;
    exports com.game.tictactoe.controller;
    opens com.game.tictactoe.controller to javafx.fxml;
}