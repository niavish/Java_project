package java_calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("------- CALCULATOR -----");
        System.out.print("Enter two numbers :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Choose any operator (+,-,*,%,/)");
        char operator = sc.next().charAt(0);
        double result = 0.0;

        switch(operator) {
            case '+' :
            result = num1 + num2;
            break;

            case '-' :
            result = num1 - num2;
            break;

            case '*' : 
            result = num1 *num2;
            break;

            case '%' :
            result = num1 % num2;
            break;

            case '/' :
            result = num1/num2;
            break;

            default :
            System.out.println("Invalid opeartor choice");
            break;
        }
        System.out.println("Result : " + num1 +" "+ operator+ " "+ num2+ " = "+result);
    }
    
}
