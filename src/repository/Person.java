package repository;

public class Person implements Comparable<Person> {
    private String name;
    private String account;
    private String score;
    private String rank;
    private String password;

    public String getName() {
        return name;
    }

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
}
