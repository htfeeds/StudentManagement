package functions;

import java.sql.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateData {

    public static boolean check(String n) {
        if (n == null || n.length() == 0) {
            return false;
        }
        return true;
    }

    public static boolean checkName(String n) {

        if (n == null || n.length() == 0) {
            return false;
        } else {
            String strPattern = "[^a-z ]";

            Pattern p;
            Matcher m;
            int flag = Pattern.CASE_INSENSITIVE;
            p = Pattern.compile(strPattern, flag);
            m = p.matcher(n);
            return !m.find();
        }
    }

    public static boolean checkPassword(String password) {
        if (password.length() < 6 || password.length() > 20 || password.length() == 0) {
            return false;
        }
        return true;
    }

    public static boolean checkEmail(String n) {
        if (n == null) {
            return false;
        } else {
            String strPattern = "\\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b";
            Pattern p;
            Matcher m;
            int flag = Pattern.CASE_INSENSITIVE;
            p = Pattern.compile(strPattern, flag);
            m = p.matcher(n);
            return m.find();
        }
    }

    public static boolean checkPhoneNumber(String n) {
        try {
            Integer.parseInt(n);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean checkDate(String n) {
        if (n == null || n.length() > 10 || n.length() < 2) {
            return false;
        }
        try {
            Date.valueOf(n);
        } catch (IllegalArgumentException ex) {
            return false;
        }
        return true;
    }

    public static boolean checkMark(String n) {
        if (n == null || n.length() > 2 || n.length() < 1) {
            return false;
        } else {
            String strPattern = "[^0-9]";
            Pattern p;
            Matcher m;
            int flag = Pattern.CASE_INSENSITIVE;
            p = Pattern.compile(strPattern, flag);
            m = p.matcher(n);
            return !m.find();
        }
    }
}
