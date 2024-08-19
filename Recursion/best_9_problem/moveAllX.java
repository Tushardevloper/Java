package Recursion.best_9_problem;


public class moveAllX {

    public static void moveall_x(String str,int index,int count,String newString){
        
        if (index==str.length()) {
            
            for(int i =0;i<count;i++){
                newString+='x';
            }System.out.println(newString);
            return;
        }
        
        char currchar = str.charAt(index);
        if (currchar=='x') {
            moveall_x(str, index+1, count+1, newString);
        }

        else
        {
            newString+=currchar;
            moveall_x(str, index+1, count, newString);
        }
    }

    public static void main(String[] args) {
        String str = "axbcxxd";
        moveall_x(str,0,0,"");
    }
}
