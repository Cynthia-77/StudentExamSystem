package application;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController implements Initializable {

    private Stage stage;

    public void init(Main main, Stage stage) {
        this.stage = stage;
    }

    private Main main;

    public void setMain(Main main) {
        this.main = main;
    }

    @FXML
    private void Out(ActionEvent event) {
        main.userOutMain();
    }

    @FXML
    private void StartExam(ActionEvent event) {
        main.userStartExam(accountInfo.getText());
    }

    @FXML
    private void CheckScore(ActionEvent event) {
        main.userCheckScore(accountInfo.getText());
    }

    @FXML
    private void ShowRank(ActionEvent event) {
        main.userShowRank();
    }

    @FXML
    Label accountInfo;

    //从窗体用于从外部接收信息的方法
    public void setAccountInfo(String account) {
        accountInfo.setText(account);
    }

    @FXML
    Label nameInfo;

    //从窗体用于从外部接收信息的方法
    public void setNameInfo(String name) {
        nameInfo.setText(name);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
