package Functions;

import java.util.Scanner;

public class table {
    public static void printtable(int n){
        int table;
        for(int i=0;i<=10;i++){
            table=n*i;
            System.out.println(table);
        }

    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();

        printtable(n);
    }
}
