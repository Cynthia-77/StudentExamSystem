package check;

import repository.IPersonRepository;
import repository.Person;
import repository.PersonRepository;
import java.util.List;

public class Check {
    //检查登录信息
    public static boolean loginCheck(String account, String password) {
        boolean checkRes = false;

        IPersonRepository repository = new PersonRepository();
        //查找学号为account的学生
        Person person = repository.getPerson(account);
        if ( person != null && person.getPassword().equals(password)) {
            checkRes = true;
        }
        return checkRes;
    }

    public static String checkName(String account) {
        IPersonRepository repository = new PersonRepository();
        //查找学号为account的学生
        Person person = repository.getPerson(account);
        return person.getName();
    }

    public static boolean checkHaveScore(String account) {
        boolean checkRes = false;
        IPersonRepository repository = new PersonRepository();
        //查找学号为account的学生
        Person person = repository.getPerson(account);
        if (person.getScore() != null) {
            checkRes = true;
        }
        return checkRes;
    }

    public static String checkScore(String account) {
        IPersonRepository repository = new PersonRepository();
        //查找学号为account的学生
        Person person = repository.getPerson(account);
        return person.getScore();
    }

    public static String checkRank(String account) {
        IPersonRepository repository = new PersonRepository();
        //查找学号为account的学生
        Person person = repository.getPerson(account);
        return person.getRank();
    }
}
