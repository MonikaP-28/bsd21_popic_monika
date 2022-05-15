package at.campus02.bsd;

public class Calculator {

    public double add(double number1, double number2){
        double value = number1+number2;
        return value;
    }

    public double minus(double number1, double number2){
        double value = number1-number2;
        return value;
    }

    public double divide(double number1, double number2){
        double value = number1/number2;
        return value;
    }

    public double multiply(double number1, double number2){
        double value = number1*number2;
        return value;
    }

    public int faculty(int num){

        if(num < 1){
            return 0;
        }

        int value = 1;
        for (int i = 2; i <= num; i++){
            value *= i;
        }
        return value;
    }
}
