//String replace with 

class ReplaceWith {
    public static void main(String args[]) {
        String s = "Hello";

        //Replace with
        //System.out.println(s.replace("Hello", "Java"));

        //To upper-case letters
        //System.out.println(s.toUpperCase());

        //to find char
        //System.out.println(s.charAt(3));

        //Length 
        //System.out.println(s.length());

        //Append string
        StringBuffer sb1 = new StringBuffer("Good ");
        StringBuffer sb2 = new StringBuffer("Morning");
        //System.out.println(sb1.append("Evening"));
        System.out.println(sb1.append(sb2));
    }
}