package com.huhy.com;

import java.util.Collection;
import java.util.EmptyStackException;
//import java.util.Iterator;
import java.util.Stack;

class Four{
	public Collection<String> getResult(){
		
		Stack<String> adq = new Stack<String>();
		
		adq.push("A");
		adq.push("B");
		adq.push("D");
		adq.push("E");
		adq.push("F");
		
		System.out.println(adq);
		
		System.out.println("popping the stack");
		String str;
		//Iterator<String> itr = adq.iterator();
		try{
		while((str=adq.pop())!=null)
		{
			System.out.println(str+" ");
		}
		}
		catch(EmptyStackException e){
			System.out.println("STACK UNDERFLOW");
		}
		return adq;
	}
}
public class Classfour {

	public static void main(String[] args) {
		
		Four f = new Four();
		
		 f.getResult();

	}
}
