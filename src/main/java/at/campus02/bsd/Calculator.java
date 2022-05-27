package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static Logger logger = LogManager.getLogger();

    /**
     * Adds two numbers
     * @param number1 first number
     * @param number2 second number
     * @return Value of first number added with the second number
     */
    public double add(double number1, double number2) {
        double value = number1 + number2;
        logger.debug(number1 + "+" + number2);
        return value;
    }

    /**
     * Subtracts two numbers
     * @param number1 first number
     * @param number2 second number
     * @return Value of first number subtracted with the second number
     */
    public double minus(double number1, double number2) {
        double value = number1 - number2;
        logger.debug(number1 + "-" + number2);
        return value;
    }

    /**
     * Divides two numbers
     * @param number1 first number
     * @param number2 second number
     * @return Value of first number divided with the second number
     */
    public double divide(double number1, double number2) {
        double value = number1 / number2;
        logger.debug(number1 + "/" + number2);
        if(number2 == 0){
            logger.error(number2 + "is not allowed to be zero");
            throw new ArithmeticException();
        }
        return value;
    }

    /**
     * Multiplies two numbers
     * @param number1 first number
     * @param number2 second number
     * @return Value of first number multiplied with the second number
     */
    public double multiply(double number1, double number2) {
        double value = number1 * number2;
        logger.debug(number1 + "*" + number2);
        return value;
    }

    /**
     *
     * @param num is the number that is used for the faculty
     * @return the faculty of the number or zero
     * if the num is smaller than 1 it returns 0
     */
    public int faculty(int num) {
        logger.debug("Faculty of number" + num);
        if (num < 1) {
            return 0;
        }

        int value = 1;
        for (int i = 2; i <= num; i++) {
            value *= i;
        }
        return value;
    }
}
