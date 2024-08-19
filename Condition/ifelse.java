package Condition;
import java.util.*;

public class ifelse {
    public static void main(String [] ags){
        Scanner sc  = new Scanner(System.in);
        int age = sc.nextInt();
        
        if (age >18) {
            System.out.println("Adult");

        }

        else
        {
            System.out.println("Not Adult");
        }
    }
}
