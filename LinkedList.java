class NodeType{
    int data;
    NodeType next;
}

class InsertNode{
    //head is of type node
    NodeType head;

    public void insert(int data){
        NodeType nodeObj=new NodeType();
        nodeObj.data=data;
        nodeObj.next=null;

        //inserting at end
        if(head==null){
            //calling the obj is like calling the mehods, variables declared inside that class where the obj is created
            head=nodeObj; //calling variable (object) references the variables referencing to that object  
        }

        //when you have no elem
        else {
            //creating a node as frst node incase of empty
            NodeType n=head;
            while(n.next!=null){
                n=n.next;
            }
            n.next=nodeObj;//remember that (node) is the obj that is created to for the Node classs that is the class having heead and next
        }
    }

    public void insertAtStart(int data){
        NodeType node=new NodeType();
        node.data=data;
        //node.next=null;
        node.next=head;//head is of node type that is having a head and a next 
        //look closely bro its like swapping 
        head=node;
    }

    public void insertAtMiddle(int index,int data){
        NodeType node =new NodeType();
        node.data=data;
        node.next=null;
        //new node is created 
        NodeType n=head;
        if(index==0){
            insertAtStart(data);
        }

        else{
        for(int i=0;i<index-1;i++){
            n=n.next;
        }
        //address of the node is assigned to the address of the new node n 
        node.next=n.next;
        //new node's next is pointed to node class's object so that the data and next is considered
        n.next=node;
        }
    }


    public void delete(int index){

        NodeType n=head;
        //temp node to store address
        NodeType n1=null;

        if(index==0){
            head=head.next;
        }
        // 2 itathum surprise avanda it just modified according to the loop so cheitho 
        for(int i=0;i<index-2;i++){
            n=n.next;
        }
        //this part is more over like swapping 
        n1=n.next;
        n.next=n1.next;
        //to completely delete element in that index 
        //System.out.println("deleted value : " + n.data); //second deleted elem in not printing properly
        n=null;
    }

    public void show(){
        NodeType n=head;
        while(n.next!=null){
            System.out.print(" "+n.data);
            n=n.next;
        }
        //to print the last one elem because there is no not equal to and equal to :)
        System.out.print(" "+n.data);
        System.out.println();
    }
    
}

public class LinkedList {
    public static void main(String[] args) {
        InsertNode i=new InsertNode();
        i.insert(5);
        i.insert(6);
        i.insert(7);
        i.insert(9);
        i.insert(12);
        i.insert(90);

        i.insertAtStart(3);

        i.show();

        i.insertAtMiddle(3, 13);
        i.show();

        i.delete(0);
        i.show();
        i.delete(3);

        i.show();
        
    }
}
