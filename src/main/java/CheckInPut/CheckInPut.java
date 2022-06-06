package CheckInPut;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckInPut {
    public static boolean CheckEmail(String email) {
        Pattern checkemail = Pattern.compile("^[\\w\\-_.]+@[\\w\\-_]+(\\.[\\w\\-_]+){1,2}$");
        Matcher matcher = checkemail.matcher(email);
        return matcher.find();
    }

    public static boolean CheckPassword(String password) {
        if (password.length() >= 6 && password.length() <= 12) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean CheckFullName(String fullname) {
        Pattern checkfullname = Pattern.compile("^[a-zA-Z\\s]+$");
        Matcher matcher = checkfullname.matcher(fullname);
        return matcher.find();
    }
}
