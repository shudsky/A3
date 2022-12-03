///*
//• SetEINThreshold (Size): where 100 ≤ Size ≤ ~500,000 is an integer number that defines
//the size of the list. This size is very important as it will determine what data types or data
//structures will be used (i.e. a Tree, Hash Table, AVL tree, binary tree, sequence, etc.);
//
//• generate(): randomly generates new non-existing key of 8 digits;
//
//• allKeys(ElasticERL): return all keys in ElasticERL as a sorted sequence;
//
//• add(ElasticERL,key,value2): add an entry for the given key and value;
//
//• remove(ElasticERL,key): remove the entry for the given key;
//
//• getValues(ElasticERL,key): return the values of the given key;
//
//• nextKey(ElasticERL,key): return the key for the successor of key;
//
//• prevKey(ElasticERL,key): return the key for the predecessor of key;
//
//• rangeKey(key1, key2): returns the number of keys that are within the specified range of
//the two keys key1 and key2.
// */
//
//public class ElasticERLMed extends BinaryTree//implement linked list to keep track of order!
//{
//    public void generate()   //this complexity is probably terrible tbh
//    {
//        int random = (int)(Math.random() * 99999999 + 1);
//        if(find(root, random) != -1)  //if value exists in sequence already, do it again --> figure out root!!!!!
//        {
//            generate();
//        }
//    }
//
//}
//
//class BinaryTree
//{
//    static class Node
//    {
//        String value;
//        Node left, right;
//
//        Node(String value)
//        {
//            this.value = value;
//            left = null;
//            right = null;
//        }
//    }
//
//    public void insert(Node node, String value)
//    {
//        if (value < node.value)
//        {
//            if (node.left != null)
//            {
//                insert(node.left, value);
//            }
//            else
//                System.out.println(" Inserted " + value + " to left of " + node.value);
//            node.left = new Node(value);
//        }
//        else if (value > node.value) {
//            if (node.right != null)
//            {
//                insert(node.right, value);
//            }
//            else
//            {
//                System.out.println("  Inserted " + value + " to right of "
//                        + node.value);
//                node.right = new Node(value);
//            }
//        }
//    }
//
//    public boolean find(Node node, int value)
//    {
//        if (node != null)
//        {
//            if(node.value == value)
//            {
//                return true;
//            }
//            find(node.left, value);
//            System.out.print(" " + node.value);
//            find(node.right, value);
//        }
//        return false;
//    }
//
//    //***********************************************************ADD REMOVE()!!!!!!!!!!!!
//}
