public class LLUsingJAva {
    private Node firstNode;
    private Node lastNode;

    public void insertFront(int val){
        
        Node newNode=new Node(val);
        if(firstNode==null){
            firstNode=newNode;
            lastNode=newNode;
        }else{
            Node curNode=firstNode;
            firstNode=newNode;
            newNode.nexNode=curNode;
        }
    }
    public void insertEnd(int val){
        Node newNode=new Node(val);
        if(firstNode==null){
            lastNode=newNode;
            firstNode=newNode;
        }else{
            Node curNode=lastNode;
            curNode.nexNode=newNode;
            lastNode=newNode;
        }
    }
    public void insertMid(int val,int position){
        Node newNode=new Node(val);
        if(firstNode==null){
            lastNode=newNode;
            firstNode=newNode;
        }else{
            int i=1;
            Node temp=firstNode;
            Node cuNode=temp;
            while(i<position && temp.nexNode!=null){
                cuNode=temp;
                temp=temp.nexNode;
                i++;
            }
            newNode.nexNode=cuNode.nexNode;
            cuNode.nexNode=newNode;
           
        }
    }
    public void display(){
        Node temp=firstNode;
        System.out.print(" [ ");
        while(temp.nexNode!=null){
            System.out.print(" "+temp.val+ " ,");
            temp=temp.nexNode;
        }
        System.out.println(temp.val+ " ]");
    }
}
