package Recursion;

import java.util.Scanner;

public class naturalNumb {
    public static void printnum(int n) {
        if (n==6) {
            return;
        }
        System.out.println(n);
        printnum(n+1);
        
    }
    public static void main(String[] args) {
        System.out.println("Enter number till where you want to print:- ");
        //Scanner sc = new Scanner(System.in);
        int n = 1;
        //sc.nextInt();

        printnum(n);
    }
}
