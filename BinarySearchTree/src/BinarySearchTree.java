import javax.swing.tree.TreeNode;

/**
 * Created by Al-Ghammari on 11/18/2016.
 */
public class BinarySearchTree {

	public BinarySearchTree() {
		root = null;
	}

	private int getSize(TNode t) {
		if (t == null)
			return 0;
		return 1 + getSize(t.getLeft()) + getSize(t.getRight());
	}

	public int getSize() {
		return getSize(root);
	}

	public int getDepth() {
		return getDepth(root);
	}

	private int getDepth(TNode t) {
		int depthLeft, depthRight;
		if (t == null)
			return 0;
		depthLeft = getDepth(t.getLeft());
		depthRight = getDepth(t.getRight());
		if (depthLeft > depthRight)
			return depthLeft + 1;
		return depthRight + 1;
	}

	// public void add(String p){
	// TNode t = new TNode();
	// t.setData(p);
	// t.setLeft(root);
	// root = t;
	//
	// }
	public void add(String elem) {
		add(root, null, false, elem);
	}

	private boolean add(TNode t, TNode parent, boolean right, String d) {
		if (t == null) {
			TNode n = new TNode();
			n.setData(d);
			n.setLeft(null);
			n.setRight(null);
			if (root == t) {
				root = n;
				return true;
			}
			if (right)
				parent.setRight(n);
			else
				parent.setLeft(n);
			return true;
		} else if (d.compareTo(t.getData()) < 0) {
			add(t.getLeft(), t, false, d);
		} else {
			add(t.getRight(), t, true, d);
		}
		return true;
	}

	public boolean remove(String p) {
		return false;
	}

	public boolean contains(String p) {
		return contains(root, p);
	}

	private boolean contains(TNode t, String p) {
		if (t == null)
			return false;
		if (p.compareTo(t.getData()) == 0)
			return true;
		if (p.compareTo(t.getData()) < 0)
			return contains(t.getLeft(), p);
		return contains(t.getRight(), p);
	}

	public void print() {
		print(root, 0);
	}

	private void print(TNode t, int indent) {
		if (t == null)
			return;
		print(t.getLeft(), indent + 2);
		for (int i = 0; i < indent; i++)
			System.out.print(" ");
		System.out.println(t.getData().toString());
		print(t.getRight(), indent + 2);
	}

	public void toString(TNode t, StringBuffer sb) {
		if (t == null)
			return;
		toString(t.getLeft(), sb);
		sb.append(t.getData());
		if (t.getRight() != null)
			sb.append(",");
		toString(t.getRight(), sb);

	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		toString(root, sb);
		return sb.toString();
	}

	public String toStringAsTree() {
		StringBuffer buffer = new StringBuffer();
		toStringAsTree(buffer, 0, root);
		return buffer.toString();
	}

	private void toStringAsTree(StringBuffer buffer, int indent, TNode t) {
		if (t == null)
			return;
		toStringAsTree(buffer, indent + 2, t.getRight());
		for (int i = 0; i < indent; i++)
			buffer.append(" ");
		buffer.append(t.getData().toString());
		buffer.append("\n");
		toStringAsTree(buffer, indent + 2, t.getLeft());
	}

	private static boolean isFirst = false;

	private void appendStringInorder(StringBuffer buffer, TNode t) {
		if (t == null)
			return;
		appendStringInorder(buffer, t.getLeft());
		if (isFirst)
			isFirst = false;
		else
			buffer.append(", ");
		buffer.append(t.getData().toString());
		buffer.append(", ");
		appendStringInorder(buffer, t.getRight());
	}

	public String toStringInorder() {
		StringBuffer buffer = new StringBuffer();
		isFirst = true;
		appendStringInorder(buffer, root);
		buffer.append(".");
		return buffer.toString();
	}

	private void appendStringPreorder(StringBuffer buffer, TNode t) {
		if (t == null)
			return;
		if (isFirst)
			isFirst = false;
		else
			buffer.append(", ");
		buffer.append(t.getData().toString());
		appendStringPreorder(buffer, t.getLeft());
		appendStringPreorder(buffer, t.getRight());
	}

	public String toStringPreorder() {
		StringBuffer buffer = new StringBuffer();
		isFirst = true;
		appendStringPreorder(buffer, root);
		buffer.append(".");
		return buffer.toString();
	}

	protected void appendStringPostorder(StringBuffer buffer, TNode t) {
		if (t == null)
			return;
		appendStringPostorder(buffer, t.getLeft());
		appendStringPostorder(buffer, t.getRight());
		if (isFirst)
			isFirst = false;
		else
			buffer.append(", ");
		buffer.append(t.getData().toString());
	}

	public String toStringPostorder() {
		StringBuffer buffer = new StringBuffer();
		isFirst = true;
		appendStringPostorder(buffer, root);
		buffer.append(".");
		return buffer.toString();
	}

	public void reset() {
		root = null;
	}

	private TNode root;
}
