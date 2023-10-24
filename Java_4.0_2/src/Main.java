import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Clothes> list = new ArrayList<>();
        list.add(new TShirt(size.XXS, 500, "red"));
        list.add(new Pants(size.M, 1000, "blue"));
        list.add(new Skirt(size.S, 1500, "yellow"));
        list.add(new Tie(size.XS, 2000, "green"));
        Atelier a = new Atelier();
        a.dressMan(list);
        System.out.println();
        a.dressWoman(list);
    }
}