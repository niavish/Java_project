public class SeparateString {
    public static void main(String[] args) {

        //Method 1:
        // String s = "Hello Java";
        // String [] words = s.split(" ");
        // String reverse = "";
        // for(String w:words) //Hello
        // { 
        //     String reverseWords="";;
        //     for(int i=w.length()-1; i>=0;i--) {
        //         reverseWords = reverseWords+w.charAt(i);
        //     }

        //     reverse= reverse + reverseWords + " ";
        //     //System.out.println(reverse);
        // }
        // System.out.println(reverse);


        //Method 2: 
        String s = "Welcome to String Reverse";
        String[] reverse = s.split(" ");
        String reverseString= "";

        for(String w:reverse){
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();

            reverseString = reverseString + sb +" ";
            //System.out.println(reverseString);
        }
        System.out.println(reverseString);
    }
    
}
