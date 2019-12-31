package repository;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonRepositoryHelper {
    //从ResultSet的当前记录中读取数据，创建一个Person对象返回
    public static Person getPersonFromResultSet(ResultSet rs) throws SQLException {
        if (rs == null) {
            return null;
        }
        Person person = new Person();
        person.setAccount(rs.getString("account"));
        person.setName(rs.getString("name"));
        person.setScore(rs.getString("score"));
        person.setRank(String.valueOf(rs.getInt("rank")));
        person.setPassword(rs.getString("password"));
        return person;
    }

    //输出一个Person对象的信息
    public static void printPerson(Person person) {
        if (person == null) {
            return;
        }
        System.out.println("---------------------");
        System.out.println("account=" + person.getAccount());
        System.out.println("name=" + person.getName());
    }
}
