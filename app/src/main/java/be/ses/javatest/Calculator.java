package be.ses.javatest;

public class Calculator {

    public float divide(Float x, Float y){
        if(y==0){
            throw new ArithmeticException("/ by zero");
        }
        return x/y;
    }

    public Double squareRoot(Float x){
        if(x < 0){
            throw new ArithmeticException("Root smaller than zero");
        }
        if(x == 0){
            throw new ArithmeticException("Root of zero");
        }
        return Math.sqrt(x.doubleValue());
    }
}
