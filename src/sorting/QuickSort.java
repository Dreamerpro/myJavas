package sorting;

import java.util.Arrays;


public class QuickSort {

	/*Select a pivot then shift elements to left which are smaller and to right which are left*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[]={5,1,6,4,2,3};
		 quickSort(a,0,a.length-1);
	}
	public static void quickSort(int[] a,int l, int r){
		
		int x=partition(a, l, r);
		if(l<x){ quickSort(a, l, x-1); }
		if(x<r){ quickSort(a, x, r); }
		System.out.println(Arrays.toString(a));
	}
	public static int partition(int[] a,int i, int j){
		int l=i,r=j;
		int p=(l+r)/2,temp;
		
		int pivot=a[p];
		while(l<r){
			while(a[l]<pivot){ l++; }
			while(a[r]>pivot){ r--; }
			if(l<=r){
				temp=a[l];
				a[l]=a[r];
				a[r]=temp;
				l++;
				r--;
			}
		}
		System.out.println(Arrays.toString(a));

		return l;
	}
}
