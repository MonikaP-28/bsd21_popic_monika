package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static Logger logger = LogManager.getLogger();

    public double add(double number1, double number2) {
        double value = number1 + number2;
        logger.debug(number1 + "+" + number2);
        return value;
    }

    public double minus(double number1, double number2) {
        double value = number1 - number2;
        logger.debug(number1 + "-" + number2);
        return value;
    }

    public double divide(double number1, double number2) {
        double value = number1 / number2;
        logger.debug(number1 + "/" + number2);
        if(number2 == 0){
            logger.error(number2 + "is not allowed to be zero");
            throw new ArithmeticException();
        }
        return value;
    }

    public double multiply(double number1, double number2) {
        double value = number1 * number2;
        logger.debug(number1 + "*" + number2);
        return value;
    }

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
