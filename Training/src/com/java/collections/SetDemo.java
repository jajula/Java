package com.java.collections;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> family = new TreeSet();

		family.add("Venkat");
		family.add("Hema");
		family.add("Akshay");
		family.add("Mahith");
		family.add("Amma");
		family.add("Nanna");
		family.add("Nagesh");

		for (String name : family) {

			System.out.println("Family Member Name:" + name);
		}
	}

}
