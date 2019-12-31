package application;

import check.Check;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import repository.Person;

import java.io.IOException;

public class Main extends Application {

    Person user;

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        showLoginWindow();
    }

    // 显示登录窗体
    public void showLoginWindow() {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("LoginWindowView.fxml"));
            AnchorPane root = (AnchorPane) loader.load();

            LoginWindowController controller = loader.getController();
            controller.setMain(this);

            Scene scene = new Scene(root);
            primaryStage = new Stage();
            primaryStage.setTitle("学生考试系统");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //用户登录
    public void userLogin(String account, String password) {
        if (Check.loginCheck(account, password)) {
            String name = Check.checkName(account);
            String score = Check.checkScore(account);
            String rank = Check.checkRank(account);
            user = new Person();
            user.setAccount(account);
            user.setName(name);
            user.setScore(score);
            user.setRank(rank);
            showMainWindow(account, name);
            //关闭主窗体
            primaryStage.close();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("错误提示");
            alert.setHeaderText(null);
            alert.setContentText("用户名或密码错误，请重新输入");
            alert.showAndWait();
        }
    }

    private Stage mainStage = new Stage();

    //显示主窗体
    public void showMainWindow(String account, String name) {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("MainWindowView.fxml"));
            AnchorPane root = (AnchorPane) loader.load();
            mainStage = new Stage();
            // 启用模态对话框
            //mainStage.initModality(Modality.APPLICATION_MODAL);
            MainWindowController controller = loader.getController();
            controller.init(this, mainStage);
            controller.setMain(this);
            //发送信息
            controller.setAccountInfo(account);
            controller.setNameInfo(name);
            //显示从窗体
            Scene scene = new Scene(root);
            mainStage.setScene(scene);
            mainStage.setTitle("学生考试系统");
            mainStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //用户退出
    public void userOutMain() {
        showLoginWindow();
        mainStage.close();
    }

    //用户开始考试
    public void userStartExam(String account) {
        //已参加过考试
        if (Check.checkHaveScore(account)) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("提示");
            alert.setHeaderText(null);
            alert.setContentText("已参与过考试");
            alert.showAndWait();
        }
        //未参与过考试
        else {
            showExamWindow();
            mainStage.close();
        }
    }

    private Stage examStage = new Stage();

    //显示考试窗体
    public void showExamWindow() {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("ExamWindowView.fxml"));
            AnchorPane root = (AnchorPane) loader.load();
            examStage = new Stage();
            // 启用模态对话框
            //examStage.initModality(Modality.APPLICATION_MODAL);
            ExamWindowController controller = loader.getController();
            controller.init(this, examStage);
            controller.setMain(this);
            //显示从窗体
            Scene scene = new Scene(root);
            examStage.setScene(scene);
            examStage.setTitle("开始考试");
            examStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //用户查询考试成绩
    public void userCheckScore(String account) {
        //已参加过考试
        if (Check.checkHaveScore(account)) {
            String name = Check.checkName(account);
            String score = Check.checkScore(account);
            String rank = Check.checkRank(account);
            showCheckScoreWindow(account, name, score, rank);
            mainStage.close();
        }
        //未参与过考试
        else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("提示");
            alert.setHeaderText(null);
            alert.setContentText("还未参与考试");
            alert.showAndWait();
        }
    }

    private Stage scoreStage = new Stage();

    //显示查询成绩窗体
    public void showCheckScoreWindow(String account, String name, String score, String rank) {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("ScoreWindowView.fxml"));
            AnchorPane root = (AnchorPane) loader.load();
            scoreStage = new Stage();
            // 启用模态对话框
            //scoreStage.initModality(Modality.APPLICATION_MODAL);
            ScoreWindowController controller = loader.getController();
            controller.init(this, scoreStage);
            controller.setMain(this);
            //发送信息
            controller.setAccountInfo(account);
            controller.setNameInfo(name);
            controller.setScoreInfo(score);
            controller.setRankInfo(rank);
            //显示从窗体
            Scene scene = new Scene(root);
            scoreStage.setScene(scene);
            scoreStage.setTitle("查询成绩");
            scoreStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void scoreBackToMain(String account, String name) {
        showMainWindow(account, name);
        scoreStage.close();
    }

    //用户查看排行榜
    public void userShowRank() {
        showRankWindow();
        mainStage.close();
    }

    private Stage rankStage = new Stage();

    //显示排行榜窗体
    public void showRankWindow() {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("RankWindowView.fxml"));
            AnchorPane root = (AnchorPane) loader.load();
            rankStage = new Stage();

            RankWindowController controller = loader.getController();
            controller.setMain(this);

            Scene scene = new Scene(root);
            rankStage.setTitle("排行榜");
            rankStage.setScene(scene);
            rankStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void rankBackToMain(){
        showMainWindow(user.getAccount(),user.getName());
        rankStage.close();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
