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


		/*for (int element:a){
			if(element<b.get(indexB)) {
				sort.add(element);
				indexA++;
			}
			else if(element>=b.get(indexB)) {
				sort.add(b.get(indexB));
				indexB++;
			}*/
		int sizeA=a.size();
		int sizeB=b.size();
		int leftA=a.size();
		int leftB=b.size();
		int total=0;


		while (leftA!=0 && leftB!=0){

			//int A= a.get(indexA);
			//int B= b.get(indexB);
			if (a.get(indexA) <b.get(indexB) ) {
				sort.add(a.get(indexA));
				indexA++;
				leftA--;}

			else if (b.get(indexB) < a.get(indexA)) {
				sort.add(b.get(indexB));
				indexB++;
				leftB--;
			}

			else if (b.get(indexB) == a.get(indexA)) {
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
			}}
		return sort;
			}

			public static void main(String args[]) {
			ArrayList<Integer> x = new ArrayList<>(Arrays.asList(1,2,3,4,5,5,7));
			ArrayList<Integer> y = new ArrayList<>(Arrays.asList(2,2,4,5,8));
			ArrayList<Integer> sorted = mergeSorted(x,y);
				for (int val: sorted){
					System.out.print(val);
					System.out.print(" ");
		}
	}}

