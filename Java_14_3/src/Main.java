import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "Qwe 25.98 USD 44 ERR 0.004 EU Iop0 RUB 543 RUB 222. EU Iuo .12 USD 0.99 EU";
        Pattern pattern = Pattern.compile("([1-9]\\d*|([1-9]\\d*|0)[.]\\d\\d|0) (USD|RUB|EU)");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
