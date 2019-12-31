package repository;

import java.util.List;

public interface IPersonRepository {
    //按照学生的“学号”进行模糊检索，返回符合条件的Person
    Person getPerson(String account);
    //返回所有学生记录的Person集合
    List<Person> getPersons();
    //添加一条学生记录，返回其新的Id值
    int addPerson(Person person);
    //更新一条学生信息，成功返回1，不成功返回0
    int updatePerson(Person person);
    //删除一条学生信息，返回真实删除的条数
    int deletePerson(String account);
    //添加其他应用程序所需要的功能
    //……
}
