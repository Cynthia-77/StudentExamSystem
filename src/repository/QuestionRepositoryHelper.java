package repository;

import java.sql.ResultSet;
import java.sql.SQLException;

public class QuestionRepositoryHelper {
    //从ResultSet的当前记录中读取数据，创建一个Question对象返回
    public static Question getQuestionFromResultSet(ResultSet rs) throws SQLException {
        if (rs == null) {
            return null;
        }
        Question question = new Question();
        question.setText(rs.getString("text"));
        question.setOptionA(rs.getString("optionA"));
        question.setOptionB(rs.getString("optionB"));
        question.setOptionC(rs.getString("optionC"));
        question.setOptionD(rs.getString("optionD"));
        question.setAnswer(rs.getString("answer"));
        return question;
    }

    //输出一个Question对象的信息
    public static void printQuestion(Question question) {
        if (question == null) {
            return;
        }
        System.out.println("---------------------");
        System.out.println("text: " + question.getText());
        System.out.println("A." + question.getOptionA());
    }
}
