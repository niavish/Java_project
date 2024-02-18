
//Count of occurrence of characters in String

class CountOccurence {
    public static void main(String[] args) {
        String s = "Count Occurence";
        int length = s.length();
        //String sb= s.replace("c","");
        String sb= s.toLowerCase();
        int sbLength= sb.replace("o", "").length();
        int count = length - sbLength;
        System.out.println("Total Occurence : " + count);
    }
}