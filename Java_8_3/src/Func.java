public class Func {
    public void F(int a, int b){
        System.out.print(a + " ");
        if(a < b)F(a+1, b);
        if(a > b)F(a-1, b);
    }
}
