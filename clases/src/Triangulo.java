public class Triangulo {
    public static double perimetro;
    public static double ladoA;
    public static double ladoB;
    public static double ladoC;

    public static double perimetroTriangulo(){
        return perimetro + ladoA + ladoB + ladoC;
    }
    public static double perimetroTriangulo(double _ladoA, double _ladoB, double _ladoC){
        ladoA = _ladoA;
        ladoB = _ladoB;
        ladoC = _ladoC;

        return perimetro + ladoA + ladoB + ladoC;
    }


}
