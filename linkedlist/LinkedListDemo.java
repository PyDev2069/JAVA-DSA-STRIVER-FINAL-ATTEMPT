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

    public static void main(String[] args){
        LinkedListDemo list = new LinkedListDemo();

        Node first = list.new Node(10);
        Node second = list.new Node(20);
        Node third = list.new Node(30);

        list.head=first;
        first.next=second;
        second.next=third;

        list.display();
    }
}
