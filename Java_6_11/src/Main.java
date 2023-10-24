import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        CtoK CtoK = new CtoK();
        CtoF CtoF = new CtoF();
        float C = Scanner.nextFloat();
        System.out.println(CtoK.convert(C));
        System.out.println(CtoF.convert(C));
    }
}