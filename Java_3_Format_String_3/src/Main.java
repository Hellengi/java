import java.util.ArrayList;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Employer> list = new ArrayList<>();
        for(int x=0;x<10;x++){
            list.add(new Employer("Emp_" + x, random.nextFloat(1000, 20000)));
        }
        Report.generateReport(list);
    }
}