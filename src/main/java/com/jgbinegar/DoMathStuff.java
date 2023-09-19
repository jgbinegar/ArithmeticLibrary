package com.jgbinegar;

/**
 * Each method takes in a {@linkplain Number} since the numbers being used may be of any type.
 * These method will take in {@linkplain Integer}, {@linkplain Double}, and any other Number value.
 */
public class DoMathStuff {


    /**
     *
     * @param a First number being included in this Arithmetic function.
     * @param b Second number being included in this Arithmetic function.
     * @return Number value of Numbers 'a' and 'b' being added together.
     */
    public static Double add(Number a, Number b) {
        return a.doubleValue() + b.doubleValue();
    }

    /**
     *
     * @param a First number being included in this Arithmetic function.
     * @param b Second number being included in this Arithmetic function.
     * @return Number value of Number 'b' being subtracted from 'a'.
     */
    public static Double subtract(Number a, Number b) {
        return a.doubleValue() - b.doubleValue();
    }

    /**
     *
     * @param a First number being included in this Arithmetic function.
     * @param b Second number being included in this Arithmetic function.
     * @return Number value of Number 'a' and 'b' being multiplied together.
     */
    public static Double multiply(Number a, Number b) {
        return a.doubleValue() * b.doubleValue();
    }

    /**
     *
     * @param numerator Number being divided into.
     * @param denominator Number being used to divide.
     * @return Value of 'a' being divided by 'b'.
     */
    public static Double divide(Number numerator, Number denominator) {
        return numerator.doubleValue() / denominator.doubleValue();
    }
}
