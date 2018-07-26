package com.huhy.com;

import java.util.Collection;
import java.util.HashSet;

class Cacces{
	public HashSet<String> getResult(){
		
		HashSet<String> result = new HashSet<String>();
		
		result.add("cc");
		result.add("hello");
		result.add("bb");
		result.add("dd");
		
		return result;
	}
}

public class MainClass2 {

	public static void main(String[] args) {
		
		Cacces c = new Cacces();
		
		Collection<String> cres = c.getResult();
		
		for(String ele:cres)
		System.out.println(ele);
	}
}
