package com.arraylist;

import java.util.ArrayList;

public class ArrayListClass {
	public static void main(String args[]) {
		// creation of arraylist
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		ArrayList<String> stringArrayList = new ArrayList<String>();

		// adding elements
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);

		arrayList.add(2, 10); // at specified position
		System.out.println("Before Update" + arrayList);

		// update / replace set(index, newValue)
		arrayList.set(2, 11);
		// list can contain duplicate values
		arrayList.set(4, 5);

		// remove elements
		arrayList.remove(2);
		System.out.println("After UPDATE" + arrayList);

		// adding
		stringArrayList.add("abc");
		stringArrayList.add("xyz");
		stringArrayList.add("pqr");

		System.out.println(stringArrayList);

		stringArrayList.remove("abc");
		System.out.println("After remove \n " + stringArrayList);

		stringArrayList.remove(1); // by index
		System.out.println("After remove(index) \n " + stringArrayList);

		System.out.println("length of arraylist " + arrayList.size());

		// looping arraylist
		for (int i = 0; i < arrayList.size(); i++)
			System.out.println(arrayList.get(i));

		int i = 0;
		while (i < arrayList.size()) {
			System.out.println("While loop values " + arrayList.get(i));
			i++;
		}
		// advanced for loop
		for (Integer value : arrayList)
			System.out.println(value);

		// Collections.sort(arrayList);
		System.out.println(arrayList);
	}
}