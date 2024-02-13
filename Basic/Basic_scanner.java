package Basic;

import java.util.Scanner;

public class Basic_scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter your roll number");
        int a = sc.nextInt();
        System.out.println("Enter your Name");
        String name = sc.next();

        System.out.println("Roll number : " + a + "Name : "+ name);
    }
    
}
