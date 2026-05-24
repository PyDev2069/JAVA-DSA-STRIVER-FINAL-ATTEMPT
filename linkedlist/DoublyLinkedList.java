public class DoublyLinkedList {
    DLLNode head;

    class DLLNode{
        int val;
        DLLNode next;
        DLLNode prev;

        DLLNode(int x){
            this.val = x;
            this.next = null;
            this.prev = null;
        }
    }

    void display(){
        DLLNode temp = head;
        System.out.print("null ");
        while(temp!=null){
            System.out.print( " <- " + temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println(" null");
    }

    //* Insert node before head in Doubly Linked List */
    void AddAtHead(int data){
        DLLNode newNode = new DLLNode(data);
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    //* Delete head of Doubly Linked List */
    void deleteHead(){
        head = head.next;
        if(head != null){
            head.prev = null;
        }        
    }
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        DLLNode first = list.new DLLNode(10);
        DLLNode second = list.new DLLNode(20);
        DLLNode third = list.new DLLNode(30);

        list.head = first;

        first.next = second;
        second.next =  third;

        second.prev = first;
        third.prev = second;
        list.display();

        list.AddAtHead(79);
        list.display();

    }
}

