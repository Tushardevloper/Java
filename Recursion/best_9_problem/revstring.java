package Recursion.best_9_problem;

public class revstring {
    public static void printrev(String str, int index) {
        System.out.println("lenght:- "+index);
        if (index ==0) {
            System.out.println(str.charAt(index));
            return;
        }
        System.out.println(str.charAt(index));
        printrev(str, index-1);
    }
    public static void main(String[] args) {
        String str = "abcd";
        printrev(str, str.length()-1);
    }
}