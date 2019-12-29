package check;

public class Check {
    public static boolean loginCheck(String account, String password) {
        boolean checkRes = false;
        if ("a".equals(account) && "b".equals(password)) {
            checkRes = true;
        }
        return checkRes;
    }

    public static String checkName(String account) {
        String checkRes = "哈哈";
        return checkRes;
    }

    public static boolean checkHaveScore(String account) {
        boolean checkRes = false;
        if ("b".equals(account)) {
            checkRes = true;
        }
        return checkRes;
    }

    public static int checkScore(String account) {
        int checkRes = 100;
        return checkRes;
    }

    public static int checkRank(String account) {
        int checkRes = 1;
        return checkRes;
    }
}
