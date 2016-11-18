/**
 * Created by Al-Ghammari on 11/18/2016.
 */
public class Main {
    public static void main(String[] args){
        BinarySearchTree t = new BinarySearchTree();
        t.add("1");
        t.add("2");
        t.add("3");
        t.add("4");
        t.add("5");
        System.out.println(t.getSize());
        System.out.println(t);
        System.out.println(t.getDepth());
//        System.out.println(t.toStringAsTree());
    }
}
