package Functions;

import java.util.Scanner;

public class printMyName {
    public static void printmyname(String name){
    System.out.println(name);
    return;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter Your Name:- ");
        String name = sc.next();

        
        printmyname(name);//function calling
    }
    
}
