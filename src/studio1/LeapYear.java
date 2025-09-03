package studio1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Year:");
        int year = in.nextInt();
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        String modifier = " ";
        if (!isLeapYear){
            modifier = " not ";
        }
        System.out.println(year + " is" + modifier + "a leap year."); 
        //We made the code fancier
    }

}
