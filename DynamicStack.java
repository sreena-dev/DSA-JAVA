class StackFunCtions {
    //initial size
    int capacity=2;
    int arr[]=new int[capacity];
    int top=0;


    public void push(int data){

        //condition checking when the size of the array is equal to the capacity
        //then yiu need to increase the size of the array using the expand function
        if(size()==capacity)
            expandSize();  //fuunction to expand
        //it is like as usual but in else it not working
        arr[top]=data; 
        top++; 
              
    }

    private void expandSize(){
        int len=size();
        //declaring a new arrray of the size cap*2 that is twice the capacity
        int expArr[]=new int[capacity*2];

        //one way to copy the array element from one to another

        //arraycopy function takes 5 parameters namely 
        // source position , source start position ,destination array ,
        //des position's startig index (from which index the destination index should start), how many elemennt to be copied
        System.arraycopy(arr, 0,expArr, 0 , len);
        arr=expArr;  // assigning the new array to the old array name 
        capacity=capacity*2;  //initially declared that the array size is the cap *2 for that array name now ingeneral declare

        //another WAY TO COPY ARRAY ELEMENT
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=expArr[i];
        //     //System.out.println("Expanded "+expArr[i]);
        // }
        // arr=expArr;
        // capacity=capacity*2;
    }
    
    public int size(){
        return top;
    }
    
    public void peek(){
        System.out.println("Peek Elem is "+arr[top-1]);
    }

    public void pop(){
        top--;
        int removedElem=arr[top];
        arr[top]=0;
        shrink();
        System.out.println("Removed elemm is "+removedElem);
    }
    public void shrink(){ 
        int len=size();
        if(len<=(capacity/2)/2) //to find 1/4th of an array
            capacity =capacity/2;

        int newPopStack[] =new int[capacity];
        System.arraycopy(arr, 0, newPopStack, 0, len);
        arr=newPopStack;
    }

    public void show(){
        for(int i=0;i<arr.length;i++){
            System.out.println("Elem "+i+" "+ arr[i]);
        }
    }

    public void isEmpty(){
        if(top==0){
            System.out.println("Empty");
        }
        else{
            System.out.println("Size of the stack "+top);
        }
    }   
}

public class DynamicStack{
    public static void main(String[] args) {
        StackFunCtions i=new StackFunCtions();
        i.push(5);
        i.push(7);
        i.push(8);
        i.push(89);
        i.push(88);
        i.push(81);
        i.push(85);
        i.pop();
        i.pop();
        i.pop();
        i.pop();
        i.pop();
        //i.peek();
        i.show();
        //i.isEmpty();
    }
}