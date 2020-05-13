package e7na_el_base;

import java.io.Serializable;



public class Ref implements Serializable{

	

	/**

	 * This class represents a pointer to the record. It is used at the leaves of the B+ tree 

	 */

	public static final long serialVersionUID = 1L;

	public int pageNo, indexInPage;

	

	public Ref(int pageNo, int indexInPage)

	{

		this.pageNo = pageNo;

		this.indexInPage = indexInPage;

	}

	

	/**

	 * @return the page at which the record is saved on the hard disk

	 */

	public int getPage()

	{

		return pageNo;

	}

	

	/**

	 * @return the index at which the record is saved in the page

	 */

	public int getIndexInPage()

	{

		return indexInPage;

	}

}