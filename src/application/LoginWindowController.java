package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginWindowController implements Initializable {

    private Main main;

    public void setMain(Main main) {
        this.main = main;
    }

    @FXML
    private TextField account;
    @FXML
    private PasswordField password;

    @FXML
    public void Login(ActionEvent event) {
        main.userLogin(account.getText(), password.getText());
    }

    @FXML
    public void Clear(ActionEvent event) {
        account.setText(null);
        password.setText(null);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
}
