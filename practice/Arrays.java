package com.practice;
import java.util.*;

public class Array {

	public static void main(String[] args) {
		
		//one dimensional array
		int arr1[] = new int[20];
		for(int i = 0; i < 20; i++)arr1[i] = i;
		for(int i = 0; i < 20; i++)System.out.print(arr1[i] + " ");
		
		System.out.println();
		System.out.println();
		
		//two dimensional array
		int arr2[][] = new int[10][10];	
		for(int i = 0; i < 10; i++) 
		for(int j = 0; j < 10;j++)arr2[i][j] = j;
		
		for(int i = 0; i < 10; i++) {		
			for(int j = 0; j < 10;j++) {
				System.out.print(" " + arr2[i][j]);
			}
			System.out.println();		
		}
		
		System.out.println();
		System.out.println();
		
		
		//jagged arrays
		
		ArrayList<ArrayList<Integer>> arr3 = new ArrayList<ArrayList<Integer>>();
		
		ArrayList<Integer> temp1 = new ArrayList<Integer>();
		
		for(int i = 0; i < 10;i++)temp1.add(i);
		
		arr3.add(temp1);
		
		ArrayList<Integer> temp2 = new ArrayList<Integer>();
		for(int i = 0; i < 5;i++)temp2.add(i);
		
		arr3.add(temp2);
		
		for(int i = 0; i < arr3.size(); i++) {
			
			int n = arr3.get(i).size();
			
			for(int j = 0; j < n; j++) {
				System.out.print(" " + arr3.get(i).get(j));		
			}
			
			System.out.println();
			
		}
	}

}
