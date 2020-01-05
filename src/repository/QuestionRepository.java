package repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QuestionRepository implements IQuestionRepository {

    private Connection connection = null;
    private final String connectionStr = "jdbc:sqlite:info.db";

    @Override
    public Question getQuestion(int id) {
        Question question = null;
        try {
            // 创建数据库连接
            connection = DriverManager.getConnection(connectionStr);

            String sql = "select * from questions where id = ? ";
            // 准备创建操作与存取的数据库命令
            PreparedStatement statement = connection.prepareStatement(sql);
            //设置参数值，第一个参数指的是SQL命令中的参数位置（从1开始，顺序递增），第二个参数是SQL参数的具体值
            statement.setInt(1, id);

            // 查询表中保存的数据
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                question = QuestionRepositoryHelper.getQuestionFromResultSet(rs);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
        return question;
    }

    @Override
    public List<Question> getQuestions() {
        List<Question> questions = new ArrayList<>();
        try {
            // 创建数据库连接
            connection = DriverManager.getConnection(connectionStr);

            String sql = "select * from questions";
            // 准备创建操作与存取的数据库命令
            Statement statement = connection.createStatement();

            // 查询表中保存的数据
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                questions.add(
                        QuestionRepositoryHelper.getQuestionFromResultSet(rs));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
        return questions;
    }

    @Override
    public int addQuestion(Question question) {
        //  TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int updateQuestion(Question question) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int deleteQuestion(Question question) {
        // TODO Auto-generated method stub
        return 0;
    }
}
