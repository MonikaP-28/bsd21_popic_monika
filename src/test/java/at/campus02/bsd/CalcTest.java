package at.campus02.bsd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalcTest {

    private Calculator c;

    /**
     * Creates a new object
     */
    @BeforeEach
    public void setup() {
        c = new Calculator();
    }

    double result;

    /**
     * prints the result of two numbers added to each other
     */
    @Test
    public void cAdd1() {
        Assertions.assertEquals(7, result = 4 + 3);
    }

    /**
     * number 1 is the first number that gets added and number 2 the second
     */
    @Test
    public void cAdd2() {
        Assertions.assertEquals(4 + 3, c.add(4, 3));
    }

    /**
     * prints the result of two subtracted numbers
     */
    @Test
    public void cMinus1() {
        Assertions.assertEquals(1, result = 3 - 2);
    }

    /**
     * the first number gets subtracted by the second number
     */
    @Test
    public void cMinus2() {
        Assertions.assertEquals(3 - 2, c.minus(3, 2));
    }

    /**
     * prints the result of two multiplied numbers
     */
    @Test
    public void cMultiply1() {
        Assertions.assertEquals(12, result = 4 * 3);
    }

    /**
     * the first number and the second number are getting multiplied
     */
    @Test
    public void cMultiply2() {
        Assertions.assertEquals(4 * 3, c.multiply(4, 3));
    }

    /**
     * prints the result of two divided numbers
     */
    @Test
    public void cDivision1() {
        Assertions.assertEquals(3, result = 6 / 2);
    }

    /**
     * the first number is getting divided by the second number
     */
    @Test
    public void cDivision2() {
        Assertions.assertEquals(6 / 2, c.divide(6, 2));
    }

    /**
     * Tests if the method divide works correctly when the second input is 0
     * @throws ArithmeticException
     */
    @Test
    void exceptionTest(){
        Assertions.assertThrows(ArithmeticException.class,()-> c.divide(5,0));
    }

    /**
     * Tests if the method faculty in class calculator works correctly by giving the pointer an
     * expected output and an actual output
     * if the number is negative or zero then the expected output is 0
     */
    @Test
    public void faculty1(){
        Assertions.assertEquals(120,c.faculty(5));
    }

    @Test
    public  void faculty2() {
        Assertions.assertEquals(0,c.faculty(-5));
    }

    @Test
    public void faculty3() {
        Assertions.assertEquals(720,c.faculty(6));
    }


}
