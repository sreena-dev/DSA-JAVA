public class QuickSort {
    public static void main(String[] args) {
        int[] arr={3,0,9,1};
        System.out.println(arr.length);
        QS1.QuickSortFunc(arr,0,arr.length-1);//--> -1 is purely for index, high and low are index

        for(int n: arr){
            System.out.print(" "+ n);
        }
        
    }
}

class QS1{

    public static void QuickSortFunc(int[] arr,int low,int high){
        
        if(low<high){
            int pi=partition(arr, low, high);
            //thet i+1 will reach here
            QuickSortFunc(arr,0,pi-1); //--> each is broken down to 2 parts so call 1 , call 2 ..
            QuickSortFunc(arr,pi+1,high);
        }
    }

    private static int partition(int[] arr,int low,int high)
    {
        int i,j,temp=0;
        int pivot=arr[high];
        //it will be refering some where outside untill the change
        i=low-1;
        for(j=low;j<arr.length-1;j++){
            if(arr[j]<pivot){ //--> if arr[j]> pivot that is the else condition then just do nothing 
                //since all the elems are checked we can ensure that it is gng to be in the frst position : in genera
                //finding the smallest then swaping it 
                i++;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            //swap does not occour with the pivot rather occours with the next elem 
            // System.out.println();
            // for(int n:arr){
            //     System.out.print(n+" ");
            // }
        }
        //this is swapping the pivot to the (i+1)th elem
        //after that one loop is over then if you chech the elem is not sorted so increnent the value of i and also swap
        temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        //swapped value or sorted value comes out as (i+1) be it in last or frst
        return i+1;
    }

    
}
/*
 * Best Case: O(n log n)
   Average Case: O(n log n)
   Worst Case: O(n^2)
 */