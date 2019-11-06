package com.revature.list;

import java.lang.reflect.Array;

public class MyArrayList {
	
	int[] arr;
	
	int newLength;
	
	public void add(int val) {
		int[] tempArray = arr;
		if (arr == null) {
			newLength = 1;
		} else {
			newLength = tempArray.length + 1;
		} 
		int[] newArray = new int[newLength];
		for (int i = 0; i < newArray.length -1; i++) {
			newArray[i] = tempArray[i];
		}
		newArray[newArray.length -1] = val;
		arr = newArray;
		
	}

	public void set(int index, int val) {
		int[] tempArray = arr;
		if (arr == null) {
//			newLength = index;
			arr = new int[index];
			arr[index-1] = val;
			System.out.println("condition1");
		} else if (index > arr.length) {
//			newLength = index;
			int[] extendedArray = new int[index];
			int i = 0;
			while (extendedArray.length <= arr.length) {
				extendedArray[i] = arr[i];
				i++;
			}
			extendedArray[index-1] = val;	
			System.out.println("condition2");
		} else {
			newLength = arr.length + 1;
			int[] extendedArray = new int[newLength];
			int i = 0;
			if (index > 0) {
				while (i < index-1) { //copy values from original array before index
					extendedArray[i] = arr[i];
					i++;
					System.out.println("condition3 while 1");
				}
				
				extendedArray[index-1] = val;
				i = index;
				while (i < arr.length) {
					if (i < extendedArray.length) {
						extendedArray[index -1] = arr[index-1];
						i++;
					}
					System.out.println("condition3 while 2");
				}				
			}
			
		}
	}

	public void remove(int index) {
		
	}

	public int get(int index) {
		// TODO Auto-generated method stub
		// NO NEED TO WRITE BECAUSE IS NOT TESTED
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
}
