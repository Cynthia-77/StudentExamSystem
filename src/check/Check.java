package check;

import repository.IPersonRepository;
import repository.Person;
import repository.PersonRepository;
<<<<<<< HEAD
import java.util.Collections;
=======
>>>>>>> 7f8ea8b108b64fc649f385c109e75ff00ab1ceef
import java.util.List;

public class Check {
    //检查登录信息
    public static boolean loginCheck(String account, String password) {
        boolean checkRes = false;

        IPersonRepository repository = new PersonRepository();
        //查找学号为account的学生
        Person person = repository.getPerson(account);
<<<<<<< HEAD
        if (person != null && person.getPassword().equals(password)) {
=======
        if ( person != null && person.getPassword().equals(password)) {
>>>>>>> 7f8ea8b108b64fc649f385c109e75ff00ab1ceef
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
<<<<<<< HEAD
        List<Person> persons = repository.getPersons();
        Collections.sort(persons);
        int rk = 1;
        String rank = null;
        for (Person person : persons) {
            person.setRank(String.valueOf(rk));
            rk++;
            if (person.getAccount().equals(account)) {
                rank = person.getRank();
            }
        }
        return rank;
=======
        //查找学号为account的学生
        Person person = repository.getPerson(account);
        return person.getRank();
>>>>>>> 7f8ea8b108b64fc649f385c109e75ff00ab1ceef
    }
}
