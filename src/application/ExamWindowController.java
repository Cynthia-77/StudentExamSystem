package application;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ExamWindowController implements Initializable {
    private Main main;

    public void setMain(Main main) {
        this.main = main;
    }

    private Stage stage;

    public void init(Main main,Stage stage) {
        this.stage=stage;
    }

    @FXML
    private Label question1Text;
    @FXML
    private RadioButton btn_question1A;
    @FXML
    private RadioButton btn_question1B;
    @FXML
    private RadioButton btn_question1C;
    @FXML
    private RadioButton btn_question1D;

    public void showQuestions(){
        Question question1 = new Question();
        question1.setNum("1");
        question1.setText("Do you like this system?");
        question1.setOptionA("yes");
        question1.setOptionB("okay");
        question1.setOptionC("a little");
        question1.setOptionD("no");
        question1Text.setText(question1.getText());
        btn_question1A.setText(question1.getOptionA());
        btn_question1B.setText(question1.getOptionB());
        btn_question1C.setText(question1.getOptionC());
        btn_question1D.setText(question1.getOptionD());
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        showQuestions();
        final ToggleGroup group1 = new ToggleGroup();
        btn_question1A.setToggleGroup(group1);
        btn_question1B.setToggleGroup(group1);
        btn_question1C.setToggleGroup(group1);
        btn_question1D.setToggleGroup(group1);
    }
}
