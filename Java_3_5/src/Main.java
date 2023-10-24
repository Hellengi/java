import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter number that is bigger then 10");
        int n=0;
        while (n<=10){
            n = sc.nextInt();
        }
        int[] numArr= new int[n];
        for (int x =0; x< n; x++){
            numArr[x] = random.nextInt(0, n);
        }
        for (int i : numArr) {
            System.out.print(i + " ");
        }
        System.out.println();
        ArrayList<Integer> only2 = new ArrayList<>();
        for (int x=0;x<n;x++){
            if(numArr[x]%2==0){
                only2.add(numArr[x]);
            }
        }
        for (Integer integer : only2) {
            System.out.print(integer + " ");
        }
    }
}