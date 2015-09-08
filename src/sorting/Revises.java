package sorting;

import java.util.Arrays;

public class Revises {


	static int a[]={5,1,6,2,4,3};//{1,2,3,4,5,6};
	public static void main(String[] Args){
		bubblesort(a);
		insertionSort(a);
	}
	public static void bubblesort(int b[]) {
		int noOfChanges=0;
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length-i-1; j++) {
				if(b[j]>b[j+1]){int temp=b[j];b[j]=b[j+1];b[j+1]=temp;noOfChanges++;}
				if(noOfChanges<1){break;}
			}
		}
		//System.out.println(noOfChanges);
	}
	public static void insertionSort(int c[]){
		int noOfforLoops=0,noOfWhileLoops=0;
		int key,j;
		for (int i = 1; i < c.length; i++) {
			key=c[i];
			j=i-1;
			while (j>=0 && c[j]>key) {
				c[j+1]=c[j];	
				j--;
				noOfWhileLoops+=1;
			}
			c[j+1]=key;
			noOfforLoops++;
		}
		System.out.println(noOfforLoops+" :: "+noOfWhileLoops);
		System.out.println("After Sorting by Insertion Sort :"+Arrays.toString(c));
	}
}
