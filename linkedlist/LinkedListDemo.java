public class LinkedListDemo{
    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    void AddAtHead(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    void deleteHead(){       
        head = head.next;
    }

    int findLength(){
        int length = 0;
        Node temp = head;
        while(temp!=null){
            length+=1;
            temp=temp.next;
        }
        return length;
    }
    boolean isPresent(int num){
        Node temp = head;
        while(temp!=null){
            if(temp.data == num){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    public static void main(String[] args){
        LinkedListDemo list = new LinkedListDemo();

        Node first = list.new Node(10);
        Node second = list.new Node(20);
        Node third = list.new Node(30);

        list.head=first;
        first.next=second;
        second.next=third;

        list.display();
        list.AddAtHead(40);
        list.display();
        list.deleteHead();
        list.display();
        System.out.println(list.findLength());
        list.display();
        if(list.isPresent(30)){
            System.out.println("Present");
        }
    }
}
