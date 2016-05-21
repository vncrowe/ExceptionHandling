/**
 * Created by veronicacrowe on 5/20/16.
 */
public class Calculator {


    public static int add(int value1, int value2) {
        return value1 + value2; //sum values

    }

    public static int subtract(int value1, int value2) {
        return value1 - value2; //subtract values

    }

    public static int multiply(int value1, int value2) {
        return value1 * value2; //multiply values

    }

    public static int divide(int value1, int value2) throws DivisionByZeroException {
        if (value1 == 0 || value2 == 0){
            throw new DivisionByZeroException();
        }
        return value1 / value2; //divide values

    }

    public static double squareRoot(double value1) throws ComplexNumberException {
       if (value1 < 1){
           throw new ComplexNumberException();
       }

           return Math.sqrt(value1);


    }

}