package edu.handong.csee.java.hw3;

/**
 * 간단한 계산기 class 연산자 숫자 숫자 입력을 받아서 사용합니다.
 * 
 * @author ChaerinPark
 * 
 */
public class SimpleCalculator {
    public static void main(String[] args) {
        String operator = args[0];

        Calculator calculator = new Calculator();

        if (operator.equals("+")) {
            calculator.sum(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        } else if (operator.equals("-")) {
            calculator.subtract(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        } else if (operator.equals("/")) {
            calculator.divide(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        } else if (operator.equals("X")) {
            calculator.multiply(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        } else if (operator.equals("++")) {
            calculator.totalSum(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        } else if (operator.equals("<<") || operator.equals(">>") || operator.equals(">>>")) {
            calculator.shift(operator, Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        } else if (operator.equals("%")) {
            calculator.remainder(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        } else {
            System.out.println("Error: wrong operator");
        }

    }
}