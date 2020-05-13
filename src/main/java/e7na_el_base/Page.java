package e7na_el_base;

import java.io.File;
import java.io.IOException;
import java.util.Vector;



public class Page implements java.io.Serializable {
	Vector<Vector> rows;
	
	String name;String location;Object min;Object max;int N;
	
	public Page(String name,String location,Object min,Object max,int N) {
		this.name=name;
		this.location=location;
		this.min=min;
		this.max=max;
		this.N=N;
		rows=new Vector<Vector>();
		 
	}
	public static void main(String[] args) {
		
	}
	public static void createfile(String FileLocation) {
		
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

