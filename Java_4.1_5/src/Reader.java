import java.util.ArrayList;
import java.util.SortedMap;

public class Reader {
    public Reader(String name, String ticketNum, String faculty, String birth, String phoneNum) {
        this.name = name;
        this.ticketNum = ticketNum;
        this.faculty = faculty;
        this.birth = birth;
        this.phoneNum = phoneNum;
    }

    private String name;
    private String ticketNum;
    private String faculty;
    private String birth;
    private String phoneNum;
    public void takeBook(){

    }
    public void takeBook(int num){
        System.out.println(name + " взял " + num + " книги");
    }
    public void takeBook(ArrayList<String> books){
        System.out.print(name + " взял книги:  ");
        for(int x =0; x<books.size();x++){
            if(x!=0) System.out.print(", ");
            System.out.print(books.get(x));
        }
        System.out.println();
    }
    public void takeBook(ArrayList<Book> books, int x){
        System.out.print(name + " взял книги:  ");
        for(x =0; x<books.size();x++){
            if(x!=0) System.out.print(", ");
            System.out.print(books.get(x).getName());
        }
        System.out.println();
    }
    public void returnBook(){

    }
    public void returnBook(int num){
        System.out.println(name + " вернул " + num + " книги");
    }
    public void returnBook(ArrayList<String> books){
        System.out.print(name + " вернул книги:  ");
        for(int x =0; x<books.size();x++){
            if(x!=0) System.out.print(", ");
            System.out.print(books.get(x));
        }
        System.out.println();
    }
    public void returnBook(ArrayList<Book> books, int x){
        System.out.print(name + " вернул книги:  ");
        for(x =0; x<books.size();x++){
            if(x!=0) System.out.print(", ");
            System.out.print(books.get(x).getName());
        }
        System.out.println();
    }
}
