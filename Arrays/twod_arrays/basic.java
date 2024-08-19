package Arrays.twod_arrays;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of rows and col:- ");
        int row = sc.nextInt();
        int col =sc.nextInt();

        
        int[][] number = new int[row][col];
        
        System.out.println("Enter Values:-");
        //input
        for(int i = 0; i<row;i++){
            for(int j=0;j<col;j++){
                number[i][j]=sc.nextInt();
            }
        }

        //output
        System.out.println("Output:- ");
        for(int i=0;i<row;i++){
            for(int j = 0;j<col;j++){
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }

        int x;
        System.out.println("Enter element to search");
        x = sc.nextInt();

        for(int i=0;i<row;i++){
            for(int j = 0;j<col;j++){
                if (x==number[i][j]) {
                    System.out.print("Number "+x+" is found at ("+i+","+j+")");
                }
                
            }
            System.out.println();
        }
    }
}
