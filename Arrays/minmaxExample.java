package Arrays;

import java.util.Scanner;

public class minmaxExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int n;
    

        System.out.println("Enter how many number you want to print?");
        n=sc.nextInt();
        int arr[]= new int[n];

        System.out.println("Enter "+n+" Numbers:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i =0;i<n;i++){
            System.out.println("Your entered values are:-"+arr[i]);
        }
        
        for(int i =0;i<n;i++){

            if (arr[i]>max) {
                max=arr[i];
                //System.out.println(arr[i]+"Is a Greator number");
            }

            else if (arr[i]<min) {
                min=arr[i];
                //System.out.println(arr[i]+"Is a Smaller number");
            }
        }
        
        System.out.println("Max VAlue = "+max);
        System.out.println("Min Value = "+min);
    }
    
}
