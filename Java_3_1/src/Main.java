import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println("Class Random numbers:");
        Random random = new Random(System.nanoTime());
        ArrayList<Double> numbers = new ArrayList<>();
        int size = 10;
        for(int x=0; x< size; x++){
            numbers.add(random.nextDouble());
        }
        for(int x =0; x< size; x++){
            System.out.println(numbers.get(x));
        }
        System.out.println();
        Collections.sort(numbers);
        for(int x =0; x< size; x++){
            System.out.println(numbers.get(x));
        }
        System.out.println();
        System.out.println("Math random numbers:");
        numbers = new ArrayList<>();
        for(int x=0; x< size; x++){
            numbers.add(Math.random());
        }
        for(int x =0; x< size; x++){
            System.out.println(numbers.get(x));
        }
        System.out.println();
        Collections.sort(numbers);
        for(int x =0; x< size; x++){
            System.out.println(numbers.get(x));
        }
    }
}