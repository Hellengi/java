import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Reader r = new Reader("Иванов Иван Иваныч", "1234", "IT", "01.01.2077", "+7(909)656-43-34");
        ArrayList<String> s = new ArrayList<>();
        ArrayList<Book> b = new ArrayList<>();
        for(int x=0;x<4;x++){
            s.add("Book_" + x);
        }
        for(int x=0;x<4;x++){
            b.add(new Book("Book_" + x, "Autor" + x));
        }
        r.takeBook();
        r.takeBook(5);
        r.takeBook(s);
        r.takeBook(b, 0);
        r.returnBook();
        r.returnBook(5);
        r.returnBook(s);
        r.returnBook(b, 0);
    }
}