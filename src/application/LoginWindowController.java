package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
<<<<<<< HEAD
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
=======
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;

>>>>>>> 7f8ea8b108b64fc649f385c109e75ff00ab1ceef
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
