//remember its divide and conqueror method 

public class MergeSort {

        public static void mergeSort_Division_Occouring_Function(int[] arr,int l, int r){

            if(l<r){   
                int mid=(l+r)/2;
                //called twice because the array is divided into 2 parts always
                //all these are recursive call brooo
                mergeSort_Division_Occouring_Function(arr, l, mid);    // frst part 
                mergeSort_Division_Occouring_Function(arr,mid+1,r);  // second part

                conquer_merge(arr,l,mid,r);
            }
        }
        
        public static void conquer_merge(int[] arr,int l,int mid,int r){

            //in general n1=(..) because total len - 0(initial len) + 1 for index 
            int n1=mid - l + 1; 
            // n2 =(..) total len = r that is the last elem - mid gives the len of the secondly divided array
            int n2=r-mid;

            //this is to create a new divided array--> that is the left array and the right array
            ///alwaya remember the array is divided into 2 parts what no matter what ever the array size is
            int[] lArr=new int[n1];
            int[] rArr=new int[n2];

            //System.out.println(l);

            //traverse through the left array and copying the elem to the left array
            //l+x because for frst iteration index for 10 total elem mid=5 then index=0,1,2,3,4 next mid=2 then index=0,1,2
            //so and so fourth
            for(int x=0;x<n1;x++){
                lArr[x]=arr[x+l];
            }

            //similarly in right side total elem =10 mid=5 then index=6,7,8,9; the mid=2 then index=8,9..
            for(int x=0;x<n2;x++){
                rArr[x]=arr[mid+1+x];
            }

            int i=0;
            int j=0;
            int k=l; //l because the merge should starrt from the l that is 0th position 

            //it is the place where the two array are joined into the same array based on the condition
            while(i<n1 && j<n2){
                if(lArr[i]<rArr[j]){
                    arr[k]=lArr[i];
                    i++;  
                }
                else{
                    arr[k]=rArr[j];
                    j++;
                }
                k++;
            }
            
//to ensure that every elements are copied in the new array
            while(i<n1){
                arr[k]=lArr[i];
                i++;
                k++;
            }
            while(j<n2){
                arr[k]=rArr[j];
                j++;
                k++;
            }
            
        }

        public static void main(String[] args) {
            int[] arr={7,3,5,8,2,90,99};
            mergeSort_Division_Occouring_Function(arr, 0, arr.length-1);

            for(int n: arr){
                System.out.print(n+ " ");
            }
        }
}

