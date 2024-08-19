package onclass;

import java.util.Scanner;

public class ScannerExample{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Name,Roll No,Marks,Grade");

        String name=sc.nextLine();
        int RollNo=sc.nextInt();
        double Marks=sc.nextDouble();
        char Grade=sc.next().charAt(0);

        System.out.println("Name:"+name);          //used to read line
        System.out.println("Gender:"+RollNo);      //used to read int
        System.out.println("Marks:"+Marks);        //used to read double
        System.out.println("Grade:"+Grade);        //used to read till space

        sc.close();
    }
}