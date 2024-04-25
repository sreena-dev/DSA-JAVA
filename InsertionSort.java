public class InsertionSort {
    public static void main(String[] args) {
        int i,j,key;
        int[] arr={5,9,2,1,4,7};
        for(i=1;i<arr.length;i++){
            key=arr[i];
            j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
            for(int n: arr){
                System.out.print(" "+ n);
            }
            System.out.println();
        }
        for(int n: arr){
            System.out.print(" "+ n);
        }
    }
}

/* TIME COMPLEXITY 
    Best Case: O(N)
    Average Case: O(N^2)
    Worst Case: O(N^2)
 */