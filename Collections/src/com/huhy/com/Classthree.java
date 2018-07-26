package com.huhy.com;

import java.util.Collection;
import java.util.LinkedList;

import javax.naming.spi.DirStateFactory.Result;

class Col{
	LinkedList<String> getResult(){
		LinkedList<String> result= new LinkedList<String>();
	
		result.add("B");
		result.add("C");
		result.add("D");
		result.add("X");
		result.add("Y");
		result.add("Z");
		result.add("A");
		System.out.println(result);
		
		result.add(1, "A2");
		System.out.println(result);
		
		
		result.removeFirst();
		result.removeLast();
		System.out.println("after removing "+result);
		
		String val =result.get(2);
		result.add(2, val+" changed");
		
		System.out.println("final"+result);
	     return result;
	}
	

}

public class Classthree {

	public static void main(String[] args) {
		Col c = new Col();
		Collection<String> ele = c.getResult();
		
		for (String e : ele) {
			System.out.println(e);
			
		}
		
	}
}
