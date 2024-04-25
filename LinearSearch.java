class Ls{
    public void linearSearchMethod(int n,int[] arr, int target){
        boolean found=false;
        for(int i=0;i<n-1;i++){
            if (arr[i]==target){
                System.out.println("Target elem " + target + " is found in index " +  (i+1) );
                found=true;
                break;
            }
        }
        if(!found){
        System.out.println(-1);
        } 
    }
    
}
public class LinearSearch{
    public static void main(String[] args) {
        int[] arr={1,4,3,5};
        Ls oop=new Ls();
        oop.linearSearchMethod(4, arr, 4);
    }
}

/*  SEARCHING/reading :- array_name[constant]= O(constant)
    Best Case: When the element is found in the very first iteration, the best-case time complexity is O(1).
    Worst Case: An unsuccessful search that doesn’t find the key value performs n iterations, 
    resulting in a worst-case time complexity of O(n). 
*/