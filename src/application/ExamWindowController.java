package application;

<<<<<<< HEAD
import javafx.event.ActionEvent;
=======
>>>>>>> 7f8ea8b108b64fc649f385c109e75ff00ab1ceef
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
<<<<<<< HEAD
import repository.IQuestionRepository;
import repository.Question;
import repository.QuestionRepository;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
=======
import repository.Question;

import java.net.URL;
>>>>>>> 7f8ea8b108b64fc649f385c109e75ff00ab1ceef
import java.util.ResourceBundle;

public class ExamWindowController implements Initializable {
    private Main main;

    public void setMain(Main main) {
        this.main = main;
    }

    private Stage stage;

<<<<<<< HEAD
    public void init(Main main, Stage stage) {
        this.stage = stage;
=======
    public void init(Main main,Stage stage) {
        this.stage=stage;
>>>>>>> 7f8ea8b108b64fc649f385c109e75ff00ab1ceef
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
<<<<<<< HEAD
    @FXML
    private Label question2Text;
    @FXML
    private RadioButton btn_question2A;
    @FXML
    private RadioButton btn_question2B;
    @FXML
    private RadioButton btn_question2C;
    @FXML
    private RadioButton btn_question2D;
    @FXML
    private Label question3Text;
    @FXML
    private RadioButton btn_question3A;
    @FXML
    private RadioButton btn_question3B;
    @FXML
    private RadioButton btn_question3C;
    @FXML
    private RadioButton btn_question3D;
    @FXML
    private Label question4Text;
    @FXML
    private RadioButton btn_question4A;
    @FXML
    private RadioButton btn_question4B;
    @FXML
    private RadioButton btn_question4C;
    @FXML
    private RadioButton btn_question4D;
    @FXML
    private Label question5Text;
    @FXML
    private RadioButton btn_question5A;
    @FXML
    private RadioButton btn_question5B;
    @FXML
    private RadioButton btn_question5C;
    @FXML
    private RadioButton btn_question5D;

    List<Question> questions = new ArrayList<>();

    private int calScore() {
        String choice = "";

        List<RadioButton> list = new ArrayList<>();
        list.add(btn_question1A);
        list.add(btn_question1B);
        list.add(btn_question1C);
        list.add(btn_question1D);
        for (int i = 0; i < 4; i++) {
            if (list.get(i).isSelected()) {
                choice += String.valueOf((char) ((int) 'A' + i));
                break;
            }
        }
        list = new ArrayList<>();
        list.add(btn_question2A);
        list.add(btn_question2B);
        list.add(btn_question2C);
        list.add(btn_question2D);
        for (int i = 0; i < 4; i++) {
            if (list.get(i).isSelected()) {
                choice += String.valueOf((char) ((int) 'A' + i));
                break;
            }
        }
        list = new ArrayList<>();
        list.add(btn_question3A);
        list.add(btn_question3B);
        list.add(btn_question3C);
        list.add(btn_question3D);
        for (int i = 0; i < 4; i++) {
            if (list.get(i).isSelected()) {
                choice += String.valueOf((char) ((int) 'A' + i));
                break;
            }
        }
        list = new ArrayList<>();
        list.add(btn_question4A);
        list.add(btn_question4B);
        list.add(btn_question4C);
        list.add(btn_question4D);
        for (int i = 0; i < 4; i++) {
            if (list.get(i).isSelected()) {
                choice += String.valueOf((char) ((int) 'A' + i));
                break;
            }
        }
        list = new ArrayList<>();
        list.add(btn_question5A);
        list.add(btn_question5B);
        list.add(btn_question5C);
        list.add(btn_question5D);
        for (int i = 0; i < 4; i++) {
            if (list.get(i).isSelected()) {
                choice += String.valueOf((char) ((int) 'A' + i));
                break;
            }
        }

        String answer = "";
        for (Question question : questions) {
            answer += question.getAnswer();
        }

        int score = 0;
        for (int i = 0; i < 5; i++) {
            char ans = answer.charAt(i);
            char op = choice.charAt(i);
            if (ans == op)
                score += 20;
        }

        return score;
    }

    @FXML
    private void Submit(ActionEvent event) {
        int score = calScore();
        main.userSubmit(score);
    }

    public void showQuestions() {
        //随机生成题目
        Random random = new Random();
        int[] list = random.random(10, 5);

        for (int i = 0; i < list.length; i++) {
            IQuestionRepository repository = new QuestionRepository();
            Question question = repository.getQuestion(list[i]);
            String num = String.valueOf(i + 1);
            question.setNum(num);
            question.setText(num + ". " + question.getText());
            question.setOptionA("A." + question.getOptionA());
            question.setOptionB("B. " + question.getOptionB());
            question.setOptionC("C. " + question.getOptionC());
            question.setOptionD("D. " + question.getOptionD());
            questions.add(question);
        }

        question1Text.setText(questions.get(0).getText());
        btn_question1A.setText(questions.get(0).getOptionA());
        btn_question1B.setText(questions.get(0).getOptionB());
        btn_question1C.setText(questions.get(0).getOptionC());
        btn_question1D.setText(questions.get(0).getOptionD());

        question2Text.setText(questions.get(1).getText());
        btn_question2A.setText(questions.get(1).getOptionA());
        btn_question2B.setText(questions.get(1).getOptionB());
        btn_question2C.setText(questions.get(1).getOptionC());
        btn_question2D.setText(questions.get(1).getOptionD());

        question3Text.setText(questions.get(2).getText());
        btn_question3A.setText(questions.get(2).getOptionA());
        btn_question3B.setText(questions.get(2).getOptionB());
        btn_question3C.setText(questions.get(2).getOptionC());
        btn_question3D.setText(questions.get(2).getOptionD());

        question4Text.setText(questions.get(3).getText());
        btn_question4A.setText(questions.get(3).getOptionA());
        btn_question4B.setText(questions.get(3).getOptionB());
        btn_question4C.setText(questions.get(3).getOptionC());
        btn_question4D.setText(questions.get(3).getOptionD());

        question5Text.setText(questions.get(4).getText());
        btn_question5A.setText(questions.get(4).getOptionA());
        btn_question5B.setText(questions.get(4).getOptionB());
        btn_question5C.setText(questions.get(4).getOptionC());
        btn_question5D.setText(questions.get(4).getOptionD());
=======

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
>>>>>>> 7f8ea8b108b64fc649f385c109e75ff00ab1ceef
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        showQuestions();
<<<<<<< HEAD

=======
>>>>>>> 7f8ea8b108b64fc649f385c109e75ff00ab1ceef
        final ToggleGroup group1 = new ToggleGroup();
        btn_question1A.setToggleGroup(group1);
        btn_question1B.setToggleGroup(group1);
        btn_question1C.setToggleGroup(group1);
        btn_question1D.setToggleGroup(group1);
<<<<<<< HEAD

        final ToggleGroup group2 = new ToggleGroup();
        btn_question2A.setToggleGroup(group2);
        btn_question2B.setToggleGroup(group2);
        btn_question2C.setToggleGroup(group2);
        btn_question2D.setToggleGroup(group2);

        final ToggleGroup group3 = new ToggleGroup();
        btn_question3A.setToggleGroup(group3);
        btn_question3B.setToggleGroup(group3);
        btn_question3C.setToggleGroup(group3);
        btn_question3D.setToggleGroup(group3);

        final ToggleGroup group4 = new ToggleGroup();
        btn_question4A.setToggleGroup(group4);
        btn_question4B.setToggleGroup(group4);
        btn_question4C.setToggleGroup(group4);
        btn_question4D.setToggleGroup(group4);

        final ToggleGroup group5 = new ToggleGroup();
        btn_question5A.setToggleGroup(group5);
        btn_question5B.setToggleGroup(group5);
        btn_question5C.setToggleGroup(group5);
        btn_question5D.setToggleGroup(group5);
=======
>>>>>>> 7f8ea8b108b64fc649f385c109e75ff00ab1ceef
    }
}
