package Basic;

public class for_each_loop {
    public static void main(String[] args) {
        // using for each loop
        char[] letters = {'N', 'E', 'H', 'A'};
        for(char Iteam : letters)
        System.out.println(Iteam);


        //Integer Array
        //Sum of arrays number using for each loop

        int[] arr = {5,4,3,2};
       int  sum =0;
        for(int num : arr){
            sum+=num;
            //System.out.println(num);
        }
        System.out.println("Sum of arrays : " + sum);
    }
    
}
