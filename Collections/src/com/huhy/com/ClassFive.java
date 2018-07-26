package com.huhy.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class Five{
	public Collection<String> getResult(){
		ArrayList<String> a1= new ArrayList<>();
		
		a1.add("C");
		a1.add("A");
		a1.add("E");
		a1.add("B");
		a1.add("B");
		a1.add("F");
		
		System.out.println("Original Contents of the list");
		
		Iterator<String> itr = a1.iterator();
		
		while(itr.hasNext())
		{
			String element = itr.next();
			System.out.println(element+" ");
		}
		System.out.println();
		
	
		
		
		return a1;
	}
}

public class ClassFive {

		public static void main(String[] args) {
			Five fi = new Five();
			
			Collection<String> f = fi.getResult();
}
}
