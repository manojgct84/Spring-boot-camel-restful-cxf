package com.bac.novell.test;

import java.util.Arrays;

public class MyArrayList {

	private Object[] myArray = null;

	private int size = 0;

	public MyArrayList(int arraySize, String string) {
		this.myArray = new Object[arraySize];
		// myArray[0] = string;
	}

	public void insert(String str) {
		if (size <= myArray.length) {
			myArray[size++] = str;
		} else {
			increaseArraySize();
			myArray[size++] = str;
		}
	}

	public void delete(int pos) {
		int arraySize = myArray.length;
		Object obj = null;
		if (pos < arraySize) {
			obj = myArray[pos];
			myArray[pos] = null;
			for (int i = pos; i < arraySize - 1; i++) {
				
				myArray[i] = myArray[i + 1];
			}
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
		System.out.println("Obj:" + obj);
	}

	public void posInsert(int pos, String str) {
		if (pos > myArray.length) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			int arraySize = myArray.length;
			for (int i = arraySize - 1; i < 0; i--) {
				if (pos == i) {
					String temp = (String) myArray[i];
					myArray[i + 1] = temp;
					myArray[pos] = str;
					break;
				} else {
					if (myArray[i] != null) {
						String temp = (String) myArray[i];
						myArray[i + 1] = temp;
					}
				}
			}
			for (int i = 0; i < arraySize; i++) {
				if (myArray[i] != null) {
					System.out.println("MyArray:" + myArray[i].toString());
				}
			}
		}

	}

	private void increaseArraySize() {
		myArray = Arrays.copyOf(myArray, myArray.length * 2);
	}

	public static void main(String[] args) {
		MyArrayList myArrayList = new MyArrayList(10, "First");

		myArrayList.insert("Manoj");
		myArrayList.insert("Kumar");
		myArrayList.insert("Deepa");
		myArrayList.insert("Mangani");
		myArrayList.insert("Manojkumar");
		myArrayList.posInsert(2, "Kishore");
		myArrayList.delete(3);
	}

}
