package Recursion;

import java.util.Scanner;

public class printsum {
    public static void printSum(int i, int n, int sum) {
        if (n==i) {
            sum+=i;
            System.out.println(sum);
            return;
        }

        sum+=i;
        printSum(i+1, n, sum);
    }

    public static void main(String[] args) {
        System.out.println("Enter number to print the sum of:- ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printSum(1,n,0);
    }
}
