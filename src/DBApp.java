package e7na_el_base;

import java.awt.Dimension;
import java.awt.Polygon;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.SortedSet;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.Vector;

import javax.swing.SortingFocusTraversalPolicy;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;

public class DBApp {

	// static ArrayList<Table> tables;

	public static void main(String[] args) throws Exception {
		DBApp db = new DBApp();
//		Hashtable<String, String> htable = new Hashtable();
//		htable.put("name", "java.lang.String");
//		htable.put("ID", "java.lang.Integer");
//		db.createTable("Students", "ID", htable);
//		Hashtable<String, Object> htable8 = new Hashtable<String, Object>();
//		htable8.put("ID", 8);
//		htable8.put("name", "s8");
//		db.insertIntoTable("Students", htable8);
//		Hashtable<String, Object> htable1 = new Hashtable<String, Object>();
//		htable1.put("ID", 1);
//		htable1.put("name", "s1");
//		db.insertIntoTable("Students", htable1);
//		db.insertIntoTable("Students", htable1);
//		db.insertIntoTable("Students", htable1);
//		db.insertIntoTable("Students", htable1);
//		db.insertIntoTable("Students", htable1);
//		db.insertIntoTable("Students", htable1);
//		Hashtable<String, Object> htable4 = new Hashtable<String, Object>();
//		htable4.put("ID", 4);
//		htable4.put("name", "s4");
//		db.insertIntoTable("Students", htable4);
//		Hashtable<String, Object> htable2 = new Hashtable<String, Object>();
//		htable2.put("ID", 2);
//		htable2.put("name", "s2");
//		db.insertIntoTable("Students", htable2);
//		Hashtable<String, Object> htable3 = new Hashtable<String, Object>();
//		htable3.put("ID", 3);
//		htable3.put("name", "s3");
//		db.insertIntoTable("Students", htable3);
//		Hashtable<String, Object> htable7 = new Hashtable<String, Object>();
//		htable7.put("ID", 7);
//		htable7.put("name", "s7");
//		db.insertIntoTable("Students", htable7);
//		db.insertIntoTable("Students", htable7);
//		db.insertIntoTable("Students", htable7);
//		Hashtable<String, Object> htable5 = new Hashtable<String, Object>();
//		htable5.put("ID", 5);
//		htable5.put("name", "s5");
//		Hashtable<String, Object> htable6 = new Hashtable<String, Object>();
//		htable6.put("ID", 6);
//		htable6.put("name", "s6");
//		db.insertIntoTable("Students", htable6);
		//db.CreateBTreeIndex("Students", "name");
//		db.insertIntoTable("Students", htable5);
//		db.insertIntoTable("Students", htable5);
//		db.insertIntoTable("Students", htable5);
//		Hashtable<String, Object> hd2 = new Hashtable<String, Object>();
//		hd2.put("ID", 3);
//		db.deleteFromTable("Students", hd2);
//	Hashtable<String, Object> hd1=new Hashtable<String, Object>();
//		hd1.put("name", "s5");
//		db.deleteFromTable("Students", hd1);
//		Hashtable<String, Object> hu1=new Hashtable<String, Object>();
//		hu1.put("name", "s11");
//		db.updateTable("Students", "1",hu1 );
//		Hashtable<String, Object> hu2=new Hashtable<String, Object>();
//		hu2.put("name", "s88");
//		db.updateTable("Students", "8",hu2 );
//		Hashtable<String, Object> hd3 = new Hashtable<String, Object>();
//		hd3.put("ID", 3);
//		db.deleteFromTable("Students", hd3);
		Hashtable<String, Object> hd4 = new Hashtable<String, Object>();
		hd4.put("name", "s1");
	//	db.deleteFromTable("Students", hd4);
	//db.gettree("Students");
	//	db.readtable("Students");
		 int []a= {1,2,3} ;
	     int []b= {4,5,6};
         Polygon p=new Polygon(a,b,3);
         int []a1= {1,27,30} ;
	     int []b1= {4,5,190};
	     Polygon p1=new Polygon(a1,b1,3);
        
	    //System.out.println(db.polyArea(p));
	     int []a2= {12,7,30} ;
	     int []b2= {4,50,190};
	     Polygon p2=new Polygon(a2,b2,3);
        
	     int []a3= {5,99,130} ;
	     int []b3= {4,50,190};
	     Polygon p3=new Polygon(a3,b3,3);
	  // db.polyString(p);
	   
			//db.polyy( db.polyString(p1));
		Hashtable<String, String> htable = new Hashtable();
		String name="st34";
		htable.put("name", "java.lang.String");
		htable.put("ID", "java.lang.Integer");
		htable.put("Polygon" , "java.awt.Polygon" );
		htable.put("Polygon2" , "java.awt.Polygon" );
		
		Hashtable<String, Object> htable8 = new Hashtable<String, Object>();
		htable8.put("ID", 8);
		htable8.put("name", "s8");
		htable8.put("Polygon", p1);
		htable8.put("Polygon2", p1);
		
		Hashtable<String, Object> htable1 = new Hashtable<String, Object>();
		htable1.put("ID", 88);
		htable1.put("name", "s88");
		htable1.put("Polygon", p); 
		htable1.put("Polygon2", p); 
		Hashtable<String, Object> htable4 = new Hashtable<String, Object>();
		htable4.put("ID", 4);
		htable4.put("name", "s4");
		htable4.put("Polygon", p3); 
		htable4.put("Polygon2", p3); 
		Hashtable<String, Object> htable2 = new Hashtable<String, Object>();
		htable2.put("ID", 2);
		htable2.put("name", "s2");
		htable2.put("Polygon", p2);  
		htable2.put("Polygon2", p2); 
		Hashtable<String, Object> htable3 = new Hashtable<String, Object>();
		htable3.put("ID", 3);
		htable3.put("name", "s3");
	 
		Hashtable<String, Object> htable7 = new Hashtable<String, Object>();
		htable7.put("ID", 7);
		htable7.put("name", "s7");
		 
		Hashtable<String, Object> htable5 = new Hashtable<String, Object>();
		htable5.put("ID", 5);
		htable5.put("name", "s5");
		 
		Hashtable<String, Object> htable6 = new Hashtable<String, Object>();
		htable6.put("ID", 6);
		htable6.put("name", "s6");
//   
//		
//		Hashtable<String, Object> hd1=new Hashtable<String, Object>();
//		hd1.put("name", "s1");
//		//db.deleteFromTable(name, hd1);db.gettree(name);
//		Hashtable<String, Object> hd2 = new Hashtable<String, Object>();
//		hd2.put("ID", 4);
//	// hd2.put("name", "s3");
//		//db.deleteFromTable(name, hd2);
//		Hashtable<String, Object> hd3 = new Hashtable<String, Object>();
//		hd3.put("ID", 100);
//		hd3.put("name", "s100");
//		//db.deleteFromTable(name, hd3);
//		
//		
//		
////		 db.insertIntoTable(name, htable6);
////		 db.insertIntoTable(name, htable5);
////		 db.insertIntoTable(name, htable4);
////		 db.insertIntoTable(name, htable3);
////		 db.insertIntoTable(name, htable2);
////		 db.insertIntoTable(name, htable7);
//		
//		
//		
//		
//		
////		
		//
		
		//db.createTable( name, "Polygon", htable);		
//        db.insertIntoTable(name, htable1);
//        db.insertIntoTable(name, htable8);
//        db.insertIntoTable(name, htable4);
// 		 db.insertIntoTable(name, htable2);	
// 		 
////
//	// db.polyy(db.polyString(p1));
//	       
	db.deleteFromTable(name,htable4);
	//	db.updateTable( name,db.polyString(p2)  , htable6 );
//db.CreateBTreeIndex(name, "name");
		db.readtable( name);
		db.getRtree( name);
//
		db.gettree( name);
	}

	public void gettree(String tablename) {
		Table t = destable("data/" + tablename + ".ser");
		for (BPTree tree : t.Trees) {
			System.out.println(tree.toString());
			//System.out.println(tree.search(3).references.get(0).indexInPage);

		}

	}
	public void getRtree(String tablename) {
		Table t = destable("data/" + tablename + ".ser");
		for (RTree tree : t.RTrees) {
			System.out.println(tree.toString());
			//System.out.println(tree.search(3).references.get(0).indexInPage);

		}

	}

	public Ref2 key(Comparable key, BPTree tree, String tablename) {
		Table t = destable("data/" + tablename + ".ser");
		return tree.search(key);
	}

	public Iterator selectFromTable(SQLTerm[] arrSQLTerms, String[] strarrOperators) throws Exception {
		Vector<Vector> result = new Vector<Vector>();
		String tablename = arrSQLTerms[0]._strTableName;

		Table curtable = destable("data/" + tablename + ".ser");
		HashSet<String> indexedcols = new HashSet<String>();
		for (BPTree tree : curtable.Trees) {
			indexedcols.add(tree.SortingKey);
		}
		for (SQLTerm s : arrSQLTerms) {

			if (indexedcols.contains(s._strColumnName)) {
				s.indexed = true;
			}
		}
		for (SQLTerm s : arrSQLTerms) {
			String col = s._strColumnName;
			String op = s._strOperator;
			
			
			
			
			
			Comparable value = (Comparable) s._objValue;
			int colindx = colindx(tablename, col);
			if (s.indexed) {
				BPTree tree = specifictree(tablename, col);
				SortedSet<Comparable> resultskeys = new TreeSet<Comparable>();
				if (op.equals(">")) {

					resultskeys = tree.allkeys.subSet(value, false, tree.allkeys.last(), true);
				} else if (op.equals(">=")) {
					resultskeys = tree.allkeys.subSet(value, true, tree.allkeys.last(), true);
				} else if (op.equals("<")) {
					resultskeys = tree.allkeys.subSet(tree.allkeys.first(), true, value, false);

				} else if (op.equals("<=")) {
					resultskeys = tree.allkeys.subSet(tree.allkeys.first(), true, value, true);

				} else if (op.equals("!=")) {
					resultskeys = tree.allkeys.subSet(tree.allkeys.first(), true, tree.allkeys.last(), true);
					resultskeys.remove(value);

				} else {
					// System.out.println(value.getClass());
					resultskeys.add(value);

					// System.out.println(resultskeys);
				}
				ArrayList<Ref> refsinpages = new ArrayList<Ref>();

				for (Comparable c : resultskeys) {
					Ref2 curref = tree.search(c);
					for (int i = 0; i < curref.references.size(); i++) {
						refsinpages.add(curref.references.get(i));
					}
				}
				for (int i = 0; i < refsinpages.size(); i++) {
					Page p = despage(curtable.pages.get(refsinpages.get(i).pageNo));

					result.add(p.rows.get(refsinpages.get(i).indexInPage));
				}
			} else {

				for (int k = 0; k < curtable.pages.size(); k++) {
					Page p1 = despage(curtable.pages.get(k));
					for (int off = 0; off < p1.rows.size(); off++) {
						if (op.equals(">")) {
							if (compare(p1.rows.get(off).get(colindx), value) > 0) {
								result.add(p1.rows.get(off));
							}
						} else if (op.equals(">=")) {
							if (compare(p1.rows.get(off).get(colindx), value) > 0
									|| compare(p1.rows.get(off).get(colindx), value) == 0) {
								result.add(p1.rows.get(off));
							}
						} else if (op.equals("<")) {
							if (compare(p1.rows.get(off).get(colindx), value) < 0) {
								result.add(p1.rows.get(off));
							}

						} else if (op.equals("<=")) {
							if (compare(p1.rows.get(off).get(colindx), value) < 0
									|| compare(p1.rows.get(off).get(colindx), value) == 0) {
								result.add(p1.rows.get(off));
							}

						} else if (op.equals("!=")) {
							if (compare(p1.rows.get(off).get(colindx), value) != 0) {
								result.add(p1.rows.get(off));
							}

						} else {
							if (compare(p1.rows.get(off).get(colindx), value) == 0) {
								result.add(p1.rows.get(off));
							}

						}
					}
				}
			}
		}

		for (int te3bt = 0; te3bt < strarrOperators.length; te3bt++) {
			int indx1 = colindx(arrSQLTerms[te3bt]._strTableName, arrSQLTerms[te3bt]._strColumnName);
			Object value1 = arrSQLTerms[te3bt]._objValue;
			String op1 = arrSQLTerms[te3bt]._strOperator;

			int indx2 = colindx(arrSQLTerms[te3bt + 1]._strTableName, arrSQLTerms[te3bt + 1]._strColumnName);
			Object value2 = arrSQLTerms[te3bt + 1]._objValue;
			String op2 = arrSQLTerms[te3bt + 1]._strOperator;
			if (strarrOperators[te3bt].equals("AND")) {
				for (int kefaya = 0; kefaya < result.size(); kefaya++) {
					boolean cond1 = false;
					boolean cond2 = false;
					if (op1.equals(">")) {
						if (compare(result.get(kefaya).get(indx1), value1) > 0) {
							cond1 = true;
						}
					} else if (op1.equals("=>")) {
						if (compare(result.get(kefaya).get(indx1), value1) > 0
								|| compare(result.get(kefaya).get(indx1), value1) == 0) {
							cond1 = true;
						}
					} else if (op1.equals("<")) {
						if (compare(result.get(kefaya).get(indx1), value1) < 0) {
							cond1 = true;
						}
					} else if (op1.equals("<=")) {
						if (compare(result.get(kefaya).get(indx1), value1) < 0
								|| compare(result.get(kefaya).get(indx1), value1) == 0) {
							cond1 = true;
						}
					} else if (op1.equals("!=")) {
						if (compare(result.get(kefaya).get(indx1), value1) != 0) {
							cond1 = true;
						}
					} else {
						if (compare(result.get(kefaya).get(indx1), value1) == 0) {
							cond1 = true;
						}

					}
					if (op2.equals(">")) {
						if (compare(result.get(kefaya).get(indx2), value2) > 0) {
							cond2 = true;
						}
					} else if (op2.equals("=>")) {
						if (compare(result.get(kefaya).get(indx2), value2) > 0
								|| compare(result.get(kefaya).get(indx2), value2) == 0) {
							cond2 = true;
						}
					} else if (op2.equals("<")) {
						if (compare(result.get(kefaya).get(indx2), value2) < 0) {
							cond2 = true;
						}
					} else if (op2.equals("<=")) {
						if (compare(result.get(kefaya).get(indx2), value2) < 0
								|| compare(result.get(kefaya).get(indx2), value2) == 0) {
							cond2 = true;
						}
					} else if (op2.equals("!=")) {
						if (compare(result.get(kefaya).get(indx2), value2) != 0) {
							cond2 = true;
						}
					} else {
						if (compare(result.get(kefaya).get(indx2), value2) == 0) {
							cond2 = true;
						}

					}
					if (cond1 & cond2) {
						// eshta mashy
					} else {
						result.remove(kefaya);
						kefaya--;
					}
				}
			}
			if (strarrOperators[te3bt].equals("XOR")) {
				for (int kefaya = 0; kefaya < result.size(); kefaya++) {
					boolean cond1 = false;
					boolean cond2 = false;
					if (op1.equals(">")) {
						if (compare(result.get(kefaya).get(indx1), value1) > 0) {
							cond1 = true;
						}
					} else if (op1.equals("=>")) {
						if (compare(result.get(kefaya).get(indx1), value1) > 0
								|| compare(result.get(kefaya).get(indx1), value1) == 0) {
							cond1 = true;
						}
					} else if (op1.equals("<")) {
						if (compare(result.get(kefaya).get(indx1), value1) < 0) {
							cond1 = true;
						}
					} else if (op1.equals("<=")) {
						if (compare(result.get(kefaya).get(indx1), value1) < 0
								|| compare(result.get(kefaya).get(indx1), value1) == 0) {
							cond1 = true;
						}
					} else if (op1.equals("!=")) {
						if (compare(result.get(kefaya).get(indx1), value1) != 0) {
							cond1 = true;
						}
					} else {
						if (compare(result.get(kefaya).get(indx1), value1) == 0) {
							cond1 = true;
						}

					}
					if (op2.equals(">")) {
						if (compare(result.get(kefaya).get(indx2), value2) > 0) {
							cond2 = true;
						}
					} else if (op2.equals("=>")) {
						if (compare(result.get(kefaya).get(indx2), value2) > 0
								|| compare(result.get(kefaya).get(indx2), value2) == 0) {
							cond2 = true;
						}
					} else if (op2.equals("<")) {
						if (compare(result.get(kefaya).get(indx2), value2) < 0) {
							cond2 = true;
						}
					} else if (op2.equals("<=")) {
						if (compare(result.get(kefaya).get(indx2), value2) < 0
								|| compare(result.get(kefaya).get(indx2), value2) == 0) {
							cond2 = true;
						}
					} else if (op2.equals("!=")) {
						if (compare(result.get(kefaya).get(indx2), value2) != 0) {
							cond2 = true;
						}
					} else {
						if (compare(result.get(kefaya).get(indx2), value2) == 0) {
							cond2 = true;
						}

					}
					if (!(cond1 & cond2) && (cond1 | cond2)) {
						// eshta mashy
					} else {
						result.remove(kefaya);
						kefaya--;
					}
				}
			}
		}
		Iterator<Vector> returnresult = result.iterator();
		return returnresult;

	}
	
