package com.example.lesson4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    public TextArea textArea;
    @FXML
    public TextField textField;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }


    @FXML
    public void clickBtn1(ActionEvent actionEvent) {
        textArea.appendText(textField.getText()+"\n");
        textField.clear();
        textField.requestFocus();
    }
}