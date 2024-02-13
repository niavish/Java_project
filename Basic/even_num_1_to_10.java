package Basic;

import java.util.Scanner;

public class even_num_1_to_10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Even number from 1 to 10");

        for(int i= 1;i<=10;i++) {
            if(i%2==0)
            System.out.println(i);
        }
    }
    
}
