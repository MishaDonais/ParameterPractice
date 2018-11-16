/*
 * This progam was made by Misha Donais
 * On November 15th 2018
 * To perform various calculations
 */

package parameterspractice;

//Imports
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author midon7419
 */
public class ParametersPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner
        Scanner keyedInput = new Scanner(System.in);
        //Decimal format
        DecimalFormat x = new DecimalFormat("###.##");

        //Variables
        int menuSelection = 0;

        //Initial message
        System.out.println("Enter a number to select an operation to perform");
        System.out.println("---------------");
        System.out.println("1 -- Triple a number");
        System.out.println("2 -- Calculate a number to an exponent");
        System.out.println("3 -- Divide a first number by a second number");
        System.out.println("4 -- Finds the largest of two numbers");
        System.out.println("5 -- Finds the smallest of two numbers");
        System.out.println("6 -- Finds the cube root of a number");
        System.out.println("7 -- Rounds a decimal to the nearest integer");
        System.out.println("8 -- Converts an angle in degrees to radians");
        System.out.println("9 -- Converts an angle in radians to degrees");
        System.out.println("10 -- Finds the average of five numbers");
        System.out.println("---------------");
        
        //Selection of calculations
        menuSelection = keyedInput.nextInt();
        
        if (menuSelection == 1) {
            System.out.println("Enter a number to be tripled");
            double testNumberOne = keyedInput.nextInt();
            System.out.println("This number tripled is: " + triple(testNumberOne));
        }
        if (menuSelection == 2) {
            System.out.println("Enter a base");
            double base = keyedInput.nextInt();
            System.out.println("Enter an exponent");
            double exponent = keyedInput.nextInt();
            System.out.println("This base to this exponent is: " + power(base, exponent));
        }
        if (menuSelection == 3) {
            System.out.println("Enter a number");
            double number1 = keyedInput.nextInt();
            System.out.println("Enter a number to fivide the first number by");
            double number2 = keyedInput.nextInt();
            System.out.println("The quotient of this division is: " + x.format(division(number1, number2))); 
        }
        if (menuSelection == 4) {
            System.out.println("Input two different numbers");
            int number1 = keyedInput.nextInt();
            int number2 = keyedInput.nextInt();
            System.out.println("The larger of these two numbers is: " + (maximum(number1, number2)));
        }
        if (menuSelection == 5) {
            System.out.println("Input two different numbers");
            int number1 = keyedInput.nextInt();
            int number2 = keyedInput.nextInt();
            System.out.println("The smaller of these two numbers is: " + (minimum(number1, number2)));
        }
        if (menuSelection == 6) {
            System.out.println("Input a number, and the system will return its cube root");
            int number1 = keyedInput.nextInt();
            System.out.println("The cube root of this number is: " + (x.format(cubeRoot(number1))));
        }
        if (menuSelection == 7) {
            System.out.println("Input a number to be rounded");
            double number1 = keyedInput.nextDouble();
            System.out.println("This number rounded to the nearest integer is: " + round(number1));
        }
        if (menuSelection == 8) {
            System.out.println("Input an angle in degrees to be converted to radians");
            double number1 = keyedInput.nextDouble();
            System.out.println("This angle in radians is: " + toRadians(number1) + " radians");
        }
        if (menuSelection == 9) {
            System.out.println("Input an angle in radians to be converted to degrees");
            double number1 = keyedInput.nextDouble();
            System.out.println("This angle in degrees is: " + toDegrees(number1) + " degrees");
        }
        if (menuSelection == 10) {
            System.out.println("Input five numbers to have averaged");
            double number1 = keyedInput.nextInt();
            double number2 = keyedInput.nextInt();
            double number3 = keyedInput.nextInt();
            double number4 = keyedInput.nextInt();
            double number5 = keyedInput.nextInt();
            System.out.println("The average of these numbers is " + average(number1, number2, number3, number4, number5));
        }
    }
    public static double triple(double numberOne){
        double numberTwo = numberOne * 3;
        return (numberTwo);
    }
    public static double power(double base, double exponent){
        double result = Math.pow(base, exponent);
        return result;
    }
    public static double division(double number1, double number2){
        double result = number1/number2;
        return result;
    }
    public static int maximum(int number1, int number2){
        int result = Math.max(number1, number2);
        return result;
    }
    public static int minimum(int number1, int number2){
        int result = Math.min(number1, number2);
        return result;
    }
    public static double cubeRoot(int number1){
        double result = Math.cbrt(number1);
        return result;
    }
    public static double round(double number1){
        double result = Math.round(number1);
        return result;
    }
    public static double toRadians(double number1){
        double result = Math.toRadians(number1);
        return result;
    }
    public static double toDegrees(double number1){
        double result = Math.toDegrees(number1);
        return result;
    }
    public static double average(double number1, double number2, double number3, double number4, double number5){
        double result = (number1+number2+number3+number4+number5)/5;
        return result;
    }
}
