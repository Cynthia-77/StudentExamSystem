package repository;

import java.util.List;

public interface IQuestionRepository {
    //按照题目的“id”进行检索，返回符合条件的Question
    Question getQuestion(int id);

    //返回所有题目的Question集合
    List<Question> getQuestions();

    //添加一个题目，返回其新的id值
    int addQuestion(Question question);

    //更新一条题目信息，成功返回1，不成功返回0
    int updateQuestion(Question question);

    //删除一个题目，返回真实删除的条数
    int deleteQuestion(Question question);
    //添加其他应用程序所需要的功能
    //……
}
