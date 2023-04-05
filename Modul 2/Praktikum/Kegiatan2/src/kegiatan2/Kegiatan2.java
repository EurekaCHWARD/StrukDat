package kegiatan2;

class Node {
    int data;
    Node next;

    public Node (int data){
        this.data = data;
        this.next = null;
    }
}

class Link {
    Node head;

    public Link(){
        this.head = null;
    }

    public void add(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    // sorting data
    public void sort(){
        Node current = head;
        Node nextNode = null;
        int temp;

        if (head == null){
            return;
        } else {
            while (current != null){
                nextNode = current.next;
                while (nextNode != null){
                    if (current.data > nextNode.data){
                        temp = current.data;
                        current.data = nextNode.data;
                        nextNode.data = temp;
                    }
                    nextNode = nextNode.next;
                }
                current = current.next;
            }
        }
    }
    public void printList(){
        Node currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
}

public class Kegiatan2 {

    public static void main(String[] args) {
        Link myLink = new Link();

        myLink.add(5);
        myLink.add(8);
        myLink.add(10);
        myLink.add(1);

        System.out.print("Linked list before sorted\t: ");
        myLink.printList();
        System.out.print("Linked list after sorted\t: ");
        myLink.sort();
        myLink.printList();
    }
    
}
