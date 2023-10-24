import java.util.ArrayList;
import java.util.Random;
public class Tester {
    private ArrayList<Circle> arrayCircle;
    public Tester(){
        Random random = new Random(System.nanoTime());
        arrayCircle = new ArrayList<>();
        System.out.println("Creating circles:");
        for(int x=0; x< 10; x++){
            arrayCircle.add(new Circle(random.nextDouble(),random.nextDouble(),random.nextDouble()));
        }
        System.out.println("Circles in the array:");
        for(int x =0; x< 10; x++){
            System.out.println(arrayCircle.get(x));
        }
        System.out.println();
        System.out.println("Sorting circles:");
        sortCircles();
        System.out.println("Sorted circles:");
        for(int x =0; x< 10; x++){
            System.out.println(arrayCircle.get(x));
        }
    }
    public Circle maxRad(){
        if (arrayCircle.isEmpty()) return null;
        Circle maxRad = arrayCircle.get(0);
        for (Circle c : arrayCircle) {
            if (c.getRadius() > maxRad.getRadius()){
                maxRad = c;
            }
        }
        return maxRad;
    }
    public Circle minRad(){
        if (arrayCircle.isEmpty()) return null;
        Circle minRad = arrayCircle.get(0);
        for (Circle c : arrayCircle) {
            if (c.getRadius() < minRad.getRadius()){
                minRad = c;
            }
        }
        return minRad;
    }

    public void sortCircles(){
        Circle one;
        for(int x = 1;x< arrayCircle.size();x++){
            for(int y =1; y<arrayCircle.size(); y++){
                if (arrayCircle.get(y-1).getRadius() > arrayCircle.get(y).getRadius()){
                    one = arrayCircle.get(y);
                    arrayCircle.set(y, arrayCircle.get(y-1));
                    arrayCircle.set(y-1, one);
                }
            }
        }
    }
}