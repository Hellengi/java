import java.util.Random;
import java.util.ArrayList;
public class Testing {
    public void testing(){
        ArrayList<Student> iDNumber1 = new ArrayList<>();
        ArrayList<Student> iDNumber2 = new ArrayList<>();
        Random random = new Random();
        for(int x = 0; x < 20 ;x++){
            iDNumber1.add(new Student(random.nextInt(100), random.nextInt(100)));
        }
        for(int x = 0; x < 20 ;x++){
            iDNumber2.add(new Student(random.nextInt(100), random.nextInt(100)));
        }
        System.out.println("First list:");
        for(Student x : iDNumber1){
            System.out.println(x);
        }
        System.out.println("Second list:");
        for(Student x : iDNumber2){
            System.out.println(x);
        }
        ArrayList<Student> iDNumber = unit(iDNumber1, iDNumber2);
        iDNumber = sort(iDNumber);
        System.out.println("Sorted:");
        for(Student x : iDNumber){
            System.out.println(x);
        }
    }
    public static ArrayList<Student> unit(ArrayList<Student> list1, ArrayList<Student> list2){
        list1.addAll(list2);
        return list1;
    }
    public static ArrayList<Student> sort(ArrayList<Student> list){
        if(list.size()>1){
            ArrayList<Student> list1 = new ArrayList<>();
            ArrayList<Student> list2 = new ArrayList<>();
            for (int i=0;i<list.size();i++){
                if(i%2==0)list1.add(list.get(i));
                else list2.add(list.get(i));
            }
            list1 = sort(list1);
            list2 =  sort(list2);
            ArrayList<Student> newList = new ArrayList<>();
            int a = 0;
            int b = 0;
            while(list1.size()>a && list2.size()>b){
                if(list1.get(a).compare(list1.get(a), list2.get(b))>=0){
                    newList.add(list2.get(b));
                    b++;
                }
                else{
                    newList.add(list1.get(a));
                    a++;
                }
            }
            while (list1.size()>a){
                newList.add(list1.get(a));
                a++;
            }
            while (list2.size()>b){
                newList.add(list2.get(b));
                b++;
            }
            return newList;
        }
        else{
            return list;
        }
    }
}

