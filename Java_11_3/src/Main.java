import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        date.setTime(System.currentTimeMillis());
        Student student = new Student("Ivan", "Ivanov", "Shahter", 3, 2, 100, date);
        System.out.println(student);
    }
}