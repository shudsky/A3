/*
You are asked to design and implement the ElasticERL ADT. The ADT should accept the size (total
number of Equipment Identification Number) as a parameter and uses an appropriate set of data types
 */
public class ElasticERL
{

    ElasticERL(int size)
    {
        if(size <= 1000)//<= 1000 is SMALL --> use sequence
        {

        }
        else if(size <= 50000)//<= 50000 is MEDIUM --> use binary tree
        {

        }
        else//anything >50 000 is LARGE --> use hash table
        {

        }
    }

}
class EIN
{
    int key;
    String value;

    EIN()
    {
        key = -1;
        value = null;
    }
    EIN(int key)
    {
        this.key = key;
        value = "Equipment name, brand, model, warranty expiry date";//change this later ig idk~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    }

    EIN(int key, String value)
    {
        this.key = key;
        this.value = value;
    }

    EIN(EIN original)//copy contructor
    {
        if(original!=null) {
            this.key = original.key;
            this.value = original.value;
        }
    }

    @Override
    public String toString()
    {
        return ("Key: " + key + ", Value: " + value);
    }

    public int getKey() {return key;}
    public void setKey(int key) {this.key = key;}

    public String getValue() {return value;}
    public void setValue(String value) {this.value = value;}

}



class Stack//used to keep track of order (that is it)
{
    private int arr[];
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    Stack(int size)
    {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Copy constructor to initialize the stack based on another stack
    Stack(Stack s)
    {
        arr = new int[s.getCapacity()];
        top=-1;
        for(int i=0; i<s.size(); i++)
        {
            arr[i] = s.arr[++top];
        }
        capacity = s.getCapacity();
    }

    public void push(int x)
    {
        if (isFull())
        {
            System.out.println("Overflow - Program Terminated\n");
            System.exit(-1);
        }
        arr[++top] = x;
    }

    // Utility function to pop a top element from the stack
    public int pop()
    {
        // check for stack underflow
        if (isEmpty())
        {
            System.out.println("Underflow - Program Terminated");
            System.exit(-1);
        }

        // decrease stack size by 1 and (optionally) return the popped element
        return arr[top--];
    }

    // Utility function to return the top element of the stack
    public int peek()
    {
        if (!isEmpty())
            return arr[top];

        else
            System.exit(-1);

        return -1;
    }

    // Utility function to return the size of the stack
    public int size()
    {
        return top + 1;
    }

    // Utility function to check if the stack is empty or not
    public boolean isEmpty()
    {
        return top == -1;
    }

    // Utility function to check if the stack is full or not
    public boolean isFull()
    {
        return top == capacity - 1;
    }

    public int getCapacity()
    {
        return capacity;
    }

    public String toString()
    {
        String s = "{ ";
        for(int i=0; i<size(); i++)
        {
            s+=arr[i] + ", ";
        }
        s += "}";
        return s;
    }
}