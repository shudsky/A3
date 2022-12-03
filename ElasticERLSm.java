/*
• SetEINThreshold (Size): where 100 ≤ Size ≤ ~500,000 is an integer number that defines
the size of the list. This size is very important as it will determine what data types or data
structures will be used (i.e. a Tree, Hash Table, AVL tree, binary tree, sequence, etc.);

• generate(): randomly generates new non-existing key of 8 digits;

• allKeys(ElasticERL): return all keys in ElasticERL as a sorted sequence;

• add(ElasticERL,key,value2): add an entry for the given key and value;

• remove(ElasticERL,key): remove the entry for the given key;

• getValues(ElasticERL,key): return the values of the given key;

• nextKey(ElasticERL,key): return the key for the successor of key;

• prevKey(ElasticERL,key): return the key for the predecessor of key;

• rangeKey(key1, key2): returns the number of keys that are within the specified range of
the two keys key1 and key2.
 */
public class ElasticERLSm extends Sequence
{
    public void generate()   //this complexity is probably terrible tbh
    {
       int random = (int)(Math.random() * 99999999 + 1);
       if(find(random) != -1)  //if value exists in sequence already, do it again
       {
           generate();
       }
    }

    public String getValues(int key)
    {
        int n = find(key);
        if(n != -1)
        {
            return arr[n].getElement().getValue();
        }
        return "Not found";
    }

    public Sequence allKeys()
    {
        return sort();
    }


}

class Sequence//ElasticERL for SMALL amounts of data uses a SEQUENCE
{
    Position[] arr;//*****************************************************AS OF RIGHT NOW, THIS IS NON-CIRCULAR!!!!!!!!
    int size;
    int first;
    int last;

    Sequence()
    {
        arr = null;
        size = -1;
        first = -1;
        last = -1;
    }
    Sequence(int size)
    {
        arr = new Position[size];
        for(int i=0; i<size; i++)
        {
            arr[i] = new Position();
        }
        this.size = size;
        first = 0;
        last = 1;
    }

    Sequence(Sequence original)//copy constructor
    {
        arr = new Position[original.size];
        size = original.size;
        first = original.first;
        last = original.last;
        for(int i=0; i<size; i++)
        {
            arr[i] = new Position(original.arr[i]);//deep copy
        }
    }

    public void add(EIN element)
    {
        Position a = new Position((last-1), element);
        arr[(last-1)] = a;
        last++;
    }
    public void remove(int key)
    {
        boolean b = false;
        for(int i=0; i<size; i++)
        {
//            if(arr[i].getElement() != null)
//            {
                if (b)
                {
                    if (arr[i].getPos() != -1)
                        arr[i].setPos(arr[i].getPos() - 1);
                    arr[i - 1] = arr[i];
                }
                if (arr[i].getElement() != null && arr[i].getElement().getKey() == key) {
                    b = true;
                    last--;
                }
//                if (i == (size - 1)) {
//                    arr[i] = new Position();
//                }
//            }

        }
    }

    public int find(int key)
    {
        for(int i=0; i< arr.length; i++)
        {
            if(arr[i].getElement()!= null && arr[i].getElement().getKey() == key)
            {
                return i;//more useful to return position than simply true/false
            }
        }
        return -1;

    }

    public Sequence sort()
    {
        Sequence orig = new Sequence(this);
        Sequence temp = new Sequence(size);
        EIN min;
        while(orig.arr[0] != null) {
            for (int i = 0; i < size; i++) {
                min = orig.arr[0].getElement();
                if (orig.arr[0] != null) {
                    System.out.println(min.getKey());
                    if (orig.arr[i].getElement().getKey() < min.getKey()) {
                        min = orig.arr[i].getElement();
                    }
                }
                System.out.println(orig);
                temp.add(min);
                orig.remove(min.getKey());
            }
        }
        return temp;
    }


    @Override
    public String toString()
    {
        String str = "";
        for(int i=0; i<size; i++)
        {
            str += ( arr[i]+ "\n");
        }
        return str;
    }




}

class Position//used in the sequence ADT
{
    int pos;
    EIN element;

    Position()
    {
        pos = -1;
        element = null;
    }

    Position(int pos, EIN element)
    {
        this.pos = pos;
        this.element = element;
    }

    Position(Position original)//copy constructor
    {
        this.pos = original.pos;
        this.element = new EIN(original.element);//deep copy
    }

    @Override
    public String toString()
    {
        return("Element: " + element + ", Position: " + pos);
    }

    public int getPos() {return pos;}
    public void setPos(int pos) {this.pos = pos;}

    public EIN getElement() {return element;}
    public void setElement(EIN value) {this.element = value;}

}

