package Methods;

import java.util.Scanner;

public class Method_example {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number :");
        int number1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int number2 = sc.nextInt();
        
        show(number1, number2);
        int  add = sum(number1,number2);

        int min_num = minimum(number1,number2);
    }



    //display numbers 
   public static void show(int num1, int num2) {
        System.out.println("You have entered two numbers : "+ num1 + " "+ num2);
    }

    //retrun the sum of two numbers
    public static int sum(int num1, int num2) {
        int sum =0;
        sum = num1 + num2;
        System.out.println("Sum of numbers : "+ sum);
        return sum;
    }

    //return the minimum of two numbers
    public static int minimum(int num1, int num2) {
        if(num1>num2) { 
        System.out.println("Minimum number :" + num2);
        return num2;    
        }
        else {
      System.out.println("Minimum number : "+ num1);
       return num1;
        }


    }
    
}
