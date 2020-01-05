package repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
public class PersonRepository implements IPersonRepository {

    private Connection connection = null;
    private final String connectionStr = "jdbc:sqlite:info.db";
=======
public class PersonRepository implements IPersonRepository{

    private Connection connection=null;
    private final String connectionStr="jdbc:sqlite:info.db";
>>>>>>> 7f8ea8b108b64fc649f385c109e75ff00ab1ceef

    @Override
    public Person getPerson(String account) {
        Person person = null;
        try {
            // 创建数据库连接
            connection = DriverManager.getConnection(connectionStr);

<<<<<<< HEAD
            String sql = "select * from students where account = ? ";
            // 准备创建操作与存取的数据库命令
            PreparedStatement statement = connection.prepareStatement(sql);
=======
            String sql="select * from students where account = ? ";
            // 准备创建操作与存取的数据库命令
            PreparedStatement statement=connection.prepareStatement(sql);
>>>>>>> 7f8ea8b108b64fc649f385c109e75ff00ab1ceef
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
<<<<<<< HEAD
    public List<Person> getPersons() {
        List<Person> persons = new ArrayList<>();
=======
    public List<Person> getPersons(){
        List<Person> persons=new ArrayList<>();
>>>>>>> 7f8ea8b108b64fc649f385c109e75ff00ab1ceef
        try {
            // 创建数据库连接
            connection = DriverManager.getConnection(connectionStr);

<<<<<<< HEAD
            String sql = "select * from students where score is not null";
            // 准备创建操作与存取的数据库命令
            Statement statement = connection.createStatement();
=======
            String sql="select * from students";
            // 准备创建操作与存取的数据库命令
            Statement statement=connection.createStatement();
>>>>>>> 7f8ea8b108b64fc649f385c109e75ff00ab1ceef

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
<<<<<<< HEAD
    public int addPerson(Person person) {
=======
    public int addPerson(Person client) {
>>>>>>> 7f8ea8b108b64fc649f385c109e75ff00ab1ceef
        //  TODO Auto-generated method stub
        return 0;
    }

    @Override
<<<<<<< HEAD
    public int updatePerson(Person person) {
        //  TODO Auto-generated method stub
=======
    public int updatePerson(Person client) {
        // TODO Auto-generated method stub
>>>>>>> 7f8ea8b108b64fc649f385c109e75ff00ab1ceef
        return 0;
    }

    @Override
    public int deletePerson(String account) {
        // TODO Auto-generated method stub
        return 0;
    }

<<<<<<< HEAD
    @Override
    public int updateScore(Person person) {
        int res = 0;
        try {
            // 创建数据库连接
            connection = DriverManager.getConnection(connectionStr);

            String sql = "update students set score = ? where account = ? ";
            // 准备创建操作与存取的数据库命令
            PreparedStatement statement = connection.prepareStatement(sql);
            //设置参数值，第一个参数指的是SQL命令中的参数位置（从1开始，顺序递增），第二个参数是SQL参数的具体值
            statement.setString(1, person.getScore());
            statement.setString(2, person.getAccount());

            // 更新表中数据
            res = statement.executeUpdate();
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
        return res;
    }

    @Override
    public int updateRank(Person person) {
        int res = 0;
        try {
            // 创建数据库连接
            Connection connection2 = DriverManager.getConnection(connectionStr);

            String sql = "update students set rank = ? where account = ? ";
            // 准备创建操作与存取的数据库命令
            PreparedStatement statement = connection2.prepareStatement(sql);
            //设置参数值，第一个参数指的是SQL命令中的参数位置（从1开始，顺序递增），第二个参数是SQL参数的具体值
            statement.setString(1, person.getRank());
            statement.setString(2, person.getAccount());

            // 更新表中数据
            res = statement.executeUpdate();
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
        return res;
    }

    @Override
    public void sortPerson() {
        try {
            connection = null;
            // 创建数据库连接
            connection = DriverManager.getConnection(connectionStr);

            String sql = "select * from students where score is not null order by score asc";
            // 准备创建操作与存取的数据库命令
            Statement statement = connection.createStatement();

            // 查询表中保存的数据
            ResultSet rs = statement.executeQuery(sql);
            int rk = 1;
            while (rs.next()) {
                //               System.out.println("account"+rs.getString("account"));
                //               Person person = PersonRepositoryHelper.getPersonFromResultSet(rs);
                //               person.setRank(String.valueOf(rk));
                //              rk++;
                //             updateRank(person);
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
    }

=======
>>>>>>> 7f8ea8b108b64fc649f385c109e75ff00ab1ceef
}