	public BPTree specifictree(String tablename, String sortingkey) {
		Table t = destable("data/" + tablename + ".ser");
		for (BPTree tree : t.Trees) {
			if (tree.SortingKey.equals(sortingkey)) {
				return tree;
			}
		}
		return null;
	}
	public RTree specifictRtree(String tablename, String sortingkey) {
		Table t = destable("data/" + tablename + ".ser");
		for (RTree tree : t.RTrees) {
			if (tree.SortingKey.equals(sortingkey)) {
				return tree;
			}
		}
		return null;
	}

	public static Polygon toPoly(String s) {
		StringTokenizer st = new StringTokenizer(s, ",|0|1|2|3|4|5|6|7|8|9");
		int n = 0;

		while (st.hasMoreTokens()) {
			if (st.nextToken().equals("("))
				n++;
		}
		int[] x = new int[n];
		int[] y = new int[n];

		st = new StringTokenizer(s, "(|)|,| ");
		int i = 0;
		while (st.hasMoreTokens() && i < n) {
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		return (new Polygon(x, y, n));

	}
	public Iterator selectFromTableforRTree(SQLTerm[] arrSQLTerms, String[] strarrOperators) throws Exception {
		Vector<Vector> result = new Vector<Vector>();
		String tablename = arrSQLTerms[0]._strTableName;

		Table curtable = destable("data/" + tablename + ".ser");
		HashSet<String> indexedcols = new HashSet<String>();
		
		
		if(curtable.strClusteringKeyColumn.equals("Polygon")) {
			
			for (RTree tree : curtable.RTrees)
				indexedcols.add(tree.SortingKey);
			

			for (SQLTerm s : arrSQLTerms) {
				if (indexedcols.contains(s._strColumnName)) {
					s.indexed = true;
				}
			}
			for (SQLTerm s : arrSQLTerms) {
				String col = s._strColumnName;
				String op = s._strOperator;
				
//				double value = (double)Integer.parseInt(s._objValue.toString());
				Comparable value = (Comparable) s._objValue;

				
				
				int colindx = colindx(tablename, col);
				if (s.indexed) {
					RTree tree = specifictRtree(tablename, col); //make one for rtree
					SortedSet<Comparable> resultskeys=new TreeSet<Comparable>(); //help here
					
					
					
					////////////////////////////////////////////////
					if (op.equals(">")) {
						resultskeys = tree.allkeys.subSet(value, false, tree.allkeys.last(), true);
					} else if (op.equals(">=")) {
						resultskeys = tree.allkeys.subSet(value, true, tree.allkeys.last(), true);
					} else if (op.equals("<")) {
						resultskeys = tree.allkeys.subSet(tree.allkeys.first(), true, value, false);

					} else if (op.equals("<=")) {
						resultskeys = tree.allkeys.subSet(tree.allkeys.first(), true, value, true);

					} else if (op.equals("!=")) {
						resultskeys = tree.allkeys.subSet(tree.allkeys.first(), true, tree.allkeys.last(), true);
						resultskeys.remove(value);

					} else {
						
						resultskeys.add(value);
						
	              System.out.println(resultskeys);
					}
					ArrayList<Ref> refsinpages = new ArrayList<Ref>();
	             
					for ( Comparable c :resultskeys) { //help here
						
						Ref2 curref = tree.search(c);
						for (int i = 0; i < curref.references.size(); i++) {
							refsinpages.add(curref.references.get(i));
						}
					}
					for (int i = 0; i < refsinpages.size(); i++) {
						Page p = despage(curtable.pages.get(refsinpages.get(i).pageNo));
						
						result.add(p.rows.get(refsinpages.get(i).indexInPage));
					}
				} else {

					for (int k = 0; k < curtable.pages.size(); k++) {
						Page p1 = despage(curtable.pages.get(k));
						for (int off = 0; off < p1.rows.size(); off++) {
							if (op.equals(">")) {
								if (compare(p1.rows.get(off).get(colindx), value) > 0) {
									result.add(p1.rows.get(off));
								}
							} else if (op.equals(">=")) {
								if (compare(p1.rows.get(off).get(colindx), value) > 0
										|| compare(p1.rows.get(off).get(colindx), value) == 0) {
									result.add(p1.rows.get(off));
								}
							} else if (op.equals("<")) {
								if (compare(p1.rows.get(off).get(colindx), value) < 0) {
									result.add(p1.rows.get(off));
								}

							} else if (op.equals("<=")) {
								if (compare(p1.rows.get(off).get(colindx), value) < 0
										|| compare(p1.rows.get(off).get(colindx), value) == 0) {
									result.add(p1.rows.get(off));
								}

							} else if (op.equals("!=")) {
								if (compare(p1.rows.get(off).get(colindx), value) != 0) {
									result.add(p1.rows.get(off));
								}

							} else {
								if (compare(p1.rows.get(off).get(colindx), value) == 0) {
									result.add(p1.rows.get(off));
								}

							}
						}
					}
				}
			}
			
			for (int te3bt = 0; te3bt < strarrOperators.length; te3bt++) {
				int indx1 = colindx(arrSQLTerms[te3bt]._strTableName, arrSQLTerms[te3bt]._strColumnName);
				Object value1 = arrSQLTerms[te3bt]._objValue;
				String op1 = arrSQLTerms[te3bt]._strOperator;
				
				int indx2 = colindx(arrSQLTerms[te3bt + 1]._strTableName, arrSQLTerms[te3bt + 1]._strColumnName);
				Object value2 = arrSQLTerms[te3bt + 1]._objValue;
				String op2 = arrSQLTerms[te3bt + 1]._strOperator;
				if (strarrOperators[te3bt].equals("AND")) {
					for (int kefaya=0;kefaya<result.size();kefaya++) {
						boolean cond1 = false;
						boolean cond2 = false;
						if (op1.equals(">")) {
							System.out.println("k;joklk     "+(result.get(kefaya).get(indx1)).getClass()+"      "+value1.getClass());
							if (compareD((result.get(kefaya).get(indx1)), value1) > 0) {
								cond1 = true;
							}
						} else if (op1.equals("=>")) {
							if (compareD(result.get(kefaya).get(indx1), value1) > 0 || compareD((result.get(kefaya).get(indx1)), value1) == 0) {
								cond1 = true;
							}
						} else if (op1.equals("<")) {
							if (compareD(result.get(kefaya).get(indx1), value1) < 0) {
								cond1 = true;
							}
						} else if (op1.equals("<=")) {
							if (compareD(result.get(kefaya).get(indx1), value1) < 0 || compare((polyArea((Polygon)(result.get(kefaya).get(indx1)))), value1) == 0) {
								cond1 = true;
							}
						} else if (op1.equals("!=")) {
							if (compareD(result.get(kefaya).get(indx1), value1) != 0) {
								cond1 = true;
							}
						} else {
							if (compareD(result.get(kefaya).get(indx1), value1) == 0) {
								cond1 = true;
							}

						}
						if (op2.equals(">")) {
							if (compareD(result.get(kefaya).get(indx2), value2) > 0) {
								cond2 = true;
							}
						} else if (op2.equals("=>")) {
							if (compareD(result.get(kefaya).get(indx2), value2) > 0 || compareD(result.get(kefaya).get(indx2), value2) == 0) {
								cond2 = true;
							}
						} else if (op2.equals("<")) {
							if (compareD(result.get(kefaya).get(indx2), value2) < 0) {
								cond2 = true;
							}
						} else if (op2.equals("<=")) {
							if (compareD(result.get(kefaya).get(indx2), value2) < 0 || compareD(result.get(kefaya).get(indx2), value2) == 0) {
								cond2 = true;
							}
						} else if (op2.equals("!=")) {
							if (compareD(result.get(kefaya).get(indx2), value2) != 0) {
								cond2 = true;
							}
						} else {
							if (compareD(result.get(kefaya).get(indx2), value2) == 0) {
								cond2 = true;
							}

						}
						if(cond1 & cond2) {
							//eshta mashy
						}
						else {
							result.remove(kefaya);
							kefaya--;
						}
					}
				}
				if (strarrOperators[te3bt].equals("XOR")) {
					for (int kefaya=0;kefaya<result.size();kefaya++) {
						boolean cond1 = false;
						boolean cond2 = false;
						if (op1.equals(">")) {
							if (compareD(result.get(kefaya).get(indx1), value1) > 0) {
								cond1 = true;
							}
						} else if (op1.equals("=>")) {
							if (compareD(result.get(kefaya).get(indx1), value1) > 0 || compareD(result.get(kefaya).get(indx1), value1) == 0) {
								cond1 = true;
							}
						} else if (op1.equals("<")) {
							if (compareD(result.get(kefaya).get(indx1), value1) < 0) {
								cond1 = true;
							}
						} else if (op1.equals("<=")) {
							if (compareD(result.get(kefaya).get(indx1), value1) < 0 || compareD(result.get(kefaya).get(indx1), value1) == 0) {
								cond1 = true;
							}
						} else if (op1.equals("!=")) {
							if (compareD(result.get(kefaya).get(indx1), value1) != 0) {
								cond1 = true;
							}
						} else {
							if (compareD(result.get(kefaya).get(indx1), value1) == 0) {
								cond1 = true;
							}

						}
						if (op2.equals(">")) {
							if (compareD(result.get(kefaya).get(indx2), value2) > 0) {
								cond2 = true;
							}
						} else if (op2.equals("=>")) {
							if (compareD(result.get(kefaya).get(indx2), value2) > 0 || compareD(result.get(kefaya).get(indx2), value2) == 0) {
								cond2 = true;
							}
						} else if (op2.equals("<")) {
							if (compareD(result.get(kefaya).get(indx2), value2) < 0) {
								cond2 = true;
							}
						} else if (op2.equals("<=")) {
							if (compareD(result.get(kefaya).get(indx2), value2) < 0 || compareD(result.get(kefaya).get(indx2), value2) == 0) {
								cond2 = true;
							}
						} else if (op2.equals("!=")) {
							if (compareD(result.get(kefaya).get(indx2), value2) != 0) {
								cond2 = true;
							}
						} else {
							if (compareD(result.get(kefaya).get(indx2), value2) == 0) {
								cond2 = true;
							}

						}
						if(!(cond1 & cond2) && (cond1|cond2)) {
							//eshta mashy
						}
						else {
							result.remove(kefaya);
							kefaya--;
						}
					}
				}
			}

			//////////////////////////////////////////////
			
		}else {
			for (BPTree tree : curtable.Trees)
				indexedcols.add(tree.SortingKey);
		
		
		for (SQLTerm s : arrSQLTerms) {
			System.out.println(s);
			if (indexedcols.contains(s._strColumnName)) {
				s.indexed = true;
			}
		}
		for (SQLTerm s : arrSQLTerms) {
			String col = s._strColumnName;
			String op = s._strOperator;
			
			Comparable value = (Comparable) s._objValue;
			
			
			int colindx = colindx(tablename, col);
			if (s.indexed) {
				BPTree tree = specifictree(tablename, col); //make one for rtree
				SortedSet<Comparable> resultskeys=new TreeSet<Comparable>();
				
				
				
				////////////////////////////////////////////////
				if (op.equals(">")) {
					resultskeys = tree.allkeys.subSet(value, false, tree.allkeys.last(), true);
				} else if (op.equals(">=")) {
					resultskeys = tree.allkeys.subSet(value, true, tree.allkeys.last(), true);
				} else if (op.equals("<")) {
					resultskeys = tree.allkeys.subSet(tree.allkeys.first(), true, value, false);

				} else if (op.equals("<=")) {
					resultskeys = tree.allkeys.subSet(tree.allkeys.first(), true, value, true);

				} else if (op.equals("!=")) {
					resultskeys = tree.allkeys.subSet(tree.allkeys.first(), true, tree.allkeys.last(), true);
					resultskeys.remove(value);

				} else {
					System.out.println(value.getClass());
					resultskeys.add(value);
					
              System.out.println(resultskeys);
				}
				ArrayList<Ref> refsinpages = new ArrayList<Ref>();
             
				for ( Comparable c : resultskeys) {
					Ref2 curref = tree.search(c);
					for (int i = 0; i < curref.references.size(); i++) {
						refsinpages.add(curref.references.get(i));
					}
				}
				for (int i = 0; i < refsinpages.size(); i++) {
					Page p = despage(curtable.pages.get(refsinpages.get(i).pageNo));
					
					result.add(p.rows.get(refsinpages.get(i).indexInPage));
				}
			} else {

				for (int k = 0; k < curtable.pages.size(); k++) {
					Page p1 = despage(curtable.pages.get(k));
					for (int off = 0; off < p1.rows.size(); off++) {
						if (op.equals(">")) {
							if (compare(p1.rows.get(off).get(colindx), value) > 0) {
								result.add(p1.rows.get(off));
							}
						} else if (op.equals(">=")) {
							if (compare(p1.rows.get(off).get(colindx), value) > 0
									|| compare(p1.rows.get(off).get(colindx), value) == 0) {
								result.add(p1.rows.get(off));
							}
						} else if (op.equals("<")) {
							if (compare(p1.rows.get(off).get(colindx), value) < 0) {
								result.add(p1.rows.get(off));
							}

						} else if (op.equals("<=")) {
							if (compare(p1.rows.get(off).get(colindx), value) < 0
									|| compare(p1.rows.get(off).get(colindx), value) == 0) {
								result.add(p1.rows.get(off));
							}

						} else if (op.equals("!=")) {
							if (compare(p1.rows.get(off).get(colindx), value) != 0) {
								result.add(p1.rows.get(off));
							}

						} else {
							if (compare(p1.rows.get(off).get(colindx), value) == 0) {
								result.add(p1.rows.get(off));
							}

						}
					}
				}
			}
		}
		
		for (int te3bt = 0; te3bt < strarrOperators.length; te3bt++) {
			int indx1 = colindx(arrSQLTerms[te3bt]._strTableName, arrSQLTerms[te3bt]._strColumnName);
			Object value1 = arrSQLTerms[te3bt]._objValue;
			String op1 = arrSQLTerms[te3bt]._strOperator;
			
			int indx2 = colindx(arrSQLTerms[te3bt + 1]._strTableName, arrSQLTerms[te3bt + 1]._strColumnName);
			Object value2 = arrSQLTerms[te3bt + 1]._objValue;
			String op2 = arrSQLTerms[te3bt + 1]._strOperator;
			
			if (strarrOperators[te3bt].equals("AND")) {
				for (int kefaya=0;kefaya<result.size();kefaya++) {
					boolean cond1 = false;
					boolean cond2 = false;
					if (op1.equals(">")) {
						if (compare(result.get(kefaya).get(indx1), value1) > 0) {
							cond1 = true;
						}
					} else if (op1.equals("=>")) {
						if (compare(result.get(kefaya).get(indx1), value1) > 0 || compare(result.get(kefaya).get(indx1), value1) == 0) {
							cond1 = true;
						}
					} else if (op1.equals("<")) {
						if (compare(result.get(kefaya).get(indx1), value1) < 0) {
							cond1 = true;
						}
					} else if (op1.equals("<=")) {
						if (compare(result.get(kefaya).get(indx1), value1) < 0 || compare(result.get(kefaya).get(indx1), value1) == 0) {
							cond1 = true;
						}
					} else if (op1.equals("!=")) {
						if (compare(result.get(kefaya).get(indx1), value1) != 0) {
							cond1 = true;
						}
					} else {
						if (compare(result.get(kefaya).get(indx1), value1) == 0) {
							cond1 = true;
						}

					}
					if (op2.equals(">")) {
						if (compare(result.get(kefaya).get(indx2), value2) > 0) {
							cond2 = true;
						}
					} else if (op2.equals("=>")) {
						if (compare(result.get(kefaya).get(indx2), value2) > 0 || compare(result.get(kefaya).get(indx2), value2) == 0) {
							cond2 = true;
						}
					} else if (op2.equals("<")) {
						if (compare(result.get(kefaya).get(indx2), value2) < 0) {
							cond2 = true;
						}
					} else if (op2.equals("<=")) {
						if (compare(result.get(kefaya).get(indx2), value2) < 0 || compare(result.get(kefaya).get(indx2), value2) == 0) {
							cond2 = true;
						}
					} else if (op2.equals("!=")) {
						if (compare(result.get(kefaya).get(indx2), value2) != 0) {
							cond2 = true;
						}
					} else {
						if (compare(result.get(kefaya).get(indx2), value2) == 0) {
							cond2 = true;
						}

					}
					if(cond1 & cond2) {
						//eshta mashy
					}
					else {
						result.remove(kefaya);
						kefaya--;
					}
				}
			}
			if (strarrOperators[te3bt].equals("XOR")) {
				for (int kefaya=0;kefaya<result.size();kefaya++) {
					boolean cond1 = false;
					boolean cond2 = false;
					if (op1.equals(">")) {
						if (compare(result.get(kefaya).get(indx1), value1) > 0) {
							cond1 = true;
						}
					} else if (op1.equals("=>")) {
						if (compare(result.get(kefaya).get(indx1), value1) > 0 || compare(result.get(kefaya).get(indx1), value1) == 0) {
							cond1 = true;
						}
					} else if (op1.equals("<")) {
						if (compare(result.get(kefaya).get(indx1), value1) < 0) {
							cond1 = true;
						}
					} else if (op1.equals("<=")) {
						if (compare(result.get(kefaya).get(indx1), value1) < 0 || compare(result.get(kefaya).get(indx1), value1) == 0) {
							cond1 = true;
						}
					} else if (op1.equals("!=")) {
						if (compare(result.get(kefaya).get(indx1), value1) != 0) {
							cond1 = true;
						}
					} else {
						if (compare(result.get(kefaya).get(indx1), value1) == 0) {
							cond1 = true;
						}

					}
					if (op2.equals(">")) {
						if (compare(result.get(kefaya).get(indx2), value2) > 0) {
							cond2 = true;
						}
					} else if (op2.equals("=>")) {
						if (compare(result.get(kefaya).get(indx2), value2) > 0 || compare(result.get(kefaya).get(indx2), value2) == 0) {
							cond2 = true;
						}
					} else if (op2.equals("<")) {
						if (compare(result.get(kefaya).get(indx2), value2) < 0) {
							cond2 = true;
						}
					} else if (op2.equals("<=")) {
						if (compare(result.get(kefaya).get(indx2), value2) < 0 || compare(result.get(kefaya).get(indx2), value2) == 0) {
							cond2 = true;
						}
					} else if (op2.equals("!=")) {
						if (compare(result.get(kefaya).get(indx2), value2) != 0) {
							cond2 = true;
						}
					} else {
						if (compare(result.get(kefaya).get(indx2), value2) == 0) {
							cond2 = true;
						}

					}
					if(!(cond1 & cond2) && (cond1|cond2)) {
						//eshta mashy
					}
					else {
						result.remove(kefaya);
						kefaya--;
					}
				}
			}
		}
	}
		Iterator<Vector> returnresult = result.iterator();
		return returnresult;

	}
	public double compareD(Object x, Object y) {
		if(x instanceof Integer && y instanceof Double) {
			double r = (int)x;
			return compare(r,(double)y);
		}
		else if (x instanceof Integer) {
				return ((Integer) x).compareTo((Integer) y);
			} else if (x instanceof String) {
				return ((String) x).compareTo((String) y);
			} else if (x instanceof Double) {
				return ((Double) x).compareTo((Double) y);
			} else if (x instanceof Date) {
				return ((Date) x).compareTo((Date) y);
			}else if(x instanceof Polygon && y instanceof Double) {
				return compare(polyArea((Polygon)x),(double)y);
				
			}else { // polygon
				
				Dimension dim = ((Polygon) x).getBounds().getSize();
				Dimension dim2 = ((Polygon) y).getBounds().getSize();
				double area = dim.width * dim.height;
				double area2 = dim2.width * dim2.height;
				if (area > area2)
					return 1;
				else if (area2 > area)
					return -1;
				else
					return 0;
			}
		}
	public void createTable(String strTableName, String strClusteringKeyColumn,
			Hashtable<String, String> htblColNameType) throws Exception {

		String type="";
		PrintWriter writer = new PrintWriter(new FileWriter("data/metadata.csv", true));
		Set<String> keys = htblColNameType.keySet();
		for (String key : keys) {
			boolean cluster = false;
			
			
			
			if (strClusteringKeyColumn.equals(key)) {
				cluster = true;
				type=htblColNameType.get(key);
			}
			writer.write(
					strTableName + "," + key + "," + htblColNameType.get(key) + "," + cluster + "," + "false" + "\n");
		}

		Table table1 = new Table(strTableName, strClusteringKeyColumn);
		table1.createtablefile("data/" + strTableName + ".ser");

//			ArrayList<Table> a = destable("data/tables.serÃ¢ï¿½Â©");
//			a.add(table1);
		if(type.equals("java.awt.Polygon")) {
			//System.out.println("abl create RTree ");
			//table1.RTrees = new ArrayList<RTree>();
			sertable(table1);
			CreateRTreeIndex(strTableName, strClusteringKeyColumn);
			//System.out.println("str cluster key column: "+strClusteringKeyColumn);
			//System.out.println("b3d create RTree ");
			
		}
		else {
		//table1.Trees = new ArrayList<BPTree>();
		sertable(table1);
		CreateBTreeIndex(strTableName, strClusteringKeyColumn);
		}
		writer.close();
	}

	public boolean tableispopulated(String tablename) {
		Table curt = destable("data/" + tablename + ".ser");
		if (curt.pages.size() > 0) {
			Page p = despage(curt.pages.get(0));
			if (p.rows.size() > 0) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	public void CreateBTreeIndex(String strTableName, String strColName) throws Exception {
//		BufferedReader br = new BufferedReader(new FileReader("data/metadata.csv"));
//		PrintWriter writer = new PrintWriter(new FileWriter("data/metadata.csv"));
//
//		while (br.ready()) {
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			String tablename = st.nextToken();
//			String colname = st.nextToken();
//			String type = st.nextToken();
//			String booleancluster = st.nextToken();
//			if (tablename.equals(strTableName) && colname.equals(strColName)) {
//				writer.write(strTableName + "," + strColName + "," + type + "," + booleancluster + "," + "true" + "\n");
//
//			} else {
//				writer.write(
//						strTableName + "," + strColName + "," + type + "," + booleancluster + "," + "false" + "\n");
//			}
//		}
		try (InputStream input = new FileInputStream("config/DBApp.properties")) {

			Properties prop = new Properties();

			// load a properties file
			prop.load(input);

			// get the property value and print it out
			int n = Integer.parseInt(prop.getProperty("NodeSize"));
			BPTree tree = new BPTree(n, strColName, strTableName);
			metadataRead(strTableName, strColName);
			Table table = destable("data/" + strTableName + ".ser");
			table.Trees.add(tree);
			if (tableispopulated(strTableName)) {
				int sortingkeyindex = colindx(strTableName, strColName);
				for (int i = 0; i < table.pages.size(); i++) {
					Page p = despage(table.pages.get(i));
					for (int j = 0; j < p.rows.size(); j++) {
						tree.insert((Comparable) p.rows.get(j).get(sortingkeyindex), new Ref(i, j));
					}
				}

			}
			sertable(table);

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	public void CreateRTreeIndex(String strTableName, String strColName) throws Exception {
		try (InputStream input = new FileInputStream("config/DBApp.properties")) {

			Properties prop = new Properties();

			// load a properties file
			prop.load(input);

			// get the property value and print it out
			int n = Integer.parseInt(prop.getProperty("NodeSize"));
			RTree tree = new RTree(n, strColName, strTableName);
			metadataRead(strTableName, strColName);
			Table table = destable("data/" + strTableName + ".ser");
			table.RTrees.add(tree);
			if (tableispopulated(strTableName)) {
				int sortingkeyindex = colindx(strTableName, strColName);
				for (int i = 0; i < table.pages.size(); i++) {
					Page p = despage(table.pages.get(i));
					for (int j = 0; j < p.rows.size(); j++) {
						tree.insert(polyArea((Polygon) p.rows.get(j).get(sortingkeyindex)), new Ref(i, j));
					}
				}

			}
			sertable(table);

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
//	public void insertIntoTable1(String strTableName, Hashtable<String, Object> htblColNameValue) throws IOException {
//		Table table = destable("data/" + strTableName + ".ser");
//		BPTree clustertree = table.Trees.get(0);
//		TreeSet<Comparable> clustertreekeys = clustertree.allkeys;
//		Object clusterkeyvalue = htblColNameValue.get(nameofkey(strTableName));
//		Comparable lower = clustertreekeys.lower((Comparable) clusterkeyvalue);
//		if (lower == null) {
//			if (table.pages.size() == 0) {
//				Page p = new Page("page0", "data/" + strTableName + "page0" + ".ser", clusterkeyvalue, clusterkeyvalue,
//						getmax());
//
//			}
//			else {
//				Page p=despage(table.pages.get(0));
//				Set<String> keys=htblColNameValue.keySet();
//				Vector curRecord=new Vector();
//				for(String s:keys) {
//					curRecord.set(colindx(strTableName, s), htblColNameValue.get(s));
//				}
//				p.rows.add(0, curRecord);
//			/}
//		}
//	}
	public void metadataRead(String s, String s2) throws IOException {
		BufferedReader csvReader = new BufferedReader(new FileReader("data/metadata.csv"));
		String row = "";
		while ((row = csvReader.readLine()) != null) {
		    String[] data = (row).split(",");
		    for(int i=0; i<data.length; i++) {
		    	if(data[i].equals(s) && data[i+2].equals(s2)) {
		    		data[i+4]="true";
		    		i+=5;
		    		}
		    }
		}
		csvReader.close();
	}
	public double polyArea(Polygon a) {
		Dimension dim = ((Polygon) a).getBounds().getSize();
		double area = dim.width * dim.height;
		return area;
	}
	public Page getPage(Table table, int pageindex) {

		if (pageindex > table.pages.size() || pageindex == table.pages.size())
			return null;
		else
			return despage(table.pages.get(pageindex));
	}

	public void insertIntoTable(String strTableName, Hashtable<String, Object> htblColNameValue) throws IOException {

		Table table = destable("data/" + strTableName + ".ser");
        System.out.println("auauaua");
		BufferedReader br = new BufferedReader(new FileReader("data/metadata.csv"));

		Vector v = new Vector();
		while (br.ready()) {

			StringTokenizer st = new StringTokenizer(br.readLine(), ",");

			if (st.nextToken().equals(strTableName)) {
				String col = st.nextToken();
				v.add(htblColNameValue.get(col));
//				
			}
		}
		 RTree clusterRtree;
		 BPTree clusterBPtree;
		 TreeSet<Object> treekeys;
		 Object clustervalue ;
		 Object lower;
		 boolean pol=false;
		 int clusterindex = colindx(strTableName, nameofkey(strTableName));
		 int page = 0;
		int index = 0;
		//int clusterindex = colindx(strTableName, nameofkey(strTableName));
		Object value = htblColNameValue.get(nameofkey(strTableName));
		if(value instanceof Polygon) {
        clusterRtree=table.RTrees.get(0);
        pol=true;
		treekeys = clusterRtree.allkeys;
		clustervalue = polyArea((Polygon)htblColNameValue.get(nameofkey(strTableName)));
		  lower = treekeys.lower(clustervalue);
		  if (treekeys.contains(clustervalue))
				lower = clustervalue;
		 
		  if (lower != null) {
				
				Ref2 ref = clusterRtree.search((Comparable) lower);

				Vector<Ref> ref1 = ref.references;

				page = ref1.get(ref1.size()-1).pageNo; //HENNA
				index = ref1.get(ref1.size()-1).indexInPage; //HENNA
				index++;
				if (index > getmax() - 1) {
					// System.out.println("hi");
					index = 0;
					page++;
				}

				// System.out.println(clustertree.search((Comparable)lower).references.get(0));
				// System.out.println(lower + "," + value.toString() + "," + page + "," +
				// index);
			}
			Page p = getPage(table, page);
			//clustertree.insert((Comparable) clustervalue, new Ref(page, index));
			if (p == null) {

				p = new Page("page" + page, "data/" + strTableName + "page" + page + ".ser", v.get(clusterindex),
						v.get(clusterindex), getmax()); // a3mlha b index
				p.createfile(p.location);

				// pair p1 = new pair(p.name, p.location);
				table.pages.add(p.location);
				p.rows.add(v);
				serpage(p);
			} else {
				p.rows.add(index, v);

				p.min = p.rows.get(0).get(clusterindex);
				// p.max=p.rows.get(p.rows.size()-1).get(clusterindex);
				if (p.rows.size() > getmax()) {
					Shift(p.rows.get(p.rows.size() - 1), table, page + 1, getmax(), clusterindex);
					p.rows.remove(p.rows.size() - 1);
				}

				p.max = p.rows.get(p.rows.size() - 1);
				serpage(p);
			}
			// Object t=treekeys.higher(clustervalue);
		//	clusterRtree.insert((Comparable) clustervalue, new Ref(page, index));

			for(BPTree tree :table.Trees) { //HENNA el for loop de kolaha
				int sortindex=colindx(strTableName, tree.SortingKey);
				tree.insert((Comparable) v.get(sortindex),new Ref(page, index));
			}
			for (BPTree tree : table.Trees) {
				SortedSet<Comparable> s = tree.allkeys.subSet(v.get(colindx(strTableName, tree.SortingKey)), false,
						tree.allkeys.last(), true);
				for (Object c : s) {
					Ref2 r = tree.search((Comparable) c);

					for (int i = 0; i < r.references.size(); i++) {
						int newpage = r.references.get(0).pageNo;  //
						int newindex = r.references.get(0).indexInPage + 1; 
						tree.delete((Comparable) c, r.references.get(0));

						if (newindex > getmax() - 1) {
							newpage++;
							newindex = 0;
						}
						tree.insert((Comparable) c, new Ref(newpage, newindex));

					}
				}
			}
			if(table.Trees.size()>0){
		    clusterBPtree = table.Trees.get(0);	
			for(Object c:clusterBPtree.allkeys) {
				for(int i=0;i<clusterBPtree.search((Comparable)c).references.size();i++) {
					System.out.println(c+"hi"+clusterBPtree.search((Comparable)c).references.get(i).pageNo+"hi"+clusterBPtree.search((Comparable)c).references.get(i).indexInPage);
				}
			}}

			for(int kkk=0;kkk<table.Trees.size();kkk++) {
				int indexsorting=colindx(strTableName, table.Trees.get(kkk).SortingKey);
				 if(!table.Trees.get(kkk).search((Comparable)v.get(indexsorting)).references.equals(null)) {
			Vector<Ref> r=table.Trees.get(kkk).search((Comparable)v.get(indexsorting)).references;
			boolean flag =false;
			for(int i=0;i<r.size();i++) {
				if(r.get(i).pageNo==page&& r.get(i).indexInPage==index) {
					flag=true;
					break;
				}
			
			}
			if(!flag)
				table.Trees.get(kkk).insert((Comparable) v.get(indexsorting), new Ref(page, index));
			}}
			
			for(RTree tree :table.RTrees) {
			int sortindex=colindx(strTableName, tree.SortingKey);
 
			//System.out.println(v.get(3)+"kkkkkkkkkkk "+sortindex +"       "+tree.SortingKey);
			tree.insert(polyArea((Polygon) v.get(sortindex)),new Ref(page, index));
		}
 		
		for (RTree tree : table.RTrees) {
		SortedSet<Comparable> s = tree.allkeys.subSet(polyArea((Polygon)v.get(colindx(strTableName, tree.SortingKey))), false,
				tree.allkeys.last(), true);
		for (Object c : s) {
			Ref2 r = tree.search((Comparable) c);

			for (int i = 0; i < r.references.size(); i++) {
				int newpage = r.references.get(0).pageNo;
				int newindex = r.references.get(0).indexInPage + 1;
				tree.delete((Comparable) c, r.references.get(0));

				if (newindex > getmax() - 1) {
					newpage++;
					newindex = 0;
				}
				tree.insert((Comparable) c, new Ref(newpage, newindex));

			}
		}
	}
		
		if(table.RTrees.size()>0){
		//    clusterRtree = table.RTrees.get(0);	
			for(Object c:clusterRtree.allkeys) {
				for(int i=0;i<clusterRtree.search((Comparable)c).references.size();i++) {
					System.out.println(c+"hi"+clusterRtree.search((Comparable)c).references.get(i).pageNo+"hi"+clusterRtree.search((Comparable)c).references.get(i).indexInPage);
				}
			}}
		for(int kkk=0;kkk<table.RTrees.size();kkk++) {
			int indexsorting=colindx(strTableName, table.RTrees.get(kkk).SortingKey);
	     if(!table.RTrees.get(kkk).search(polyArea((Polygon)v.get(indexsorting))).references.equals(null)) {
	    //	break; 
	    
	    // else {	 
		Vector<Ref> r=table.RTrees.get(kkk).search(polyArea((Polygon)v.get(indexsorting))).references;
		boolean flag =false;
		for(int i=0;i<r.size();i++) {
			if(r.get(i).pageNo==page&& r.get(i).indexInPage==index) {
				flag=true;
				break;
			}
		
		}
		if(!flag)
			table.RTrees.get(kkk).insert((Comparable)polyArea((Polygon) v.get(indexsorting)), new Ref(page, index));
		}}
		}
		else {	//henna 5alas
		    clusterBPtree = table.Trees.get(0);
		    treekeys = clusterBPtree.allkeys;
		    clustervalue = htblColNameValue.get(nameofkey(strTableName));
			  lower = treekeys.lower(clustervalue);
			  if (treekeys.contains(clustervalue))
					lower = clustervalue;
			  
			  if (lower != null) {
					
					Ref2 ref = clusterBPtree.search((Comparable) lower);

					Vector<Ref> ref1 = ref.references;

					
						page = ref1.get(ref1.size()-1).pageNo; //HENNA
						index = ref1.get(ref1.size()-1).indexInPage; //HENNA
						// System.out.println(page + "fgfg" + index);
					
					index++;
					if (index > getmax() - 1) {
						// System.out.println("hi");
						index = 0;
						page++;
					}

					// System.out.println(clustertree.search((Comparable)lower).references.get(0));
					 System.out.println(lower + "," + value.toString() + "," + page + "," +
					 index);
				}
				Page p = getPage(table, page);
				//clustertree.insert((Comparable) clustervalue, new Ref(page, index));
				if (p == null) {

					p = new Page("page" + page, "data/" + strTableName + "page" + page + ".ser", v.get(clusterindex),
							v.get(clusterindex), getmax()); // a3mlha b index
					p.createfile(p.location);

					// pair p1 = new pair(p.name, p.location);
					table.pages.add(p.location);
					p.rows.add(v);
					serpage(p);
					
					
					
				} else {
					p.rows.add(index, v);

					p.min = p.rows.get(0).get(clusterindex);
					// p.max=p.rows.get(p.rows.size()-1).get(clusterindex);
					if (p.rows.size() > getmax()) {
						Shift(p.rows.get(p.rows.size() - 1), table, page + 1, getmax(), clusterindex);
						p.rows.remove(p.rows.size() - 1);
					}

					p.max = p.rows.get(p.rows.size() - 1).get( clusterindex);
					serpage(p);
				}
				// Object t=treekeys.higher(clustervalue);
				//gedeed
				//clusterBPtree.insert((Comparable) clustervalue, new Ref(page, index));
				
				//gedeed
				for(BPTree tree :table.Trees) { //HENNA el for loop de kolaha
					int sortindex=colindx(strTableName, tree.SortingKey);
					tree.insert((Comparable) v.get(sortindex),new Ref(page, index));
				}
				for (BPTree tree : table.Trees) {
					SortedSet<Comparable> s = tree.allkeys.subSet(v.get(colindx(strTableName, tree.SortingKey)), false,
							tree.allkeys.last(), true);
					for (Object c : s) {
						Ref2 r = tree.search((Comparable) c);

						for (int i = 0; i < r.references.size(); i++) {
							int newpage = r.references.get(0).pageNo;  //
							int newindex = r.references.get(0).indexInPage + 1; 
							tree.delete((Comparable) c, r.references.get(0));

							if (newindex > getmax() - 1) {
								newpage++;
								newindex = 0;
							}
							tree.insert((Comparable) c, new Ref(newpage, newindex));

						}
					}
				}
				for(Object c:clusterBPtree.allkeys) {
					for(int i=0;i<clusterBPtree.search((Comparable)c).references.size();i++) {
						System.out.println(c+"hi"+clusterBPtree.search((Comparable)c).references.get(i).pageNo+"hi"+clusterBPtree.search((Comparable)c).references.get(i).indexInPage);
					}
				}
				
				for(int kkk=0;kkk<table.Trees.size();kkk++) {
					int indexsorting=colindx(strTableName, table.Trees.get(kkk).SortingKey);
					if(!table.Trees.get(kkk).search((Comparable)v.get(indexsorting)).references.equals(null)) {
				Vector<Ref> r=table.Trees.get(kkk).search((Comparable)v.get(indexsorting)).references;
				boolean flag =false;
				for(int i=0;i<r.size();i++) {
					if(r.get(i).pageNo==page&& r.get(i).indexInPage==index) {
						flag=true;
						break;
					}
				
				}
				if(!flag)
					table.Trees.get(kkk).insert((Comparable) v.get(indexsorting), new Ref(page, index));
				}
				}
			
				
				for(RTree tree :table.RTrees) {
					int sortindex=colindx(strTableName, tree.SortingKey);
		 
					//System.out.println(v.get(3)+"kkkkkkkkkkk "+sortindex +"       "+tree.SortingKey);
					tree.insert(polyArea((Polygon) v.get(sortindex)),new Ref(page, index));
				}
		 		
				for (RTree tree : table.RTrees) {
				SortedSet<Comparable> s = tree.allkeys.subSet(polyArea((Polygon)v.get(colindx(strTableName, tree.SortingKey))), false,
						tree.allkeys.last(), true);
				for (Object c : s) {
					Ref2 r = tree.search((Comparable) c);

					for (int i = 0; i < r.references.size(); i++) {
						int newpage = r.references.get(0).pageNo;
						int newindex = r.references.get(0).indexInPage + 1;
						tree.delete((Comparable) c, r.references.get(0));

						if (newindex > getmax() - 1) {
							newpage++;
							newindex = 0;
						}
						tree.insert((Comparable) c, new Ref(newpage, newindex));

					}
				}
			}
				if(table.RTrees.size()>0){
				    clusterRtree = table.RTrees.get(0);	
					for(Object c:clusterRtree.allkeys) {
						for(int i=0;i<clusterRtree.search((Comparable)c).references.size();i++) {
							System.out.println(c+"hi"+clusterRtree.search((Comparable)c).references.get(i).pageNo+"hi"+clusterRtree.search((Comparable)c).references.get(i).indexInPage);
						}
					}}
				
				for(int kkk=0;kkk<table.RTrees.size();kkk++) {
					int indexsorting=colindx(strTableName, table.RTrees.get(kkk).SortingKey);
			     if(!table.RTrees.get(kkk).search(polyArea((Polygon)v.get(indexsorting)) ).references.equals(null)) {
			    //	break; 
			    
			    // else {	 
				Vector<Ref> r=table.RTrees.get(kkk).search(polyArea((Polygon)v.get(indexsorting))).references;
				boolean flag =false;
				for(int i=0;i<r.size();i++) {
					if(r.get(i).pageNo==page&& r.get(i).indexInPage==index) {
						flag=true;
						break;
					}
				
				}
				if(!flag)
					table.RTrees.get(kkk).insert((Comparable)polyArea((Polygon) v.get(indexsorting)), new Ref(page, index));
				}}
//				Vector<Ref> r=clusterBPtree.search((Comparable)clustervalue).references;
//				boolean flag =false;
//				for(int i=0;i<r.size();i++) {
//					if(r.get(i).pageNo==page&& r.get(i).indexInPage==index) {
//						flag=true;
//						break;
//					}
//				}
//				if(!flag)
//					clusterBPtree.insert((Comparable) clustervalue, new Ref(page, index));
				
		 
			}
 
		
		//////////////////ha3mel comment mn awel heenna
		////////////////////////////////////////////////////
		
	//	 clusterBPtree = table.Trees.get(0);
//		for(BPTree tree :table.Trees) {
//			int sortindex=colindx(strTableName, tree.SortingKey);
//			tree.insert((Comparable) v.get(sortindex),new Ref(page, index));
//		}
//		//gedeed
//		for (BPTree tree : table.Trees) {
//			SortedSet<Comparable> s = tree.allkeys.subSet(v.get(colindx(strTableName, tree.SortingKey)), false,
//					tree.allkeys.last(), true);
//			for (Object c : s) {
//				Ref2 r = tree.search((Comparable) c);
//
//				for (int i = 0; i < r.references.size(); i++) {
//					int newpage = r.references.get(0).pageNo;
//					int newindex = r.references.get(0).indexInPage + 1;
//					tree.delete((Comparable) c, r.references.get(0));
//
//					if (newindex > getmax() - 1) {
//						newpage++;
//						newindex = 0;
//					}
//					tree.insert((Comparable) c, new Ref(newpage, newindex));
//
//				}
//			}
//		}
//		///////////////////
//		for(RTree tree :table.RTrees) {
//			int sortindex=colindx(strTableName, tree.SortingKey);
////			String namekey = nameofkey(strTableName);
//	//	int indexx = indexcuster(strTableName, tree.SortingKey);
//			System.out.println(v.get(3)+"kkkkkkkkkkk "+sortindex +"       "+tree.SortingKey);
//			tree.insert(polyArea((Polygon) v.get(sortindex)),new Ref(page, index));
//		}
//		
//		
//		for (RTree tree : table.RTrees) {
//		SortedSet<Comparable> s = tree.allkeys.subSet(polyArea((Polygon)v.get(colindx(strTableName, tree.SortingKey))), false,
//				tree.allkeys.last(), true);
//		for (Object c : s) {
//			Ref2 r = tree.search((Comparable) c);
//
//			for (int i = 0; i < r.references.size(); i++) {
//				int newpage = r.references.get(0).pageNo;
//				int newindex = r.references.get(0).indexInPage + 1;
//				tree.delete((Comparable) c, r.references.get(0));
//
//				if (newindex > getmax() - 1) {
//					newpage++;
//					newindex = 0;
//				}
//				tree.insert((Comparable) c, new Ref(newpage, newindex));
//
//			}
//		}
//	}
//		
//		
		

		
		
		sertable(table);
	}

	public void Shift(Vector row, Table tt, int nextpage, int max, int clusterkeyindx) {
		Vector<String> t = tt.pages;

		if (t.size() - 1 < nextpage) { // lw mfeeh page b3dha
			// el mafrood check eza kan feeh mkaan f el page b3dha aw l2 lw mfee4 ha3ml
			// shift
			Page p = new Page("page" + nextpage, "data/" + tt.strTableName + "page" + nextpage + ".ser",
					row.get(clusterkeyindx), row.get(clusterkeyindx), max);
			// pair p1 = new pair(p.name, p.location);
			t.add(p.location);
			p.rows.add(row);
			p.min = row.get(clusterkeyindx);
			p.max = row.get(clusterkeyindx);
			p.N = max;
			serpage(p);
			// we need to serialize the page
			return;
		} else {
			Page p = (Page) despage(t.get(nextpage));
			if (p.rows.size() < max) {
				p.rows.add(0, row);
				p.min = row.get(clusterkeyindx);
				serpage(p);
			} else if (p.rows.size() == max) {
				Vector temp = p.rows.get(p.rows.size() - 1);
				p.max = p.rows.get(max - 2).get(clusterkeyindx);
				p.min = row.get(clusterkeyindx);
				p.rows.remove(max - 1);

				p.rows.add(0, row);

				serpage(p);
				nextpage = nextpage + 1;
				Shift(temp, tt, nextpage, max, clusterkeyindx);
			}

		}
	}

	public static Table getTable(String tabelname, ArrayList<Table> ts) {
		Table x = null;
		for (int i = 0; i < ts.size(); i++) {
			if (ts.get(i).strTableName.equals(tabelname)) {
				x = ts.get(i);
				break;
			}

		}
		return x;

	}

	public void serpage(Page p) {

		try {
			FileOutputStream fileOut = new FileOutputStream(p.location);
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(p);
			out.close();
			fileOut.close();
			// .out.printf("Serialized data is saved in /tmp/employee.ser");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}

	public Page despage(String location) {
		try {
			FileInputStream fileIn = new FileInputStream(location);
			ObjectInputStream in = new ObjectInputStream(fileIn);
			Page p = (Page) in.readObject();
			in.close();
			fileIn.close();
			return p;
		} catch (IOException i) {
			i.printStackTrace();
			return null;
		} catch (ClassNotFoundException c) {

			c.printStackTrace();
			return null;
		}

	}

	public int indexcuster(String tablename, String clusterkeyname) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("data/metadata.csv"));
		int idx = 0;
		while (br.ready()) {
			StringTokenizer st = new StringTokenizer(br.readLine(), ",");
			String name = st.nextToken();
			String key = st.nextToken();
			if (name.equals(tablename) && key.contentEquals(clusterkeyname)) {
				br.close();
				break;
			} else if (name.equals(tablename)) {
				idx++;
			}

		}
		return idx;
	}

	public String nameofkey(String tablename) throws IOException {

		BufferedReader brr = new BufferedReader(new FileReader("data/metadata.csv"));
		// System.out.println("foo2 3and el true");
		while (brr.ready()) {
			StringTokenizer st = new StringTokenizer(brr.readLine(), ",");
			String name = st.nextToken();
			String nameofkey = st.nextToken();
			String x2 = st.nextToken();
			if (name.equals(tablename)) {

				String x = st.nextToken();
				if (x.equals("true")) {
					// System.out.println("3and el true");
					brr.close();
					return nameofkey;
				}

			}
		}
		return "";

	}

	public Page Get(String tablename, Hashtable<String, Object> htblColNameValue) throws IOException {
		// ArrayList<Table> e =destable("data/tables.serÃ¢ï¿½Â©");

		Table x = destable("data/" + tablename + ".ser");

		int counter = -1;
		boolean flag;
		String key = x.strClusteringKeyColumn;
		Hashtable<String, Object> temp = htblColNameValue;
		Object value = temp.get(key);
//			System.out.println(x.pages.size());
		Vector<String> v = x.pages;
		// String loc = v.get(0);
//		Page ppp = despage(v.get(0)); 
//		 Object hhh=ppp.max;
//		System.out.println (hhh+"mmff");
		// Page desiredP = null;

		for (int i = 0; i < v.size(); i++) {
			String loc = v.get(i);

			Page p = despage(loc);

			int indexkey = indexcuster(x.strTableName, key);

			// Object min = p.rows.get(0).get(indexkey);
			// Object max = p.rows.get((p.rows.size()-1 )).get(indexkey);

			// (compare(value, p.min) >= 0 &&p.rows.size() < p.N))
			Object h = p.max;

//			if ((compare(value, p.min) >= 0 && compare(p.max, value) >= 0) || compare(value, p.min) < 0) {
//				flag = true;
//				counter = i;
//				System.out.println("gwa el if");
//				break;
//				 
//			}

//			else { //lw less than el min w feeh mkan f el page 
			if (compare(value, p.min) >= 0) {
//					int xx = i + 1;
				// i<size
				// i+1< sixe
				Object hh = p.max;

				if (compare(p.max, value) >= 0) {

					flag = true;
					counter = i;
					serpage(p);

					break;

				} else {
					if (v.size() == i + 1) { // lw ml2t4 feeh page
						flag = true;
						counter = i;
						serpage(p);

						break;
					}

					else {
						int r = p.rows.size();
						int m = p.N;
						serpage(p);
						Page nextPage = despage(x.pages.get(i + 1));
						Object s = nextPage.min;
						serpage(nextPage);
						if (compare(value, s) < 0 && r < m) {
							flag = true;
							counter = i;

							break;
							// dh lma neegy nd5ol page tanya brdo ndwar feeha
							// hna 3auxeen nkml f el for loop 33ady gedan

						}

					}
				}
			} else if (compare(value, p.min) < 0) {

				counter = i;
				flag = true;
				serpage(p);
				break;

			}
		}

		if (counter == -1)
			return null;

		return (despage(x.pages.get(counter)));

//					serpage(p);
//					Page nextPage=	despage(  x.pages.get(i+1));

//					}
//				if( p.rows.size()==p.N &&  i+1 ==x.pages.size()) {
//					return null;
//				}
//				else {
//				if(i+1 < x.pages.size()) {
//				Object max= p.max;
//				int n=p.rows.size();
//	            serpage(p);
//				Page nextPage=	despage(  x.pages.get(pageindx+1));
//				if(compare(nextPage.min, value )>=0&&(n<nextPage.N)) {
//					 serpage(nextPage);
//	                p=  despage(  x.pages.get(pageindx)); // sa7 wla ehhhhhhhhhh
//	                desiredP=p;
//	                 
//					break;
//				}}
//					
//				}
//				}
//				serpage(p);
//			}
//			sertable(x);
//			return desiredP;
		//
	}

	public int compare(Object x, Object y) {
		if (x instanceof Integer) {
			return ((Integer) x).compareTo((Integer) y);
		} else if (x instanceof String) {
			return ((String) x).compareTo((String) y);
		} else if (x instanceof Double) {
			return ((Double) x).compareTo((Double) y);
		} else if (x instanceof Date) {
			return ((Date) x).compareTo((Date) y);
		} else { // polygon

			Dimension dim = ((Polygon) x).getBounds().getSize();
			Dimension dim2 = ((Polygon) y).getBounds().getSize();
			double area = dim.width * dim.height;
			double area2 = dim2.width * dim2.height;
			if (area > area2)
				return 1;
			else if (area2 > area)
				return -1;
			else
				return 0;
		}

	}

	public void sertable(Table ta) {

		try {
			FileOutputStream fileOut = new FileOutputStream("data/" + ta.strTableName + ".ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(ta);
			out.close();
			fileOut.close();
			// System.out.printf("Serialized data is saved in /tmp/employee.ser");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}

	public Table destable(String location) {

		try {
			FileInputStream fileIn = new FileInputStream(location);

			ObjectInputStream in = new ObjectInputStream(fileIn);
			Table e = (Table) in.readObject();

			in.close();
			fileIn.close();
			return e;
		}

		catch (IOException i) {
			i.printStackTrace();
			System.out.println("not found exception");
			return null;

		} catch (ClassNotFoundException c) {
			System.out.println("Employee class not found");
			c.printStackTrace();
			return null;
		}

	}

	public boolean isindex(String col, Table table) {
		for (BPTree tree : table.Trees) {
			if (tree.SortingKey.equals(col))
				return true;
		}
		for (RTree tree : table.RTrees) {
			if (tree.SortingKey.equals(col))
				return true;
		}
		
		
		
		return false;
	}
	public boolean isindexR(String col, Table table) {
		for (RTree tree : table.RTrees) {
			if (tree.SortingKey.equals(col))
				return true;
		}
		return false;
	}
	public void deleteFromTable(String strTableName, Hashtable<String, Object> htblColNameValue) throws IOException {
		// ArrayList<Table> t = destable("data/tables.ser");

		// Page pp=despage("data/page0.ser");
		// System.out.println("line437 "+t.size());
		Table currentT = destable("data/" + strTableName + ".ser");
		int page = 0;
		boolean flag=false;
	//	int index = 0;
		Set<String> keys = htblColNameValue.keySet();
		HashMap<String, Integer> pages = new HashMap<String, Integer>();
//System.out.println(keys);
		for (String s : keys) {
			System.out.println(keys.size());
			if (isindex(s, currentT)) {
				System.out.println(currentT.Trees.size()+"hna");
				for (BPTree tree : currentT.Trees) {
					System.out.println( "hkhk");

					if (tree.SortingKey.equals(s)) {
						System.out.println(tree.SortingKey+" "+tree.search((Comparable) htblColNameValue.get(s)).references+"hkhk");

						for (int i = 0; i < tree.search((Comparable) htblColNameValue.get(s)).references.size(); i++) {
							int value1 = pages.getOrDefault(tree.search((Comparable) htblColNameValue.get(s)).references
									.get(i).pageNo + ","
									+ tree.search((Comparable) htblColNameValue.get(s)).references.get(i).indexInPage,
									0);
							
							pages.put(tree.search((Comparable) htblColNameValue.get(s)).references.get(i).pageNo + ","
									+ tree.search((Comparable) htblColNameValue.get(s)).references.get(i).indexInPage,
									value1 +1);

							// break;
						}

					}
				}
				for (RTree tree : currentT.RTrees) {
					//	System.out.println( "hkhk");

						if (tree.SortingKey.equals(s)) {
						//	System.out.println(tree.SortingKey+" "+tree.search((Comparable) htblColNameValue.get(s)).references);
		                    double  x=polyArea((Polygon)htblColNameValue.get(s) );
							for (int i = 0; i < tree.search((Comparable) x).references.size(); i++) {
				int value1 = pages.getOrDefault(tree.search((Comparable)  x).references.get(i).pageNo + ","
										+ tree.search((Comparable) x).references.get(i).indexInPage,
										0);
								
								pages.put(tree.search((Comparable)x).references.get(i).pageNo + ","
										+ tree.search((Comparable)x).references.get(i).indexInPage,
										value1 +1);

								//break; // 4elt el coment ely hna
							}

						}
					}		
				
			} else {
				//System.out.println("k");
				for (int i = 0; i < currentT.pages.size(); i++) {
					Page m = despage(currentT.pages.get(i));
					 
					for (int j = 0; j < m.rows.size(); j++) {
						if (compare(m.rows.get(j).get(colindx(strTableName, s)), htblColNameValue.get(s)) == 0) {
							int value1 = pages.getOrDefault(i + "," + j, 0);

							pages.put(i + "," + j, value1 + 1);
							 
							

						}
					}
					serpage(m);
				}
			}
			System.out.println("5lsna");
		}

		//Set<String> s1 = pages.keySet();
		Set<String> s11 = pages.keySet();
		ArrayList<String> s111=new ArrayList<String>();
		for(String s:s11) {
			s111.add(s);
		}
		 

			
			for (int i=0;i<s111.size();i++) { 
				StringTokenizer st=new StringTokenizer(s111.get(i),",");//HENNA
				int page1 = Integer.parseInt(st.nextToken());//HENNA
				int index1 = Integer.parseInt(st.nextToken()); //HENNA
				if (pages.get(s111.get(i)) == htblColNameValue.size()) {
					System.out.println("k"+page1);
					Page m = despage(currentT.pages.get(page1));
					 
					for (BPTree tree : currentT.Trees) {
					int	 indexsorting = colindx(strTableName, tree.SortingKey);
	                   // System.out.println(  m.max+"hhh");
						Vector<Ref> refs = tree.search((Comparable) m.rows.get(index1).get(indexsorting)).references;
						for (int ah = 0; ah < refs.size(); ah++) {

							if (refs.get(ah).indexInPage == index1 && refs.get(ah).pageNo == page1) {
								tree.delete((Comparable) m.rows.get(index1).get(indexsorting), refs.get(ah));

								// m.rows.remove(index1);

								
							} 
						}
					}
			 
					for (RTree tree : currentT.RTrees) {
					int  indexsorting = colindx(strTableName, tree.SortingKey);
	                    System.out.println(  m.max+"hhh");
						Vector<Ref> refs = tree.search(polyArea((Polygon) m.rows.get(index1).get(indexsorting))).references;
						for (int ah = 0; ah < refs.size(); ah++) { //for loop 3la kol el polygons 3ndhom nafs el area

							if ( (refs.get(ah).indexInPage == index1 && refs.get(ah).pageNo == page1)) {
								if(!(m.rows.get(index1).get(indexsorting) instanceof Polygon)||((m.rows.get(index1).get(indexsorting) instanceof Polygon)&& refs.size()==1)) {
								
								
								
								 
									tree.delete((Comparable)polyArea((Polygon) m.rows.get(index1).get(indexsorting)), refs.get(ah));

									// m.rows.remove(index1);

								
									
									
									
								}
								
							} 
						}
					}
				}
				else {
					s111.remove(page1 + "," + index1);i--;
				}
			}
		//HENNA
			ArrayList<pair> a=new ArrayList<pair>();
			for(String s:s111) {
				StringTokenizer st=new StringTokenizer(s,",");
				pair p=new pair(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
				a.add(p);
			}
			System.out.println(s111);
	Collections.sort(a);
	System.out.println(a);
	//HENNA
	for (int mm=a.size()-1;mm>=0;mm--) { //HENNA
		int page1 = a.get(mm).p;//HENNA
		int index1 = a.get(mm).i;  //HENNA
				Page m = despage(currentT.pages.get(page1));
				String namekey = nameofkey(strTableName);
				int indexx = indexcuster(strTableName, namekey);
				
				if(m.rows.get(index1).get(indexx) instanceof Polygon  ) {
					if(compare(htblColNameValue.get(namekey),m.rows.get(index1).get(indexx))==0 ) {
					m.rows.remove(index1);
					System.out.println("ana hna");
					serpage(m);
				}}
				else {
				m.rows.remove(index1);
				serpage(m);
				}
				if (m.rows.size() == 0) {
					System.out.println("3mlt shiftt");
					String locx = m.location;
					serpage(m);
					flag=true;
					shiftpage(strTableName,currentT.pages, locx);
					//sertable(currentT);
					

					// el mafrood remove page

				} else {
					String name = nameofkey(strTableName);
					int index = indexcuster(strTableName, name);
					m.min = m.rows.get(0).get(index);
					m.max = m.rows.get(m.rows.size() - 1).get(index);
				}
				if(flag==false)
					serpage(m);
				//serpage(m);
			}
			for(int i=0;i<currentT.Trees.size();i++) {
				BPTree tree=currentT.Trees.get(i);
				currentT.Trees.set(i, new BPTree(tree.order, tree.SortingKey, strTableName));
			int	sortingindex=colindx(strTableName, tree.SortingKey);
				for(int j=0;j<currentT.pages.size();j++) {
					Page zehegt=despage(currentT.pages.get(j));
					for(int k=0;k<zehegt.rows.size();k++) {
						currentT.Trees.get(i).insert((Comparable)zehegt.rows.get(k).get(sortingindex), new Ref(j, k));
						
					}
				}
			}
			for(int i=0;i<currentT.RTrees.size();i++) {
				RTree tree=currentT.RTrees.get(i);
				currentT.RTrees.set(i, new RTree(tree.order, tree.SortingKey, strTableName));
			  int	sortingindex=colindx(strTableName, tree.SortingKey);
				for(int j=0;j<currentT.pages.size();j++) {
					Page zehegt=despage(currentT.pages.get(j));
					for(int k=0;k<zehegt.rows.size();k++) {
						currentT.RTrees.get(i).insert((Comparable)polyArea(( Polygon)zehegt.rows.get(k).get(sortingindex)), new Ref(j, k));
						
					}
				}
			}
 
		sertable(currentT);
	}
	public static class pair implements Comparable<pair>{
		int p,i;
public pair(int x,int y) {
	p=x;i=y;
}
		public int compareTo(pair o) {
			if(p>o.p)
				return 1;
			else if(p<o.p)
				return -1;
			else  {
				if(i<o.i)
					return -1;
				else if(i>o.i)
					return 1;
				else
					return 0;
					
			}
			
		}
		
	}
	//fakesss
	public void deleteFromTableadeema(String strTableName, Hashtable<String, Object> htblColNameValue) throws IOException {
		// ArrayList<Table> t = destable("data/tables.ser");

		// Page pp=despage("data/page0.ser");
		// System.out.println("line437 "+t.size());
		Table currentT = destable("data/" + strTableName + ".ser");
		int page = 0;
		boolean flag=false;
	//	int index = 0;
		//namekey
		Set<String> keys = htblColNameValue.keySet();
		HashMap<String, Integer> pages = new HashMap<String, Integer>();
//System.out.println(keys);
		for (String s : keys) {
			System.out.println(keys.size());
	
				
		if(htblColNameValue.get(s)instanceof Polygon ) { //&& isindexR(s, currentT)
			System.out.println("hetttete");
			if( isindexR(s, currentT)) {
			for (RTree tree : currentT.RTrees) {
			//	System.out.println( "hkhk");

				if (tree.SortingKey.equals(s)) {
				//	System.out.println(tree.SortingKey+" "+tree.search((Comparable) htblColNameValue.get(s)).references);
                    double  x=polyArea((Polygon)htblColNameValue.get(s) );
					for (int i = 0; i < tree.search((Comparable) x).references.size(); i++) {
		int value1 = pages.getOrDefault(tree.search((Comparable)  x).references.get(i).pageNo + ","
								+ tree.search((Comparable) x).references.get(i).indexInPage,
								0);
						
						pages.put(tree.search((Comparable)x).references.get(i).pageNo + ""
								+ tree.search((Comparable)x).references.get(i).indexInPage,
								value1 +1);

						//break; // 4elt el coment ely hna
					}

				}
			}	
			
			
			
			
		}}
				
		else {
			
			//&&isindex(s, currentT)
				if(isindex(s, currentT)) {
			for (BPTree tree : currentT.Trees) {
					

					if (tree.SortingKey.equals(s)) {
						
						if( tree.search((Comparable) htblColNameValue.get(s))!=null) {

						for (int i = 0; i < tree.search((Comparable) htblColNameValue.get(s)).references.size(); i++) {
			int value1 = pages.getOrDefault(tree.search((Comparable) htblColNameValue.get(s)).references.get(i).pageNo + ""
									+ tree.search((Comparable) htblColNameValue.get(s)).references.get(i).indexInPage,
									0);
							
							pages.put(tree.search((Comparable) htblColNameValue.get(s)).references.get(i).pageNo + ""
									+ tree.search((Comparable) htblColNameValue.get(s)).references.get(i).indexInPage,
									value1 +1);

						//	break; // 4elt el coment ely hna
						}
					}

						System.out.println(pages+"hiii");
					}
				} //w2ft hna
		} 
			
		
		else {
				//System.out.println("k");
				for (int i = 0; i < currentT.pages.size(); i++) {
					Page m = despage(currentT.pages.get(i));
					 
					for (int j = 0; j < m.rows.size(); j++) {
						if (compare(m.rows.get(j).get(colindx(strTableName, s)), htblColNameValue.get(s)) == 0) {
							int value1 = pages.getOrDefault(i + "" + j, 0);

							pages.put(i + "" + j, value1 + 1);
							 
							

						}
					}
					serpage(m);
				}
			}}
			
		}

		Set<String> s11 = pages.keySet();
		ArrayList<String> s111=new ArrayList<String>();
		for(String s:s11) {
			s111.add(s);
		}
		
		for (int i=0;i<s111.size();i++) {  

			int page1 = Integer.parseInt(s111.get(i).charAt(0) + "");
			int index1 = Integer.parseInt(s111.get(i).charAt(1) + "");
			if (pages.get(s111.get(i)) == htblColNameValue.size()) {
				System.out.println("k"+page1);
				Page m = despage(currentT.pages.get(page1));
				 
				for (BPTree tree : currentT.Trees) {
				int	 indexsorting = colindx(strTableName, tree.SortingKey);
                   // System.out.println(  m.max+"hhh");
					Vector<Ref> refs = tree.search((Comparable) m.rows.get(index1).get(indexsorting)).references;
					for (int ah = 0; ah < refs.size(); ah++) {

						if (refs.get(ah).indexInPage == index1 && refs.get(ah).pageNo == page1) {
							tree.delete((Comparable) m.rows.get(index1).get(indexsorting), refs.get(ah));

							// m.rows.remove(index1);

							
						} 
					}
				}
		 
				for (RTree tree : currentT.RTrees) {
				int  indexsorting = colindx(strTableName, tree.SortingKey);
                    System.out.println(  m.max+"hhh");
					Vector<Ref> refs = tree.search(polyArea((Polygon) m.rows.get(index1).get(indexsorting))).references;
					for (int ah = 0; ah < refs.size(); ah++) { //for loop 3la kol el polygons 3ndhom nafs el area

						if ( (refs.get(ah).indexInPage == index1 && refs.get(ah).pageNo == page1)) {
							if(!(m.rows.get(index1).get(indexsorting) instanceof Polygon)||((m.rows.get(index1).get(indexsorting) instanceof Polygon)&& refs.size()==1)) {
							
							
							
							 
								tree.delete((Comparable)polyArea((Polygon) m.rows.get(index1).get(indexsorting)), refs.get(ah));

								// m.rows.remove(index1);

							
								
								
								
							}
						} 
					}
				}
			}
			else {
				s111.remove(page1 + "" + index1);i--;
			}
		} 
Collections.sort(s111);
		for (int mm=s111.size()-1;mm>=0;mm--) {
			int page1 = Integer.parseInt(s111.get(mm).charAt(0) + "");
			int index1 = Integer.parseInt(s111.get(mm).charAt(1) + "");
			Page m = despage(currentT.pages.get(page1));
			String namekey = nameofkey(strTableName);
			int indexx = indexcuster(strTableName, namekey);
			
			if(m.rows.get(index1).get(indexx) instanceof Polygon && compare(htblColNameValue.get(namekey),m.rows.get(index1).get(indexx))==0 ) {
				m.rows.remove(index1);
				System.out.println("ana hna");
			}
			else
			m.rows.remove(index1);
 
			if (m.rows.size() == 0) {
				System.out.println("3mlt shiftt");
				String locx = m.location;
				serpage(m);
				flag=true;
				shiftpage(strTableName,currentT.pages, locx);
				//sertable(currentT);
				

				// el mafrood remove page

			} else {
				String name = nameofkey(strTableName);
				int index = indexcuster(strTableName, name);
				m.min = m.rows.get(0).get(index);
				m.max = m.rows.get(m.rows.size() - 1).get(index);
			}
			if(flag==false)
				serpage(m);
			//serpage(m);
		}
		for(int i=0;i<currentT.Trees.size();i++) {
			BPTree tree=currentT.Trees.get(i);
			currentT.Trees.set(i, new BPTree(tree.order, tree.SortingKey, strTableName));
		int	sortingindex=colindx(strTableName, tree.SortingKey);
			for(int j=0;j<currentT.pages.size();j++) {
				Page zehegt=despage(currentT.pages.get(j));
				for(int k=0;k<zehegt.rows.size();k++) {
					currentT.Trees.get(i).insert((Comparable)zehegt.rows.get(k).get(sortingindex), new Ref(j, k));
					
				}
			}
		}
		for(int i=0;i<currentT.RTrees.size();i++) {
			RTree tree=currentT.RTrees.get(i);
			currentT.RTrees.set(i, new RTree(tree.order, tree.SortingKey, strTableName));
		  int	sortingindex=colindx(strTableName, tree.SortingKey);
			for(int j=0;j<currentT.pages.size();j++) {
				Page zehegt=despage(currentT.pages.get(j));
				for(int k=0;k<zehegt.rows.size();k++) {
					currentT.RTrees.get(i).insert((Comparable)polyArea(( Polygon)zehegt.rows.get(k).get(sortingindex)), new Ref(j, k));
					
				}
			}
		}


//		BufferedReader br = new BufferedReader(new FileReader("data/metadata.csv"));
//		HashMap<Integer, Object> hm = new HashMap<>();
//		int indxofcol = 0;
//		while (br.ready()) {
//			StringTokenizer st = new StringTokenizer(br.readLine(), ",");
//			String x = st.nextToken();
//			if (x.equals(strTableName)) {
//				String col = st.nextToken();
//				Object value = htblColNameValue.getOrDefault(col, null);
//				if (value != null)
//					hm.put(indxofcol, htblColNameValue.get(col));
//				indxofcol++;
//			}
//		}
//		Vector<String> pairs = currentT.pages;
//		Page p = null;
//		for (int i = 0; i < pairs.size(); i++) {
//			p = despage(pairs.get(i));
//			for (int j = 0; j < p.rows.size(); j++) {
//				boolean same = false;
//				for (int k = 0; k < p.rows.get(j).size(); k++) {
//					Object temp = hm.getOrDefault(k, null);
//					if (temp != null && temp.equals(p.rows.get(j).get(k)))
//						same = true;
//				}
//				if (same) {
////delete from btree--------------------
//					Ref loc = new Ref(i, j); // hane7tago fe code leqaa
//					for (BPTree tree : currentT.Trees) {
//						String sortingkey = tree.SortingKey;
//						int index = colindx(strTableName, sortingkey);
//						Object value = p.rows.get(j).get(index);
//						tree.delete((Comparable) value, loc);// leqaa :lw hya already mwgooda fl tree bl ref da hayb2a
//						tree.allkeys.remove((Comparable) value); // mafish mashakel
//					}
//// delete from btree--------------------------
//
//					p.rows.remove(j);
//
//				}
//				if (p.rows.size() == 0) {
//					String locx = p.location;
//					serpage(p);
//					shiftpage(pairs, locx);
//					sertable(currentT);
//					return;
//
//					// el mafrood remove page
//
//				} else {
//					String name = nameofkey(strTableName);
//					int index = indexcuster(strTableName, name);
//					p.min = p.rows.get(0).get(index);
//					p.max = p.rows.get(p.rows.size() - 1);
//				}
//			}
//			serpage(p);
//		}
//		sertable(currentT);
//	}
//
//	public void delleteFromTable(String strTableName, Hashtable<String, Object> htblColNameValue) throws IOException {
//		// ArrayList<Table> t = destable("data/tables.ser");
//
//		// Page pp=despage("data/page0.ser");
//		// System.out.println("line437 "+t.size());
//		Table currentT = destable("data/" + strTableName + ".ser");
//
//		BufferedReader br = new BufferedReader(new FileReader("data/metadata.csv"));
//		HashMap<Integer, Object> hm = new HashMap<>();
//		int indxofcol = 0;
//		while (br.ready()) {
//			StringTokenizer st = new StringTokenizer(br.readLine(), ",");
//			String x = st.nextToken();
//			if (x.equals(strTableName)) {
//				String col = st.nextToken();
//				Object value = htblColNameValue.getOrDefault(col, null);
//				if (!htblColNameValue.get(col).equals(null))
//					hm.put(indxofcol, htblColNameValue.get(col));
//				indxofcol++;
//			}
//		}
//		Vector<String> pairs = currentT.pages;
//		Page p = null;
//		for (int i = 0; i < pairs.size(); i++) {
//			p = despage(pairs.get(i));
//			for (int j = 0; j < p.rows.size(); j++) {
//				boolean same = false;
//				for (int k = 0; k < p.rows.get(j).size(); k++) {
//					Object temp = hm.getOrDefault(k, null);
//					if (!temp.equals(null) && temp.equals(p.rows.get(j).get(k)))
//						same = true;
//				}
//				if (same) {
//
//					p.rows.remove(j);
//
//				}
//				if (p.rows.size() == 0) {
//					String locx = p.location;
//					serpage(p);
//					shiftpage(pairs, locx);
//					return;
//
//					// el mafrood remove page
//
//				} else {
//					String name = nameofkey(strTableName);
//					int index = indexcuster(strTableName, name);
//					p.min = p.rows.get(0).get(index);
//					p.max = p.rows.get(p.rows.size() - 1).get(index);
//				}
//			}
//			serpage(p);
//		}
		sertable(currentT);
	}

	public static int colindx(String tablename, String colname) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("data/metadata.csv"));
		int idx = 0;
		while (br.ready()) {
			StringTokenizer st = new StringTokenizer(br.readLine(), ",");
			String table = st.nextToken();
			if (table.equals(tablename)) {
				if (!st.nextToken().equals(colname)) {
					idx++;
				} else {
					break;
				}

			}
		}
		return idx;
	}
	public void deletteFromTable(String strTableName, Hashtable<String, Object> htblColNameValue) throws IOException {
		// ArrayList<Table> t = destable("data/tables.ser");

		// Page pp=despage("data/page0.ser");
		// System.out.println("line437 "+t.size());
		Table currentT = destable("data/" + strTableName + ".ser");

		BufferedReader br = new BufferedReader(new FileReader("data/metadata.csv"));
		HashMap<Integer, Object> hm = new HashMap<>();
		int indxofcol = 0;
		while (br.ready()) {
			StringTokenizer st = new StringTokenizer(br.readLine(), ",");
			String x = st.nextToken();
			if (x.equals(strTableName)) {
				String col = st.nextToken();
				Object value = htblColNameValue.getOrDefault( col,  null) ;
				//System.out.println(col+"mmmmkmkmk"+indxofcol+"  "+value.toString());
				if (value != null)
					hm.put(indxofcol, htblColNameValue.get(col));
				indxofcol++;
			}
		}
		Vector<String> pairs = currentT.pages;
		Page p = null;
	boolean	flag=false;
		for (int i = 0; i < pairs.size(); i++) {
			p = despage(pairs.get(i));
			System.out.println("hrrrrrrrmmy"+p.rows.size());
			int counter=0;
			for (int j = 0; j < p.rows.size(); j++) {
				System.out.println("hamadaaa"+j);
				 boolean same = false;
				 int count=-1;
				for (int k = 0; k < p.rows.get(j).size(); k++) {
					
					Object temp = hm.getOrDefault(k, null);
				//	System.out.println("hrrrrrrrry"+p.rows.get(j).size() +"    "+p.rows.get(j).get(2));	
					if (temp != null && temp.equals(p.rows.get(j).get(k))){
						same = true;
						System.out.println( "gwaaifff");
						count+=1;
					}
					 
				}
				if (same) {
////delete from btree--------------------
//					Ref loc = new Ref(i, j); // hane7tago fe code leqaa
//					for(BPTree tree:currentT.Trees) {
//						String sortingkey=tree.SortingKey;
//						int index=colindx(strTableName, sortingkey);
//						Object value=p.rows.get(j).get(index);
//						tree.delete((Comparable)value);
//					}
// delete from btree--------------------------
					p.rows.remove(j);
					j=j-1;
					System.out.println("xxxnnnnnnnxxxx"+j);
					 

				}
				if (p.rows.size() == 0) {
					System.out.println("3mlt shiftt");
					String locx = p.location;
					serpage(p);
					flag=true;
					shiftpage(strTableName,pairs, locx);
					//sertable(currentT);
					

					// el mafrood remove page

				} else {
					String name = nameofkey(strTableName);
					int index = indexcuster(strTableName, name);
					p.min = p.rows.get(0).get(index);
					p.max = p.rows.get(p.rows.size() - 1).get(index);
				}
			}
			if(flag==false)
			serpage(p);
		}
		sertable(currentT);
	}
	public static boolean comparingtypes(String updatingType, String col, String tablename) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("data/metadata.csv"));
		while (br.ready()) {
			StringTokenizer st = new StringTokenizer(br.readLine(), ",");
			String tablename1 = st.nextToken();
			String column = st.nextToken();
			String type = st.nextToken();
			if (tablename.equals(tablename1) && column.equals(col) && updatingType.equals(type)) {
				return true;
			}
		}
		return false;

	}

	public void updattteTable(String strTableName, String strClusteringKey, Hashtable<String, Object> htblColNameValue)
			throws IOException {
		// ArrayList<Table> tables = destable("data/tables.ser");
		Vector<String> pages = destable("data/" + strTableName + ".ser").pages;

		Set<String> keys = htblColNameValue.keySet();
		BufferedReader br = new BufferedReader(new FileReader("data/metadata.csv"));
		for (int i = 0; i < pages.size(); i++) {
			Page p = despage(pages.get(i));

			boolean pol = false;
			StringTokenizer st2 = new StringTokenizer(br.readLine(), ",");
			while (br.ready() && st2.hasMoreTokens()) {
				if (st2.nextToken().equals("java.awt.Polygon")) {
					pol = true;
					break;
				}
			}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			if (pol) {

				Polygon poly = toPoly(strClusteringKey);

				if ((compare((Polygon) (p.min), poly) < 0) || (compare((Polygon) (p.min), poly) == 0)
						&& (compare((Polygon) (p.max), poly) > 0 || (compare((Polygon) (p.max), poly)) == 0)) {
					br = new BufferedReader(new FileReader("data/metadata.csv"));
					while (br.ready()) {

						StringTokenizer st = new StringTokenizer(br.readLine(), ",");
						String tablename = st.nextToken();

						if (tablename.equals(strTableName)) {

							int clusteridx = indexcuster(strTableName, strClusteringKey) - 1;

							for (Vector v : p.rows) {
								st.nextToken();
								if (v.get(clusteridx).toString().equals(strClusteringKey)) {
									// start updating
									for (String s : keys) {
										StringTokenizer st1 = new StringTokenizer(
												htblColNameValue.get(s).getClass().toString());
										st1.nextToken();
										if (comparingtypes(st1.nextToken(), s, strTableName))
											v.set(colindx(strTableName, s), htblColNameValue.get(s));
										else
											System.out.println("WRONG TYPE");
									}

								}
							}
							for (Vector v : p.rows) {
								st.nextToken();
								if (compare((Polygon) (v.get(clusteridx)), poly) == 0) {
									// start updating
									for (String s : keys) {
										StringTokenizer st1 = new StringTokenizer(
												htblColNameValue.get(s).getClass().toString());
										st1.nextToken();
										if (comparingtypes(st1.nextToken(), s, strTableName))
											v.set(colindx(strTableName, s), htblColNameValue.get(s));
										else
											System.out.println("WRONG TYPE");
									}

								}
							}

						}

					}
				}

			} else {
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				if ((compare(p.min.toString(), strClusteringKey) < 0 || p.min.toString().equals(strClusteringKey)) // condition
																													// polygon
																													// parse.polygon
						&& (compare(p.max.toString(), strClusteringKey) > 0)
						|| p.max.toString().equals(strClusteringKey)) {

					br = new BufferedReader(new FileReader("data/metadata.csv"));
					while (br.ready()) {

						StringTokenizer st = new StringTokenizer(br.readLine(), ",");
						String tablename = st.nextToken();
						if (tablename.equals(strTableName)) {

							int clusteridx = indexcuster(strTableName, strClusteringKey) - 1;

							for (Vector v : p.rows) {
								st.nextToken();
								if (v.get(clusteridx).toString().equals(strClusteringKey)) {
									// start updating
									for (String s : keys) {
										StringTokenizer st1 = new StringTokenizer(
												htblColNameValue.get(s).getClass().toString());
										st1.nextToken();
										if (comparingtypes(st1.nextToken(), s, strTableName))
											v.set(colindx(strTableName, s), htblColNameValue.get(s));
										else
											System.out.println("WRONG TYPE");
									}

								}
							}
							for (Vector v : p.rows) {
								st.nextToken();
								if (v.get(clusteridx).toString().equals(strClusteringKey)) {
									// start updating
									for (String s : keys) {
										StringTokenizer st1 = new StringTokenizer(
												htblColNameValue.get(s).getClass().toString());
										st1.nextToken();
										if (comparingtypes(st1.nextToken(), s, strTableName))
											v.set(colindx(strTableName, s), htblColNameValue.get(s));
										else
											System.out.println("WRONG TYPE");
									}

								}
							}

						}

					}
				}
			}
			serpage(p);
		}

	}

	public int getindexofpage(Vector<String> pages, String loc) {

		int pageindx = 0;
		for (int i = 0; i < pages.size(); i++) {
			if (pages.get(i).equals(loc)) {
				pageindx = i;
				break;
			}
		}
		return pageindx;
	}
	public void shiftpage(String strTableName,Vector<String> pages, String location) throws IOException {

		int index = getindexofpage(pages, location);
		String namekey = nameofkey(strTableName);
		int indexx = indexcuster(strTableName, namekey);
		if (index == pages.size() - 1) {

			try {
				pages.remove(index );
				
				System.out.println("Deletion successful. " + pages.size());
			 
				Files.deleteIfExists(Paths.get(location));
			} catch (NoSuchFileException e) {
				System.out.println("No such file/directory exists");
			} catch (DirectoryNotEmptyException e) {
				System.out.println("Directory is not empty.");
			} catch (IOException e) {
				System.out.println("Invalid permissions.");
			}

			//////////////////////////////////////////////
			return;
		}
	//	pages.remove(index + 1);
		String nextloc = pages.get(index + 1);
		Page next = despage(nextloc);

		Vector<Vector> records = new Vector<Vector>(next.rows);

		next.rows.clear();
		System.out.println("line 634 hh" + next.rows.size());
		

		serpage(next);
		Page current = despage(location);

		for (int j = 0; j < records.size(); j++) {
			current.rows.add(records.get(j));
		}
		current.min=records.get(0).get(indexx);
		current.max=records.get(records.size()-1).get(indexx);	 
		serpage(current);
		if (index + 1 == pages.size()) {

			try {
				pages.remove(index ); 
				Files.deleteIfExists(Paths.get(nextloc));
				System.out.println("ya rab ");
			} catch (NoSuchFileException e) {
				System.out.println("No such file/directory exists");
			} catch (DirectoryNotEmptyException e) {
				System.out.println("Directory is not empty.");
			} catch (IOException e) {
				System.out.println("Invalid permissions.");
			}

			 
			  //////////////////////////////////////////////
			return;
		}
		if (index < pages.size() - 1) {
			System.out.println("hnaaannanan");
			shiftpage(strTableName, pages, nextloc);

		} else {

			return;
		}

		// forloopn a7san mn recursion

	}

	 
//
//	public void shiftpage(Vector<String> pages, String location) {
//
//		int index = getindexofpage(pages, location);
//
//		if (index == pages.size() - 1) {
//
//			try {
//				System.out.println("Deletion successful." + pages.size());
//				pages.remove(index);
//				Files.deleteIfExists(Paths.get(location));
//			} catch (NoSuchFileException e) {
//				System.out.println("No such file/directory exists");
//			} catch (DirectoryNotEmptyException e) {
//				System.out.println("Directory is not empty.");
//			} catch (IOException e) {
//				System.out.println("Invalid permissions.");
//			}
//
//			//////////////////////////////////////////////
//			return;
//		}
//		pages.remove(index + 1);
//		String nextloc = pages.get(index + 1);
//		Page next = despage(nextloc);
//
//		Vector<Vector> records = next.rows;
//
//		next.rows.clear();
//
//		if (index + 2 == pages.size()) {
//
//			try {
//				Files.deleteIfExists(Paths.get(nextloc));
//			} catch (NoSuchFileException e) {
//				System.out.println("No such file/directory exists");
//			} catch (DirectoryNotEmptyException e) {
//				System.out.println("Directory is not empty.");
//			} catch (IOException e) {
//				System.out.println("Invalid permissions.");
//			}
//
//			System.out.println("Deletion successful.");
//			pages.remove(index + 1); //////////////////////////////////////////////
//			return;
//		}
//
//		serpage(next);
//		Page current = despage(location);
//
//		for (int j = 0; j < records.size(); j++) {
//			current.rows.add(records.get(j));
//		}
//		serpage(current);
//		if (index < pages.size() - 1) {
//			shiftpage(pages, nextloc);
//
//		} else {
//
//			return;
//		}
//
//		// forloopn a7san mn recursion
//
//	}

	public void readtable(String name) {

		Table x = destable("data/" + name + ".ser");

		for (int i = 0; i < x.pages.size(); i++) {
			Page page = despage(x.pages.get(i));
			System.out.println("page" + i + " length" + page.rows.size());
			for (int j = 0; j < page.rows.size(); j++) {
				System.out.println(page.rows.get(j).toString());
			}

		}
	}
	public String polyString(Polygon a ) {
		String s="";
		for(int i=0; i<a.xpoints.length;i++){
			String sa=a.xpoints[i]+"";
			String sb=a.ypoints[i]+"";
			System.out.println(sa);
			if(i<a.xpoints.length-1) {
				System.out.println(sa+"ta7t");
				s=s+"("+sa+","+sb+")"+",";
			 			//System.out.println(s);
			}
			else
				s+="("+sa+","+sb+")";
			
		}
//		for(int i=0; i<a.xpoints.length;i++){
//			s=s+a.ypoints[i]+"";
//			if(i<a.xpoints.length-1) {
//				s=s+",";
//			}
//			else
//				s+=":";
//		}
	
		return s;
				
		
		
	}
	public Polygon polyy(String s) {
		String [] x= s.split( ",");
		System.out.println(x.toString());
		int i=0;
		int []xa=new int[x.length/2];
		int []yb=new int[x.length/2];
		int j=0;
		 while(i<x.length) {
		//	System.out.println(x[i]);
			int a=Integer.parseInt(x[i].substring(1,x[i].length()));
			int b=Integer.parseInt(x[i+1].substring(0,x[i+1].length()-1));
			xa[j]=a;
			yb[j]=b;
			 
			i+=2;
			j+=1;
		}
//		int n=Integer.parseInt(x[0]);
//		 String [] a = ( x[1].split(",") );
//		 String[] b = ( x[2].split(",") );
//		 int aa[]=new int[n];
//		 int bb[]=new int[n];
			for(int k=0; k< x.length/2;k++){
				 
				System.out.println("("+xa[k]+","+yb[k]+")");
			}
	 
        Polygon p=new Polygon(xa,yb,x.length/2);
		
		//	Polygon p=new Polygon(aa,bb,n);
			return p;
		 
		
	}
	public int getmax() {
		int n = 0;
		try (InputStream input = new FileInputStream("config/DBApp.properties")) {

			Properties prop = new Properties();

			// load a properties file
			prop.load(input);

			// get the property value and print it out
			n = Integer.parseInt(prop.getProperty("MaximumRowsCountinPage"));

		} catch (IOException ex) {
			ex.printStackTrace();
		}
//		
//		 try {
//		      File myObj = new File("data/tables.ser");
//		      if (myObj.createNewFile()) {
//		        System.out.println("File created: " + myObj.getName());
//		      } else {
//		        System.out.println("File already exists.");
//		      }
//		    } catch (IOException e) {
//		      System.out.println("An error occurred.");
//		      e.printStackTrace();
//		    }

		return n;
	}
	public Integer specifictreeIndex(String tablename, String sortingkey) {
		Table t = destable("data/" + tablename + ".ser");
		for(int i=0 ;i<t.Trees.size() ;i++) {
			if (t.Trees.get(i).SortingKey.equals(sortingkey)) {
				return i;
			}
		}
		return null;
	}
	public Integer specificRtreeIndex(String tablename, String sortingkey) {
		Table t = destable("data/" + tablename + ".ser");
		for(int i=0 ;i<t.RTrees.size() ;i++) {
			if (t.RTrees.get(i).SortingKey.equals(sortingkey)) {
				return i;
			}
		}
		return null;
	}

//	public void updateTable(String strTableName, String strClusteringKey, Hashtable<String, Object> htblColNameValue)
//			throws IOException {
//
//		Vector<String> pages = destable("data/" + strTableName + ".ser").pages;
//
//		Set<String> keys = htblColNameValue.keySet();
//
//		for (int i = 0; i < pages.size(); i++) {
//			Page p = despage(pages.get(i));
//			if ((p.min.toString().compareTo(strClusteringKey) < 0
//					|| p.min.toString().compareTo(strClusteringKey) == 0)) {
//
//				String namekey = nameofkey(strTableName);
//				int index = indexcuster(strTableName, namekey);
//
//				for (int hello = 0; hello < p.rows.size(); hello++) {
//
//					if (p.rows.get(hello).get(index).toString().equals(strClusteringKey)) {
//						// Start Updating
//						for (String s : keys) {
//							StringTokenizer st1 = new StringTokenizer(htblColNameValue.get(s).getClass().toString());
//							st1.nextToken();
//							if (comparingtypes(st1.nextToken(), s, strTableName)) {
//								Object lastvalue = p.rows.get(hello).get(colindx(strTableName, s));
//								p.rows.get(hello).set(colindx(strTableName, s), htblColNameValue.get(s));
//								// Updating in the tree---------------------
//								Table t = destable("data/" + strTableName + ".ser");
//								for (BPTree tree : t.Trees) {
//									String sortingkey = tree.SortingKey;
//									int indx = colindx(strTableName, sortingkey);
//									Object newvalue = p.rows.get(hello).get(colindx(strClusteringKey, s));
//									if (s.equals(sortingkey)) {
//										Ref location = new Ref(i, hello);
//										tree.delete((Comparable) lastvalue, location); // leqaa :lw location da f3ln
//																						// mwgood fl tree l mafrood
//										// teshta3'al 3ady
//										// System.out.println(tree.toString());
//										tree.insert((Comparable) newvalue, location);
//										// System.out.println(tree.toString());
//										sertable(t);
//									}
//								}
//								// Updating in the tree---------------------
//							} else
//								System.out.println("WRONG TYPE");
//						}
//
//					}
//				}
//
//				serpage(p);
//				return;
//			}
//			serpage(p);
//		} el adeema 
//
//	}
	public void updateTable(String strTableName, String strClusteringKey, Hashtable<String, Object> htblColNameValue)
			throws NumberFormatException, Exception {
		Table t = destable("data/" + strTableName + ".ser");
		Vector<String> pages = destable("data/" + strTableName + ".ser").pages;

		Set<String> keys = htblColNameValue.keySet();
		String namekey = nameofkey(strTableName);
		// String namekey = nameofkey(strTableName);
	//	 int index = indexcuster(strTableName, namekey);
		int indexofclusterkey = indexcuster(strTableName, namekey);
	   
		BPTree btree = specifictree(strTableName, namekey);
		RTree rtree=specifictRtree(strTableName, namekey);
		boolean pol=false;
		Ref2 refs;
		if (comparingtypes("java.lang.Integer", namekey, strTableName)) {
			System.out.println("in desired if");
			refs = btree.search((Comparable) Integer.parseInt(strClusteringKey));
		} else if (comparingtypes("java.lang.String", namekey, strTableName)) {
			refs = btree.search((Comparable) strClusteringKey);
		} else
		if (comparingtypes("java.lang.Double", namekey, strTableName)) {
			refs = btree.search((Comparable) Double.parseDouble(strClusteringKey));
		} else if (comparingtypes("java.lang.Boolean", namekey, strTableName)) {
			refs = btree.search((Comparable) Boolean.parseBoolean(strClusteringKey));
			
		} else  if (comparingtypes("java.awt.Polygon", namekey, strTableName)) {
			Polygon p=polyy(strClusteringKey);
		    Object tt= polyArea(p);
		    pol=true;
			refs = rtree.search((Comparable) Double.parseDouble(tt.toString()));
		} else {
			
			SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
			refs = btree.search((Comparable) s.parse(strClusteringKey));
		}
	//	System.out.println("ayaaaaaaaaaaa"+refs.references.size());
		for (int i = 0; i < refs.references.size(); i++) {
			//System.out.println("ayaaaaaaaaaaa");
			int pagenum = refs.references.get(i).pageNo;
			int indxinp = refs.references.get(i).indexInPage;
			Page p = despage(pages.get(pagenum));
			Vector<Vector> rows = p.rows;
			//System.out.println("ayaaaaaaaaaaa");
			//Object r= p.rows.get(indxinp).get(indexofclusterkey);
			for (String k : keys) {
				int colindx = colindx(strTableName, k);
				BPTree otherbtrees = specifictree(strTableName, k);
				RTree other=specifictRtree(strTableName, k);
				Object r= p.rows.get(indxinp).get(indexofclusterkey);
//				if (otherbtrees != null) {
//					Integer tindx = specifictreeIndex(strTableName, k);
//					Ref reference = new Ref(pagenum, indxinp);
//					//System.out.println(indxinp);
//					otherbtrees.delete((Comparable) rows.get(indxinp).get(colindx), reference);
//					otherbtrees.insert((Comparable) htblColNameValue.get(k), reference);
//					t.Trees.set(tindx, otherbtrees);
//					sertable(t);
//					
//				}
//				if (other != null) {
//					Integer tindx = specificRtreeIndex(strTableName, k);
//					Ref reference = new Ref(pagenum, indxinp);
//					//System.out.println(indxinp);
//				//	if( polyString((Polygon) r).equals(strClusteringKey)) {
//					other.delete((Comparable)  polyArea((Polygon)rows.get(indxinp).get(colindx)), reference);
//					other.insert((Comparable) polyArea((Polygon)htblColNameValue.get(k)), reference);
//					t.RTrees.set(tindx, other);
//					sertable(t);
//				}
//				
//				 if(pol) {
//					 if( polyString((Polygon) r).equals(strClusteringKey))
//						 rows.get(indxinp).set(indxinp, htblColNameValue.get(k)); 
//				 }
//				 else
				//rows.get(indxinp).set(indxinp, htblColNameValue.get(k)); //a7ot 7war en mt8ayr4 kol el R tree 
				
				if(  r instanceof Polygon   ) { 
					
			if( polyString((Polygon)r).equals(strClusteringKey) ) {  
				
				System.out.println("hnaaaaaaaaaaaaaaaaa");
				if (otherbtrees != null) {
					Integer tindx = specifictreeIndex(strTableName, k);
					Ref reference = new Ref(pagenum, indxinp);
					//System.out.println(indxinp);
					otherbtrees.delete((Comparable) rows.get(indxinp).get(colindx), reference);
					otherbtrees.insert((Comparable) htblColNameValue.get(k), reference);
					t.Trees.set(tindx, otherbtrees);
					sertable(t);
					
				}
				if (other != null) {
					Integer tindx = specificRtreeIndex(strTableName, k);
					Ref reference = new Ref(pagenum, indxinp);
					//System.out.println(indxinp);
				//	if( polyString((Polygon) r).equals(strClusteringKey)) {
					other.delete((Comparable)  polyArea((Polygon)rows.get(indxinp).get(colindx)), reference);
					other.insert((Comparable) polyArea((Polygon)htblColNameValue.get(k)), reference);
					t.RTrees.set(tindx, other);
					sertable(t);
				}
				Vector v = (Vector) rows.get(indxinp);
				v.set(colindx, htblColNameValue.get(k));
				rows.set(indxinp, v); 
				
			}
			
				
				}
				else {
					if (otherbtrees != null) {
						Integer tindx = specifictreeIndex(strTableName, k);
						Ref reference = new Ref(pagenum, indxinp);
						//System.out.println(indxinp);
						otherbtrees.delete((Comparable) rows.get(indxinp).get(colindx), reference);
						otherbtrees.insert((Comparable) htblColNameValue.get(k), reference);
						t.Trees.set(tindx, otherbtrees);
						sertable(t);
						
					}
					if (other != null) {
						Integer tindx = specificRtreeIndex(strTableName, k);
						Ref reference = new Ref(pagenum, indxinp);
						//System.out.println(indxinp);
					//	if( polyString((Polygon) r).equals(strClusteringKey)) {
						other.delete((Comparable)  polyArea((Polygon)rows.get(indxinp).get(colindx)), reference);
						other.insert((Comparable) polyArea((Polygon)htblColNameValue.get(k)), reference);
						t.RTrees.set(tindx, other);
						sertable(t);
					}
					Vector v = (Vector) rows.get(indxinp);
					v.set(colindx, htblColNameValue.get(k));
					rows.set(indxinp, v);	
					
				}
					
			}
			serpage(p);
			// for(int j=0 ; j<rows.get(indxinp).size();j++) {
			//
			// }
		}

		// for (int i = 0; i < pages.size(); i++) {
		// Page p = despage(pages.get(i));
		// if ((p.min.toString().compareTo(strClusteringKey) < 0
		// || p.min.toString().compareTo(strClusteringKey) == 0)) {
		//
		// String namekey = nameofkey(strTableName);
		// int index = indexcuster(strTableName, namekey);
		//
		// for (int hello = 0; hello < p.rows.size(); hello++) {
		//
		// if (p.rows.get(hello).get(index).toString().equals(strClusteringKey)) {
		// // Start Updating
		// for (String s : keys) {
		// StringTokenizer st1 = new
		// StringTokenizer(htblColNameValue.get(s).getClass().toString());
		// st1.nextToken();
		// if (comparingtypes(st1.nextToken(), s, strTableName)) {
		// Object lastvalue = p.rows.get(hello).get(colindx(strTableName, s));
		// p.rows.get(hello).set(colindx(strTableName, s), htblColNameValue.get(s));
		// // Updating in the tree---------------------
		// Table t = destable("data/" + strTableName + ".ser");
		// for (BPTree tree : t.Trees) {
		// String sortingkey = tree.SortingKey;
		// int indx = colindx(strTableName, sortingkey);
		// Object newvalue = p.rows.get(hello).get(colindx(strClusteringKey, s));
		// if (s.equals(sortingkey)) {
		// Ref location = new Ref(i, hello);
		// tree.delete((Comparable) lastvalue, location); // leqaa :lw location da f3ln
		// // mwgood fl tree l mafrood
		// // teshta3'al 3ady
		// // System.out.println(tree.toString());
		// tree.insert((Comparable) newvalue, location);
		// // System.out.println(tree.toString());
		// sertable(t);
		// }
		// }
		// // Updating in the tree---------------------
		// } else
		// System.out.println("WRONG TYPE");
		// }
		//
		// }
		// }
		//
		// serpage(p);
		// return;
		// }
		// serpage(p);
		// }

	}

}
