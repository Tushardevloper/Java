package Functions;

import java.util.Scanner;

public class factorial {
    public static void printfactorial(int n){
        if (n<1) {
            System.out.println("Invalid Number");
            return;
        }
        
        int factorial =1;

        for(int i =n;i>=1;i--){
            factorial = factorial*i;
        }

        System.out.println(factorial);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printfactorial(n);
    }
}
