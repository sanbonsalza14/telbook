package exception;

import java.util.regex.Pattern;

public class InputValidation {
    public void nameCheck(String name) {
        boolean check = Pattern.matches("^[ㄱ-ㅎ가-힣]*$",name);gi
    }
}
