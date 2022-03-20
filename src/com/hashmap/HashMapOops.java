package com.hashmap;

import java.util.HashMap;
import java.util.Map;

class Book {
	int id;
	String name;
	String author;
	int price;
	int year;
	int quantity;

	Book(int id, String name1, String author, int price, int year, int quantity) {
		this.id = id;
		name = name1;
		this.author = author;
		this.price = price;
		this.year = year;
		this.quantity = quantity;
	}

	public String toString() {
		return "Books [Id =" + id + ",Name=" + name + ", Author=" + author + ", Price=" + price + ", Year=" + year
				+ ", Quantity=" + quantity + " ]";
	}
}

public class HashMapOops {
	public static void main(String args[]) {
		HashMap<String, Book> bookList = new HashMap<>(); // 3

		Book book1 = new Book(1, "Java", "xyz", 123, 2022, 3);

		// add in hashmap
		bookList.put("book1", book1);
		bookList.put("book2", new Book(2, "MySql", "Xyz", 103, 2002, 6));

		System.out.println("hashmap values" + bookList);

		for (Map.Entry<String, Book> entry : bookList.entrySet()) {

			Book bookValue = entry.getValue();
			System.out.println("Book info >>>" + entry.getValue());
		}
	}
}
