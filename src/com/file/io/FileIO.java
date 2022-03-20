package com.file.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIO {
	public static void main(String args[]) {
		// createFile();
		// writingToFile();
		// readingFile();
		// getFileInformation();
		deleteFile();
	}

	public static void createFile() {
		File file = new File("C:\\Users\\Hp\\eclipse-workspace\\MyJavaPractice\\file1.txt");
		try {
			if (file.createNewFile()) {
				System.out.println("File created" + file.getName());
			} else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			System.out.println("Error occurred");
			e.printStackTrace();
		}
	}

	public static void getFileInformation() {
		File file = new File("C:\\Users\\Hp\\eclipse-workspace\\MyJavaPractice\\file1.txt");

		if (file.exists()) {
			System.out.println("File Name:" + file.getName());
			System.out.println("Readable:" + file.canRead());
			System.out.println("Writable:" + file.canWrite());
			System.out.println("Path of file:" + file.getAbsolutePath());
			System.out.println("File Size:" + file.length());
		}
	}

	public static void writingToFile() {
		try {
			File file = new File("C:\\Users\\Hp\\eclipse-workspace\\MyJavaPractice\\file1.txt");
			FileWriter fileWriter = new FileWriter(file);
			String contentOfFile = "hey im rutuja. Welcome to bridgelabz";
			fileWriter.write(contentOfFile);
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readingFile() {
		File file = new File("C:\\Users\\Hp\\eclipse-workspace\\MyJavaPractice\\file1.txt");

		try {
			Scanner sc = new Scanner(file);

			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void deleteFile() {
		File file = new File("C:\\Users\\Hp\\eclipse-workspace\\MyJavaPractice\\file1.txt");

		if (file.exists()) {
			if (file.delete())
				System.out.println("File Deleted" + file.getName());
			else
				System.out.println("some problem occurred while deleting...try again");
		}
	}
}
