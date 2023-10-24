public class Func {
    public void F(int num){
        if(num > 1)F(num - 1);
        System.out.println(num);
    }
}
