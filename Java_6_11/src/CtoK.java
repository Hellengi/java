public class CtoK implements Convertable{
    @Override
    public double convert(double C) {
        return C + 273.15;
    }
}
