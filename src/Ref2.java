package e7na_el_base;

import java.io.Serializable;
import java.util.Vector;

public class Ref2 implements Serializable{
	Vector<Ref> references ;
	public Ref2(Vector<Ref>r) {
		references=r;
	}
}
