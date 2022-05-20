package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

//        Calculator calculator = new Calculator();
//
//        System.out.println(calculator.add(5,2));
//        System.out.println(calculator.minus(5,2));
//        System.out.println(calculator.divide(5,2));
//        System.out.println(calculator.multiply(5,2));
//        System.out.println(calculator.faculty(5));

        // only error gets printed (info doesn't)
        logger.error("Is is an error logger.");
        logger.info("It is an info logger.");



    }
}
