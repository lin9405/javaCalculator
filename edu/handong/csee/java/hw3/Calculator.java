package edu.handong.csee.java.hw3;

/**
 * 실제 계산 하는 class
 */
public class Calculator {

    /**
     * 더하기
     * 
     * @param a 첫번쨰 숫자
     * @param b 두번째 숫자
     */
    public void sum(int a, int b) {
        System.out.println(a + b);
    }

    /**
     * 빼기
     * 
     * @param a 첫번쨰 숫자
     * @param b 두번째 숫자
     */
    public void subtract(int a, int b) {
        System.out.println(a - b);
    }

    /**
     * 곱하기
     * 
     * @param a 첫번쨰 숫자
     * @param b 두번째 숫자
     */
    public void multiply(int a, int b) {
        System.out.println(a * b);
    }

    /**
     * 나누기
     * 
     * @param a 첫번쨰 숫자
     * @param b 두번째 숫자
     */
    public void divide(int a, int b) {
        double result = (double) a / b;
        if (b == 0) {
            System.out.println("Error: / by zero");
        } else {
            System.out.println(result);
        }
    }

    /**
     * remainder
     * 
     * @param a 첫번쨰 숫자
     * @param b 두번째 숫자
     */
    public void remainder(int a, int b) {
        System.out.println(a % b);
    }

    /**
     * 첫번째 숫자부터 두번째 숫자까지 더하기
     * 
     * @param a 첫번쨰 숫자
     * @param b 두번째 숫자
     */
    public void totalSum(int a, int b) {

        int sum = 0;

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        for (int i = a; i <= b; i++) {
            sum += i;

        }

        int c = ((b * (b + 1)) / 2) - ((a * (a - 1)) / 2);
        // System.out.println(String.valueOf(c));
        System.out.println(String.valueOf(sum));

    }

    /**
     * shift 사용하기
     * 
     * @param shitf 어떤 방향
     * @param a     첫번쨰 숫자
     * @param b     두번째 숫자
     */

    public void shift(String shitf, int a, int b) {
        if (shitf.equals("<<")) {
            a = a << b;
            System.out.println(a);
        } else if (shitf.equals(">>")) {
            a = a >> b;
            System.out.println(a);
        } else if (shitf.equals(">>>")) {
            a = a >>> b;
            System.out.println(a);
        }

    }
}