public class CtoF implements Convertable{
    @Override
    public double convert(double C) {
        return C * 9 / 5 + 32;
    }
}
