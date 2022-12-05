public class ElasticERLlrg
{
    public void generate()   //this complexity is probably terrible tbh
    {
        int random = (int)(Math.random() * 99999999 + 1);
    }

}


class HashTable
{
    LList arr[];
    int hashNum;

    HashTable(int size)
    {
        hashNum = (int)(size / 0.9);//using load factor to calculate
        System.out.println(hashNum);
        arr = new LList[hashNum];
        for(int i=0; i<hashNum; i++)
        {
            arr[i] = new LList();
        }
    }

    public void add(int value)
    {
        int n = value % hashNum;
        arr[n].add(value);
    }

    @Override
    public String toString()
    {
        String str = "";
        for(int i=0; i<arr.length; i++)
        {
            str += arr[i] + "-----\n";
        }
        return str;

    }



}