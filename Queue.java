public class Queue {

    int[] queue =new int[5];
    int front;
    int rear;
    int size;

    public void enQueue(int data){
        //do you know why is thus %5 added in there ? try finding out.. recall else scroll down
        queue[(rear+1)%5]=data;
        rear++;
        size++;
    }

    public void deQueue(){
        front=(front+1)%5;
        size--;
    }

    public void show(){
        for(int i=0;i<size;i++){
            System.out.print(queue[(i+front)%5]+" ");
        }
    }


    public void size(){
        System.out.println(size);
    }

    public void isEmpty(){
        if(size==0){
            System.out.println("Empty");
        }
        else{
            System.out.println("not empty");
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.enQueue(56);
        q.enQueue(57);
        q.enQueue(55);
        q.enQueue(54);
        q.enQueue(52);
        q.enQueue(52);
        q.enQueue(52);
        q.enQueue(52);
        q.enQueue(52);

        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();

        q.enQueue(54);
        q.enQueue(52);
        q.enQueue(54);
        q.enQueue(52);
        q.enQueue(54);
        q.enQueue(52);

        q.size();

        q.isEmpty();
        q.show();

    }
}

//all those %5 ia added becuase... 5 is the size of the array when you perform the modulo operation 
//you are just making the array dynamic :) consider you have an array of size 5 the indexes are 0,1,2,3,4
//now, when you dequeue it the array size is also reduced so , when you add 1 to the array index and perform modulo you get back the index
//there are 4 indexes you add 1 to each , when oth index is added with 1 = 1; then 1%5= 0 so frst index is obtained and repeated till 5
// it goes to 6,7 etc while 1 is added then the index will be rotation that is 0,1,2,3,4.. therby increases as the elements are added