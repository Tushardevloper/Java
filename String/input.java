package String;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        System.out.print("Enter Your String:- ");
        Scanner sc = new Scanner(System.in);
        String name1 = sc.next(); // taking 1st string as input
        sc.nextLine(); // new thing

        System.out.println("Half Name:- " + name1);

        System.out.print("Enter Your String Again to print Full name:- ");
        String name2 = sc.nextLine();

        System.out.println("Full Name:- " + name2);
    }
}
