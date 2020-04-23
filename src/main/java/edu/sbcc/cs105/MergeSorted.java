/**
 * CS 105 Theory & Practice
 * CRN: 62498
 * Assignment: MergeSorted
 *
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 *
 * @author Romina Sobhani, rsobhani@pipeline.sbcc.edu
 */
package edu.sbcc.cs105;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This code is a solution for the MergeSorted assignment.
 *
 */
public class MergeSorted {


	public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b) {
		ArrayList<Integer> sort = new ArrayList<>();
		int indexA=0;
		int indexB=0;



		int sizeA=a.size();
		int sizeB=b.size();
		int leftA=a.size();
		int leftB=b.size();
		int total=0;
		/*if (sizeA==0 && sizeB==0){
			sort.add(0);

		}
		else{*/


		while (leftA!=0 && leftB!=0) {

			if (a.get(indexA) < b.get(indexB)) {
				sort.add(a.get(indexA));
				indexA++;
				leftA--;
			} else if (b.get(indexB) < a.get(indexA)) {
				sort.add(b.get(indexB));
				indexB++;
				leftB--;
			} else if (b.get(indexB) == a.get(indexA)) {
				if (leftA >= leftB) {
					sort.add((a.get(indexA)));
					indexA++;
					leftA--;
				}

			} else {
				sort.add(b.get(indexB));
				indexB++;
				leftB--;
			}
		}
		if (leftA!=0){
			for (int i=indexA;i<sizeA;i++ ){
				sort.add(a.get(i));
				leftA--;
			}
		}
		if(leftB!=0){
			for (int i=indexB; i<sizeB; i++){
				sort.add(b.get(i));
				leftB--;}
			}
		return sort;
			}

			public static void main(String args[]) {
			ArrayList<Integer> x = new ArrayList<>(Arrays.asList(1,2,4,5,5,7));
			ArrayList<Integer> y = new ArrayList<>(Arrays.asList(2,2,4,5,8));
			ArrayList<Integer> sorted = mergeSorted(x,y);
				for (int val: sorted){
					System.out.print(val);
					System.out.print(" ");}
				System.out.println();
					 ArrayList<Integer> z = new ArrayList<>(Arrays.asList(0));
						ArrayList<Integer> f = new ArrayList<>();
						ArrayList<Integer> sorted1 = mergeSorted(z,f);
						for (int val1: sorted1){
							System.out.print(val1);
							System.out.print(" ");
						}
				System.out.println();
						ArrayList<Integer> n = new ArrayList<>(Arrays.asList(0));
							ArrayList<Integer> m = new ArrayList<>(Arrays.asList(1));
							ArrayList<Integer> sorted2 = mergeSorted(n,m);
							for (int val2: sorted2){
								System.out.print(val2);
								System.out.print(" ");
								}
				System.out.println();
						 ArrayList<Integer> l = new ArrayList<>(Arrays.asList(1,2,4,5,5,7));
							ArrayList<Integer> s = new ArrayList<>();
							ArrayList<Integer> sorted3 = mergeSorted(l,s);
							for (int val3: sorted3){
								System.out.print(val3);
								System.out.print(" ");
								}
				System.out.println();
				ArrayList<Integer> h = new ArrayList<>();
				ArrayList<Integer> b = new ArrayList<>();
				ArrayList<Integer> sorted4 = mergeSorted(h,b);
				for (int val4: sorted4){
					System.out.print(val4);
					System.out.print(" ");}
				System.out.println();



		}

	}

