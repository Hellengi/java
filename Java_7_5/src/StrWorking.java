public class StrWorking implements StrWork{
    @Override
    public int CharNum(String str) {
        return str.length();
    }

    @Override
    public String NotEven(String str) {
        StringBuilder newStr = new StringBuilder();
        boolean notEven = false;
        for(int x = 0; x < str.length(); x++){
            if(notEven) newStr.append(str.charAt(x));
            notEven = !notEven;
        }
        return newStr.toString();
    }

    @Override
    public String StrInv(String str) {
        StringBuilder newStr = new StringBuilder();
        boolean notEven = false;
        for(int x = 0; x < str.length(); x++){
            newStr.insert(0, (str.charAt(x)));
            notEven = !notEven;
        }
        return newStr.toString();
    }
}
