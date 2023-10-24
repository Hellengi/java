import java.util.ArrayList;

public class Report {
    static void generateReport(ArrayList<Employer> list){
        for (Employer emp : list){
            System.out.printf("Name: %s\t\tSalary: %10.2f%n", emp.getFullname(), emp.getSalary());
        }
    }
}
