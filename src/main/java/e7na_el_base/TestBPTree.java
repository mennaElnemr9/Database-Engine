package e7na_el_base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class TestBPTree implements Serializable{

	public static void main(String[] args) 
	{
	
		
		
		BPTree<Integer> tree = new BPTree<Integer>(4,"name","Students");
		Scanner sc = new Scanner(System.in);
		while(true) 
		{
			int x = sc.nextInt();
			if(x == -1)
				break;
			int y = sc.nextInt();
			int z = sc.nextInt();
			Ref ref = new Ref(y, z);
			System.out.println(ref.indexInPage+" "+ref.pageNo);
			tree.insert(x, ref);
			System.out.println(tree.toString());
		}
		while(true) 
		{
			int x = sc.nextInt();
			if(x == -1)
				break;
			int y = sc.nextInt();
			int z = sc.nextInt();
			Ref ref = new Ref(y, z);
			System.out.println(ref.indexInPage+" "+ref.pageNo);
			tree.delete(x,ref);
			System.out.println(tree.toString());
		}
		sc.close();
	}	
}
