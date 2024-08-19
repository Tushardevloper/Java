package Arrays;

import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How much marks you want to store?");
        int n= sc.nextInt();
        int marks[] = new int[n];

        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
            System.out.println("Marks of  "+(i+1)+ ":-"+marks[i]);
        }

        for(int i=0;i<n;i++){
            System.out.println("Marks of Student "+(i+1)+":"+marks[i]);
        }
    }
}
