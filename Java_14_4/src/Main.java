import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "Qwerty (1 + 8) - 9 / 4 asdf 6 / 5 - 2 * 9 zxcv";
        Pattern pattern = Pattern.compile("[\\d()/*\\-+ ]*\\d *\\+[\\d()/*\\-+ ]*");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
