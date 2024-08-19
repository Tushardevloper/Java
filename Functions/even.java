package Functions;

import java.util.Scanner;

public class even {
    public static void evennumber(int n){
        if (n%2==0) {
            System.out.println("Even Number");
        }

        else{
            System.out.println("not an even number");
        }
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        evennumber(n);
    }
}
