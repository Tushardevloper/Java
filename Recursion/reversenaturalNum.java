package Recursion;

import java.util.Scanner;

public class reversenaturalNum {
    
    public static void printnum(int n){
        if (n==0) {
            return;
        }
        System.out.println(n);
        printnum(n-1);
    }
    
    public static void main(String[] args) {
        System.out.println("Enter numbber to print Natural number: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        printnum(n);
    }
}
