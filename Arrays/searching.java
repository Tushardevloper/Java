package Arrays;

import java.util.Scanner;

public class searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int search;
        System.out.println("How many numbers you want to store?");
        n =sc.nextInt();
        int arr[] = new int[n];

        //System.out.println("Enter " + n + " numbers:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

        System.out.println("Which number index you want to search?");
        search = sc.nextInt();

        for(int i= 0;i<n;i++){
            if (search==arr[i]) {
                System.out.println(search+"is at index"+i);
            }
        }
    }
}
