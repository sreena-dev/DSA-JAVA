public class SelectionSort {
    public static void main(String[] args) {
        int i,j;
        int temp=0;
        int minIndex=-1;
        int size=6;
        int[] arr={0,5,1,9,4,7};

        for(i=0;i<size-1;i++){
            minIndex=i;
            for(j=i+1;j<size;j++)
            {
                if(arr[minIndex] < arr[j]){
                    minIndex=j;

                System.out.println();
                for(int n: arr){
                    System.out.print(n+" ");
                }

                }
                
            //its like a else part dude
            temp=arr[minIndex];
            arr[minIndex]=arr[j];
            arr[j]=temp;
            }
              
        }
        for(int n: arr){
            System.out.print(n+" ");
        }

    }
}


/*
 * find the smallest elem in the array and swap it to frst pos then find the next smallest then swap 
 * ita again and continue till end is reached
 * ignore the frst elem in frst iter , sec elem in sec iter beacus it is sorted
 */