public interface MathCalculable {
    double extend(double num, double pow);
    double module(double real, double imag);
    static double getPi(){
        return Math.PI;
    }
}
