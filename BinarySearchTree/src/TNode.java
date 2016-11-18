/**
 * Created by Al-Ghammari on 11/18/2016.
 */
public class TNode {
    TNode() {
        left= right= null; data= null; }
    public void setLeft(TNode l) {
        left=l;
    }
    public TNode getLeft() {
        return left;
    }
    public void setRight(TNode r) {
        right= r;
    }

    public TNode getRight() {
        return right;
    }
    public void setData(String d) {
        data= d;
    }
    public String getData() {
        return data;
    }
    private TNode left, right;
    private String data;
}