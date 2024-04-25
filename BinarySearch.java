/* BINARY SEARCH MEANS DIVIDE THE LIST OR THE ARRAY OF ELEMENT 
 INTO 2 PARTS AS THE NAME SUGGESTS 
*/
class Bs{
    public int binarySearchAlgo(int n, int[] arr,int target){
        int left=0;
        int right= n-1;
        int mid;

        while (left<=right){
            mid=(left+right)/2;

            if(arr[mid]==target){
                return mid;
            }

            else if(arr[mid]<target){
                left=mid+1;
            }

            else{  
                right=mid-1;       
            }
        }
        return -1;
    }
}

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,4,5};
        int[] arr2={1,5,7,8};
        Bs oop=new Bs();
        System.out.println(oop.binarySearchAlgo(4, arr, 5));
        Bs2 oop2=new Bs2();
        System.out.println(oop2.RecurssionBS(4,arr2,1,0,4));

    }

   
}

/* LOGICS :- in an array of elem to find the index of particular elem then, start= left , end = right
 * if the mid elem >target then left = mid+1 
 * if the mid elem < target then right = mid-1
 */

/*
 * TIME COMPLEXITY 
 * O(log n) for searching elem in the array explaination is in big o notation txt
 */

 //BINART SEARCH USING RECURSSION
class Bs2{
    public int RecurssionBS(int n,int[] arr2,int target,int left,int right){
        int mid;
        
        if(left<right){
            mid=(left + right)/2;
            if(arr2[mid]==target){ //<-- base case 
                return mid;
            }
            else if(arr2[mid]<target){
                return RecurssionBS(n,arr2,target,mid+1,right);
            }
            else{
                return RecurssionBS(n,arr2,target,left,mid-1);
            }
        }
        return -1;
    }
}