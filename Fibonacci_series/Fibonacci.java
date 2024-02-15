import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Fibonacci series  : 0,1,1,2,3,5,8,13,21,34,55,....
        System.out.print("How many fiboannci numbers you want : ");
        int num = sc.nextInt();
        int fibo_pre = 0, fibo = 1, sum = 0;

        for(int i=0; i<num; i++) {
            System.out.println(i + " "+ fibo_pre);
            sum = fibo + fibo_pre;
            fibo_pre = fibo;
            fibo = sum;
        }
    }
}