package sorting;

import java.util.Arrays;



public class InsertionSort {

	/*First set 2nd element to be key then arrange change with left side until its arranged in order*/  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={5,1,6,3,2,4};
		int totalLoops=0,key,j;
		System.out.println("INSERTION SORT: ");
		System.out.println("BEFORE SORTING:");
		System.out.println(Arrays.toString(a));
		
		for (int i = 1; i < a.length; i++) {
			key=a[i];
			j=i-1;
			while(j>=0 && a[j]>key){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
		
		System.out.println(" ");
		System.out.println("AFTER SORTING:");
		System.out.println(Arrays.toString(a));
		System.out.println("Total loops: "+ totalLoops);
	}

}
