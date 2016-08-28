package in.co.slides;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {
	 public static void main(String[] args) {

	        
	        ArrayList list =  new ArrayList();
	        list.add("Basanti-> Kahan  jana hai ");
	        list.add("Jay-> Ramgdh jana hai  ");
	        list.add("Basanti-> yuki Basanti ko jada bate karne ki aadat to hai nehai..");
	        list.add("Basanti-> isaliye  2 rupay lagaga ");
	        list.add("Viru-> Tuhara  nam kya hai basanti " );
	        
	        // Get an iterator from List
		Iterator it = list.iterator();
	        
	        System.out.println("From Iterator ");
	        
	        //Check if Iterator has next element
	        while (it.hasNext()) {
	            //Get next element
	            System.out.println(it.next());
	        }
	    }

	}

