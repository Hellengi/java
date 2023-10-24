public class MathFunc implements MathCalculable{
    @Override
    public double extend(double num, double pow) {
        double res = 1;
        for (int x = 0; x < pow; x++) res *= num;
        return res;
    }

    @Override
    public double module(double real, double imag) {
        return Math.sqrt(real * real + imag * imag);
    }
    public double circlePer(double rad){
        return rad * 2 * MathCalculable.getPi();
    }
}
