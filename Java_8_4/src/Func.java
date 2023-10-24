public class Func {
    public int F(int k, int s){
        return F(k, s, 0);
    }
    public int F(int k, int s, int num){
        int sum = 0;
        if(num < Math.pow(10, k - 1)){
            for(int x = 0; x < 10; x++){
                if(x!=0 || num!=0){
                    sum += F(k, s, num*10+x);
                }
            }
        }
        else{
            int ns = 0;
            while (num>0){
                ns += num%10;
                num/=10;
            }
            if(ns == s)sum = 1;
        }
        return sum;
    }
}
