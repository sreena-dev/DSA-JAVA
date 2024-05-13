class StackFunCtions {

    int arr[]=new int[3];
    int top=0;

    public void push(int data){
        if(top==3){
            System.out.println("The stack is full");
        }
        else{
            arr[top]=data;
            top++;
        }
    }

    public void peek(){
        System.out.println("Peek Elem is "+arr[top-1]);
    }

    public void pop(){
        top--;
        int removedElem=arr[top];
        arr[top]=0;
        System.out.println("Removed elemm is "+removedElem);
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

public class Stack{
    public static void main(String[] args) {
        StackFunCtions i=new StackFunCtions();
        i.push(5);
        i.push(7);
        i.push(8);
        i.pop();
        i.pop();
        i.peek();
        i.show();
        i.isEmpty();

    }
}
