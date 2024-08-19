package Recursion.best_9_problem;

public class isSorted {
    
    public static boolean checkSorted(int arr[],int index){
        if (index==arr.length-1) {
            return true;
        }
        
        else if (arr[index]<arr[index+1]) {
            return checkSorted(arr,index+1);
        }

        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5};
        System.out.println(checkSorted(arr,0));
    }
}

