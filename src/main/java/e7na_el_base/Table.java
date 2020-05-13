package e7na_el_base;

 
	import java.io.File;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.Hashtable;
	import java.util.Vector;

	public class Table implements java.io.Serializable{
		String strTableName;
		String strClusteringKeyColumn;
		Vector<String> pages; //garabooha
		ArrayList<BPTree> Trees;
		ArrayList<RTree> RTrees;
		public Table (String x,String y) {
			strTableName=x;
			strClusteringKeyColumn=y;
			pages =new Vector<String>();
			Trees=new ArrayList<BPTree>();
			RTrees=new ArrayList<RTree>();
					
		}
		public static void createtablefile(String FileLocation) {
			
			 try {
			      File myObj = new File(FileLocation);
			      if (myObj.createNewFile()) {
			        System.out.println("File created: " + myObj.getName());
			      } else {
			        System.out.println("File already exists.");
			      }
			    } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
		}
		
	}


