package Exponential;

import java.util.Scanner;

public class Exponential {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the base value :");
        int base = sc.nextInt();

        System.out.println("Enter the power value");
        int power = sc.nextInt();

        System.out.println("The value is "+ pow(base, power));
        
    }

    public static int pow(int num,int power) {
        return (int) Math.pow(num, power);
    }
    
}
