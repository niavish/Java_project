
//Write a program to create a longest palindromic substring from a string 2024

import java.util.Scanner;

public class LongestpPalindromic {

    public static String longestPalindrom(String s) {
        int start =0, end =0;
        for (int i =0;i<s.length();i++) {
            int len1 = expendFromCentre(s,i,i+1);
            System.out.println("len 1 : "+len1);
            int len2 = expendFromCentre(s,i,i);
            System.out.println("len 2 : "+len2);
            int len = Math.max(len1, len2);
            System.out.println("len :"+len);
            if(end-start<len) {
                start = i-(len-1)/2;
                end = i+(len+1)/2;
                System.out.println("start :"+start+" "+"end :"+end);
            }
        }
        System.out.println(s.substring(start, end));
        return s.substring(start, end);
    }


    //
    static int expendFromCentre(String s, int i, int j) {
        while(i>=0 && j<s.length() && s.charAt(i) == s.charAt(j)) {
            System.out.println("i :"+s.charAt(i)+ " "+ "j :"+s.charAt(j));
            i--;
            j++;
        }
        return j-i-1;
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        System.out.println("Longest palindrom : " + longestPalindrom(s));

    }
    
}
