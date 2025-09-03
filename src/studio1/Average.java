package studio1;

import java.util.Scanner;

public class Average {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("You smell bad:");
    int n1 = in.nextInt();
    int n2 = in.nextInt();

    System.out.println("Average: " + (n1 + n2) / 2.0);

    }
}
