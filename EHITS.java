public class EHITS
{
    public static void main(String args[])
    {
        EIN a = new EIN(40190987);
        EIN b = new EIN(20390987);
        EIN c = new EIN(81990981);
        EIN d = new EIN(70947562);
        Sequence s = new Sequence(10);
        s.add(a);
        s.add(b);
        s.add(c);
        s.add(d);
        System.out.println(s);
        s.sort();

//        HashTable h = new HashTable(60);
//        h.add(1001);
//        h.add(10);
//        h.add(400);
//        System.out.println(h);



    }
}
