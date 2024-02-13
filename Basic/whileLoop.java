package Basic;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        //While loop
        // int i = 5;
        // while (i>0){
        //     System.out.println(i);
        //     i--;

        // }
        
        //Factorial of number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = sc.nextInt();
        
        int num2 = 1;

        while(num >0) { 
            num2= num *num2;
            num--;
        }
        System.out.println(num2);
    }
    
}
