import java.util.Random;
import java.util.ArrayList;
public class Testing {
    public void testing(){
        ArrayList<Student> iDNumber = new ArrayList<>();
        Random random = new Random();
        for(int x = 0; x < 20 ;x++){
            iDNumber.add(new Student(random.nextInt(100), random.nextInt(100)));
        }
        System.out.println("Begin:");
        for(Student x : iDNumber){
            System.out.println(x);
        }
        iDNumber = sort(iDNumber);
        System.out.println("Sorted:");
        for(Student x : iDNumber){
            System.out.println(x);
        }
    }
    public static ArrayList<Student> sort(ArrayList<Student> list){
        if(list.size()>=2) {
            ArrayList<Student> list1 = new ArrayList<>();
            ArrayList<Student> list2 = new ArrayList<>();
            if(list.get(0).compare(list.get(0),list.get(1))<0){
                list1.add(list.get(0));
                list2.add(list.get(1));
            }
            else {
                list1.add(list.get(1));
                list2.add(list.get(0));
            }
            for (int x =2 ;x<list.size();x++){
                if (list.get(x).compare(list.get(x),list1.get(0))<0){
                    list1.add(list.get(x));
                }
                else {
                    list2.add(list.get(x));
                }
            }
            list1 = sort(list1);
            list2 = sort(list2);
            list1.addAll(list2);
            return list1;
        }
        else return list;
    }
}

