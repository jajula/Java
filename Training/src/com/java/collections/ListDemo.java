package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> family = new ArrayList();
		
		family.add("Venkat");
		family.add("Hema");
		family.add("Akshay");
		family.add("Mahith");
		family.add("Amma");
		family.add("Nanna");
		family.add("Nagesh");
		
		for(String name : family){
			
			System.out.println("Family Member Name:"+name);		
		}
	}

}
