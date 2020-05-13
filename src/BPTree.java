package e7na_el_base;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class BPTree<T extends Comparable<T>> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int order;
	private BPTreeNode<T> root;
	public String SortingKey;
	public String TableName;
public TreeSet<Comparable> allkeys;
	/**
	 * Creates an empty B+ tree
	 * 
	 * @param order the maximum number of keys in the nodes of the tree
	 */
	public BPTree(int order, String SortingKey , String TableName) {
		this.SortingKey = SortingKey;
		this.TableName = TableName;
		this.order = order;
		root = new BPTreeLeafNode<T>(this.order,SortingKey,TableName);
		root.setRoot(true);
		
		allkeys=new TreeSet<Comparable>();
		
	}

	/**
	 * Inserts the specified key associated with the given record in the B+ tree
	 * 
	 * @param key             the key to be inserted
	 * @param recordReference the reference of the record associated with the key
	 */
	public void insert(T key, Ref recordReference) {
		
		PushUp<T> pushUp = root.insert(key, recordReference, null, -1,this);
		if (pushUp != null) {
			BPTreeInnerNode<T> newRoot = new BPTreeInnerNode<T>(order,SortingKey,TableName);
			newRoot.insertLeftAt(0, pushUp.key, root);
			newRoot.setChild(1, pushUp.newNode);
			root.setRoot(false);
			root = newRoot;
			root.setRoot(true);
			
		}
	}

	/**
	 * Looks up for the record that is associated with the specified key
	 * 
	 * @param key the key to find its record
	 * @return the reference of the record associated with this key
	 */
	public Ref2 search(T key) {
		return root.search(key);
	}
public int findIndex(T key) {
	return root.findIndex(key);
}
public int findindexinnode(T key) {
	return root.IndexInNode(key);
}
	/**
	 * Delete a key and its associated record from the tree.
	 * 
	 * @param key the key to be deleted
	 * @return a boolean to indicate whether the key is successfully deleted or it
	 *         was not in the tree
	 */
	public boolean delete(T key , Ref referenceofkey) {
		
		boolean done = root.delete(key, null, -1 , referenceofkey);
		// go down and find the new root in case the old root is deleted
		while (root instanceof BPTreeInnerNode && !root.isRoot())
			root = ((BPTreeInnerNode<T>) root).getFirstChild();
		return done;
	}

	/**
	 * Returns a string representation of the B+ tree.
	 */
	public String toString() {

		// <For Testing>
		// node : (id)[k1|k2|k3|k4]{P1,P2,P3,}
		String s = "";
		Queue<BPTreeNode<T>> cur = new LinkedList<BPTreeNode<T>>(), next;
		cur.add(root);
		while (!cur.isEmpty()) {
			next = new LinkedList<BPTreeNode<T>>();
			while (!cur.isEmpty()) {
				BPTreeNode<T> curNode = cur.remove();
				System.out.print(curNode);
				if (curNode instanceof BPTreeLeafNode)
					System.out.print("->");
				else {
					System.out.print("{");
					BPTreeInnerNode<T> parent = (BPTreeInnerNode<T>) curNode;
					for (int i = 0; i <= parent.numberOfKeys; ++i) {
						System.out.print(parent.getChild(i).index + ",");
						next.add(parent.getChild(i));
					}
					System.out.print("} ");
				}

			}
			System.out.println();
			cur = next;
		}
		// </For Testing>
		return s;
	}
}