package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;


public class LoginPageController implements Initializable {

    @FXML
    private Label msgLabel;

    @FXML
    private TextField usernameTextField, passwordTextField;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        msgLabel.setText("Hello World!");

        String username = usernameTextField.getText();
        String password = passwordTextField.getText();

        if (username.equals("javafx") && password.equals("letmepass")) {
            msgLabel.setText("You shall pass!");
        } else {
            msgLabel.setText("You shall not pass");

        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
