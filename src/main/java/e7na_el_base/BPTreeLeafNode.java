package e7na_el_base;



import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Vector;

public class BPTreeLeafNode<T extends Comparable<T>> extends BPTreeNode<T> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Ref2[] records;
	private BPTreeLeafNode<T> next;
	
	@SuppressWarnings("unchecked")
	public BPTreeLeafNode(int n, String SortingKey , String TableName) 
	{
		super(n,SortingKey,TableName);
		keys = new Comparable[n];
		records = new Ref2[n];

	}
	
	/**
	 * @return the next leaf node
	 */
	public BPTreeLeafNode<T> getNext()
	{
		return this.next;
	}
//	public boolean delete(T key, BPTreeInnerNode<T> parent, int ptr) { //b3mlha w 5alas delwa2ty 3ashan 5ayfa tbawaz l ba2y
//		return true; 
//	}
	/**
	 * sets the next leaf node
	 * @param node the next leaf node
	 */
	public void setNext(BPTreeLeafNode<T> node)
	{
		this.next = node;
		//this.serNode(fileName);
	}
	
	/**
	 * @param index the index to find its record
	 * @return the reference of the queried index
	 */
	public Ref2 getRecord(int index) 
	{
		return records[index]; //ref2
	}
	
	/**
	 * sets the record at the given index with the passed reference
	 * @param index the index to set the value at
	 * @param recordReference the reference to the record
	 */
	public void setRecord(int index, Ref2 recordReference) 
	{
		records[index] = recordReference; //ref2
	//	this.serNode(fileName);
	}

	//insertAt2 lw hwa already mwgood
	/**
	 * @return the reference of the last record
	 */
	public Ref2 getFirstRecord()
	{
		return records[0];
	}

	/**
	 * @return the reference of the last record
	 */
	public Ref2 getLastRecord()
	{
		return records[numberOfKeys-1];
	}
	
	/**
	 * finds the minimum number of keys the current node must hold
	 */
	public int minKeys()
	{
		if(this.isRoot())
			return 1;
		return (order + 1) / 2;
	}
	
	/**
	 * insert the specified key associated with a given record refernce in the B+ tree
	 */
	public PushUp<T> insert(T key, Ref recordReference, BPTreeInnerNode<T> parent, int ptr,BPTree tree)
	{
		tree.allkeys.add(key);
		Vector<Ref> vref = new Vector<>();
		int index = 0;
		while (index < numberOfKeys && getKey(index).compareTo(key) < 0)
			++index;
		if(index < numberOfKeys && getKey(index).compareTo(key)==0) {
			this.insertAt2(index, key, recordReference);
		//	serNode(fileName);
		}
		else {
			if(this.isFull())
			{
				vref = new Vector<>();// ana 3'ayart mn hna
				vref.add(recordReference);//
				Ref2 ref = new Ref2(vref);//
				BPTreeNode<T> newNode = this.split(key, ref);// le7ad hna
			//	serNode(fileName);
				Comparable<T> newKey = newNode.getFirstKey();
				return new PushUp<T>(newNode, newKey);
			}
			else
			{	
				vref.add(recordReference);
				Ref2 ref = new Ref2(vref);
				this.insertAt(index, key, ref);	
				//serNode(fileName);
				return null;
			}
		}
		return null;
	}
	
	/**
	 * inserts the passed key associated with its record reference in the specified index
	 * @param index the index at which the key will be inserted
	 * @param key the key to be inserted
	 * @param recordReference the pointer to the record associated with the key
	 */
	private void insertAt(int index, Comparable<T> key, Ref2 recordReference) 
	{
		
		for (int i = numberOfKeys - 1; i >= index; --i) 
		{
			this.setKey(i + 1, getKey(i));
			//serNode(fileName);
			this.setRecord(i + 1, getRecord(i));
			//serNode(fileName);
		}

		this.setKey(index, key);
		//serNode(fileName);
		this.setRecord(index, recordReference);
		//serNode(fileName);
		++numberOfKeys;
	}
	private void insertAt2(int index, Comparable<T> key, Ref recordReference) {
		records[index].references.add(recordReference);
		//serNode(fileName);
	}
	
	/**
	 * splits the current node
	 * @param key the new key that caused the split
	 * @param recordReference the reference of the new key
	 * @return the new node that results from the split
	 */
	public BPTreeNode<T> split(T key, Ref2 recordReference) 
	{
		int keyIndex = this.findIndex(key);
		int midIndex = numberOfKeys / 2;
		if((numberOfKeys & 1) == 1 && keyIndex > midIndex)	//split nodes evenly
			++midIndex;		

		
		int totalKeys = numberOfKeys + 1;
		//move keys to a new node
		BPTreeLeafNode<T> newNode = new BPTreeLeafNode<T>(order,SortingKey,TableName);
		//serNode(fileName);
		//serNode(newNode.fileName);
		for (int i = midIndex; i < totalKeys - 1; ++i) 
		{
			newNode.insertAt(i - midIndex, this.getKey(i), this.getRecord(i));
			//serNode(fileName);
			//serNode(newNode.fileName);
			numberOfKeys--;
		}
		
		//insert the new key
		if(keyIndex < totalKeys / 2) {
			
			this.insertAt(keyIndex, key, recordReference);
			//serNode(fileName);
		}
		else {
			newNode.insertAt(keyIndex - midIndex, key, recordReference);
			//serNode(fileName);
			//serNode(newNode.fileName);
		}
		
		//set next pointers
		newNode.setNext(this.getNext());
		this.setNext(newNode);
		//serNode(fileName);
		//serNode(newNode.fileName);
		return newNode;
	}
	
	/**
	 * finds the index at which the passed key must be located 
	 * @param key the key to be checked for its location
	 * @return the expected index of the key
	 */
	public int findIndex(T key) 
	{
		for (int i = 0; i < numberOfKeys; ++i) 
		{
			int cmp = getKey(i).compareTo(key);
			if (cmp > 0) 
				return i;
		}
		return numberOfKeys;
	}

	/**
	 * returns the record reference with the passed key and null if does not exist
	 */
	@Override
	public Ref2 search(T key) 
	{
		Vector<Ref> references = new Vector<>();
		for(int i = 0; i < numberOfKeys; ++i) {
			
			if(this.getKey(i).compareTo(key) == 0) {
				return this.getRecord(i);
			}
		}
		return null;
	}
	
	/**
	 * delete the passed key from the B+ tree
	 */
	public boolean delete(T key, BPTreeInnerNode<T> parent, int ptr , Ref referenceofkey) 
	{
		for(int i = 0; i < numberOfKeys; ++i)
			if(keys[i].compareTo(key) == 0)
			{
				this.deleteAt(i,referenceofkey);
			//	serNode(fileName);
				if(i == 0 && ptr > 0)
				{
					//update key at parent
					parent.setKey(ptr - 1, this.getFirstKey());
				//	serNode(parent.fileName);
				}
				//check that node has enough keys
				if(!this.isRoot() && numberOfKeys < this.minKeys())
				{
					//1.try to borrow
					if(borrow(parent, ptr,referenceofkey))
						return true;
					//2.merge
					merge(parent, ptr);
				}
				return true;
			}
		//serNode(fileName);
		return false;
	}
	
	/**
	 * delete a key at the specified index of the node
	 * @param index the index of the key to be deleted
	 */
	public void deleteAt(int index , Ref referenceofkey) //index = the index of the key i will delete
	{
		
		for(int i=0;i<records[index].references.size();i++) {
			if(records[index].references.get(i).indexInPage==referenceofkey.indexInPage && records[index].references.get(i).pageNo==referenceofkey.pageNo ) {
				records[index].references.remove(i);
			//	serNode(fileName);//msh 3arfa eeh l hay7sal hna b3d l serialization
				
				break;
			}
		}
		if(records[index].references.size()==0) {
		for(int i = index; i < numberOfKeys - 1; ++i)
		{
			keys[i] = keys[i+1];
			records[i] = records[i+1];
		//	serNode(fileName);
		}
		numberOfKeys--;
		}
	}
	
	/**
	 * tries to borrow a key from the left or right sibling
	 * @param parent the parent of the current node
	 * @param ptr the index of the parent pointer that points to this node 
	 * @return true if borrow is done successfully and false otherwise
	 */
	public boolean borrow(BPTreeInnerNode<T> parent, int ptr , Ref referenceofkey)
	{
		//check left sibling
		if(ptr > 0)
		{
			BPTreeLeafNode<T> leftSibling = (BPTreeLeafNode<T>) parent.getChild(ptr-1);
			if(leftSibling.numberOfKeys > leftSibling.minKeys())
			{
				this.insertAt(0, leftSibling.getLastKey(), leftSibling.getLastRecord());
			//	serNode(fileName);
				leftSibling.deleteAt(leftSibling.numberOfKeys - 1, referenceofkey);
				//serNode(fileName);
				parent.setKey(ptr - 1, keys[0]);
				//serNode(fileName);
				return true;
			}
		}
		
		//check right sibling
		if(ptr < parent.numberOfKeys)
		{
			BPTreeLeafNode<T> rightSibling = (BPTreeLeafNode<T>) parent.getChild(ptr+1);
			if(rightSibling.numberOfKeys > rightSibling.minKeys())
			{
				this.insertAt(numberOfKeys, rightSibling.getFirstKey(), rightSibling.getFirstRecord());
				//serNode(fileName);
				rightSibling.deleteAt(0,referenceofkey);
				//serNode(rightSibling.fileName);
				parent.setKey(ptr, rightSibling.getFirstKey());
				//serNode(parent.fileName);
				return true;
			}
		}
		return false;
	}
	
	/**
	 * merges the current node with its left or right sibling
	 * @param parent the parent of the current node
	 * @param ptr the index of the parent pointer that points to this node 
	 */
	public void merge(BPTreeInnerNode<T> parent, int ptr)
	{
		if(ptr > 0)
		{
			//merge with left
			BPTreeLeafNode<T> leftSibling = (BPTreeLeafNode<T>) parent.getChild(ptr-1);
			leftSibling.merge(this);
			//serNode(leftSibling.fileName);
			parent.deleteAt(ptr-1);	
			//serNode(parent.fileName);
		}
		else
		{
			//merge with right
			BPTreeLeafNode<T> rightSibling = (BPTreeLeafNode<T>) parent.getChild(ptr+1);
			this.merge(rightSibling);
			//serNode(fileName);
			parent.deleteAt(ptr);
			//serNode(parent.fileName);
		}
	}
	
	/**
	 * merge the current node with the specified node. The foreign node will be deleted
	 * @param foreignNode the node to be merged with the current node
	 */
	public void merge(BPTreeLeafNode<T> foreignNode)
	{
		for(int i = 0; i < foreignNode.numberOfKeys; ++i) {
			this.insertAt(numberOfKeys, foreignNode.getKey(i), foreignNode.getRecord(i));
		//	serNode(fileName);
		}
		
		this.setNext(foreignNode.getNext());
		//serNode(fileName);
	}

	

	
}