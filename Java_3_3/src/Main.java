import java.util.Random;
public class Main{
    public static void main(String[] args) {
        Random random = new Random();
        int[] num = new int[4];
        for (int x=0; x<4;x++){
            num[x] = random.nextInt(10, 100 );
        }
        System.out.println(num[0] + " " + num[1] + " " + num[2] + " " + num[3]);
        if(num[0] < num[1] && num[1] < num[2] && num[2] < num[3]){
            System.out.println("Array is strictly increasing");
        }
        else System.out.println("Array is not strictly increasing");
    }
}