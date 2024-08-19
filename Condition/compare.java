package Condition;
import java.util.*;
public class compare {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a==b) {
            System.out.println("equal");
        }

        else if (a>b) {
            System.out.println("b is Greater");
        }

        else
        {
            System.out.println("a is lesser");
        }
    }
}
