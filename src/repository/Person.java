package repository;

<<<<<<< HEAD
public class Person implements Comparable<Person> {
=======
public class Person {
>>>>>>> 7f8ea8b108b64fc649f385c109e75ff00ab1ceef
    private String name;
    private String account;
    private String score;
    private String rank;
    private String password;

    public String getName() {
        return name;
    }
<<<<<<< HEAD

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person [account=" + account + ", age=" + score + "]";
    }

    //重写Comparable接口的compareTo方法
    @Override
    public int compareTo(Person person) {
        return Integer.valueOf(person.getScore()) - Integer.valueOf(this.score);
    }
=======
    public void setName(String name) {
        this.name = name;
    }
    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    public String getScore(){
        return score;
    }
    public void setScore(String score){
        this.score = score;
    }
    public String getRank() {
        return rank;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
>>>>>>> 7f8ea8b108b64fc649f385c109e75ff00ab1ceef
}
