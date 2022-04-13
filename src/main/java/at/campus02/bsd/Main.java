package at.campus02.bsd;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println(calculator.add(5,2));
        System.out.println(calculator.minus(5,2));
        System.out.println(calculator.divide(5,2));
        System.out.println(calculator.multiply(5,2));
    }
}
