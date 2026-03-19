package be.ses.javatest;

public class Doubler {
    public Float divide(Calculator calc, Float x, Float y){
        Float tussenResultaat = calc.divide(x, y);
        return 2*tussenResultaat;
    }
}
