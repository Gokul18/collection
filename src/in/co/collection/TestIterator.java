package in.co.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("raju");
		Iterator it = c.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
			// Iterator it =c.iterator();
			// if(it.hashNext()){
			// it.remove();//remove next element
			// }
		}
	}
}
