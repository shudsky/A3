class LList
{
    //A node class for doubly linked list
    static class Node
    {
        int item;
        Node previous;
        Node next;

        public Node(int item)
        {
            this.item = item;
        }
    }

    //Initially, heade and tail is set to null
    Node head, tail = null;

    //add a node to the list
    public void add(int item)
    {
        //Create a new node
        Node newNode = new Node(item);

        //if list is empty, head and tail points to newNode
        if (head == null)
        {
            head = tail = newNode;
            //head's previous will be null
            head.previous = null;
            //tail's next will be null
            tail.next = null;
        }
        else
        {
            //add newNode to the end of list. tail->next set to newNode
            tail.next = newNode;
            //newNode->previous set to tail
            newNode.previous = tail;
            //newNode becomes new tail
            tail = newNode;
            //tail's next point to null
            tail.next = null;
        }
    }

    public void remove(int item)//*******************************************FINISH THISSSS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    {
        if(head == null)
        {
            return;
        }
    }

    @Override
    public String toString()
    {
        String str = "";
        Node n = head;
        while(n != null)
        {
            str += n.item + ", ";
            n = n.next;
        }
        return (str);
    }
}
