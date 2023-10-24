import java.util.Random;
import java.util.ArrayList;
public class Testing {
    public void testing(){
        Student[] iDNumber = new Student[20];
        Random random = new Random();
        for(int x = 0; x < 20 ;x++){
            iDNumber[x] = (new Student(random.nextInt(100)));
        }
        System.out.println("Begin:");
        for(Student x : iDNumber){
            System.out.println(x);
        }
        iDNumber = (Student[]) sort(iDNumber);
        System.out.println("Sorted:");
        for(Student x : iDNumber){
            System.out.println(x);
        }
    }
    public static Comparable[] sort(Comparable[] list){
        Comparable temp;
        for (int x = 0;x < list.length;x++){
            int y=x;
            while (y>0 && list[y].compareTo(list[y-1])<0){
                temp = list[y];
                list[y] = list[y-1];
                list[y-1] = temp;
                y--;
            }
        }
        return list;
    }
}

