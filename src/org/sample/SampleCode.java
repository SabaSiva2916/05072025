package org.sample;

import java.util.ArrayList;
import java.util.List;

public class SampleCode {

	public static void main(String[] args) {
		System.out.println("Hello World!!!");
		// create Object for List
		List<String> li = new ArrayList<String>();
		li.add("A");
		li.add("B");
		li.add("C");
		li.add("D");
		li.add("E");
		li.add("F");
		// Iterating list
		for (String string : li) {
			System.out.println(string);
		}

		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}

	}
}
