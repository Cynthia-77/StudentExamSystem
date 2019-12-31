package repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonRepository implements IPersonRepository{

    private Connection connection=null;
    private final String connectionStr="jdbc:sqlite:info.db";

    @Override
    public Person getPerson(String account) {
        Person person = null;
        try {
            // 创建数据库连接
            connection = DriverManager.getConnection(connectionStr);

            String sql="select * from students where account = ? ";
            // 准备创建操作与存取的数据库命令
            PreparedStatement statement=connection.prepareStatement(sql);
            //设置参数值，第一个参数指的是SQL命令中的参数位置（从1开始，顺序递增），第二个参数是SQL参数的具体值
            statement.setString(1, account);

            // 查询表中保存的数据
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                person = PersonRepositoryHelper.getPersonFromResultSet(rs);
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
        return person;
    }

    @Override
    public List<Person> getPersons(){
        List<Person> persons=new ArrayList<>();
        try {
            // 创建数据库连接
            connection = DriverManager.getConnection(connectionStr);

            String sql="select * from students";
            // 准备创建操作与存取的数据库命令
            Statement statement=connection.createStatement();

            // 查询表中保存的数据
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                persons.add(
                        PersonRepositoryHelper.getPersonFromResultSet(rs));
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
        return persons;
    }

    @Override
    public int addPerson(Person client) {
        //  TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int updatePerson(Person client) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int deletePerson(String account) {
        // TODO Auto-generated method stub
        return 0;
    }

}
