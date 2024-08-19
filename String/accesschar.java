package String;

public class accesschar {
    public static void main(String[] args) {
        String name1 = "Tushar";
        String name2 = "Prajapat";

        String fullName = name1 +" "+ name2;

        System.out.println(fullName);

        for(int i = 0;i<fullName.length();i++){
        System.out.println("Char of Strings are:- "+fullName.charAt(i));
        }
    }
}
