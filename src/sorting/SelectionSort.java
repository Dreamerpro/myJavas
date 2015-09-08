package sorting;

import java.util.Arrays;

public class SelectionSort {

/*	Find the smallest and put it on top*/
	
	public static int a[]={5,1,6,4,2,3};
	public static void main(String[] args) {
		int min,i,j,temp;
		
		for (i = 0; i < a.length-1; i++) {
			min=i;
			for (j = i+1; j < a.length; j++) {
				if(a[min]>a[j]){
					temp=a[min];
					a[min]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
