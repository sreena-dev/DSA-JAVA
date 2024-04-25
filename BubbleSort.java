public class BubbleSort {
    public static void main(String[] args) {
        int i,j;
        int temp=0;
        int[] arr={8,4,0,3,5,1,6};
        
        for(i=0;i<arr.length;i++){
            for(j=0;j<(arr.length)-i-1;j++){ //will be fine with len-1 but for more effeciency len-i-1
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            //each step showing how the iteration and swap is done 
            System.out.println(" ");
            for(int a:arr){
                System.out.print(a + " ");
            }
        }
        System.out.println("<-- SORTED ARRAY ");
        
    }
}

//TIME COMPLEXITY IS O(n) because total no. of iteration or no. of times
//the for loop runs == the no of elems in the array 