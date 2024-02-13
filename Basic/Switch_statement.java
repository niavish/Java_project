package Basic;

import java.util.Scanner;

public class Switch_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day number of week: ");
        int dayNumber = sc.nextInt();
        String day;
        switch (dayNumber) {
            case 1:
            day = "Monday";
            break;
            case 2:
            day = "Tuesday";
            break;
            case 3:
            day = "Wednesday";
            break;
            case 4:
            day ="Thrusday";
            break;
            case 5:
            day = "Friday";
            break;
            case 6:
            day = "Saturday";
            break;
            case 7:
            day = "Sunday";
            break;

            default:
            day = "Invalid day choice ";
            break;

        
    }
    System.out.println("Day : "+ day);
    sc.close();
}
}
