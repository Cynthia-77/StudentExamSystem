package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;

public class ScoreWindowController implements Initializable {

    private Stage stage;

    public void init(Main main, Stage stage) {
        this.stage = stage;
    }

    private Main main;

    public void setMain(Main main) {
        this.main = main;
    }

    @FXML
    Label accountInfo;
    @FXML
    Label nameInfo;
    @FXML
    Label scoreInfo;
    @FXML
    Label rankInfo;

    //从窗体用于从外部接收信息的方法
    public void setAccountInfo(String account) {
        accountInfo.setText(account);
    }

    //从窗体用于从外部接收信息的方法
    public void setNameInfo(String name) {
        nameInfo.setText(name);
    }

    //从窗体用于从外部接收信息的方法
    public void setScoreInfo(String score) {
        String info = "成绩：" + score;
        scoreInfo.setText(info);
    }

    //从窗体用于从外部接收信息的方法
    public void setRankInfo(String rank) {
        String info = "排名：" + rank;
        rankInfo.setText(info);
    }

    @FXML
    private void Back(ActionEvent event) {
        main.scoreBackToMain(accountInfo.getText(), nameInfo.getText());
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
}
